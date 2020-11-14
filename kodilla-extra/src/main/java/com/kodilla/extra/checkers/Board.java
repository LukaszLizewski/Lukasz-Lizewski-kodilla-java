package com.kodilla.extra.checkers;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Board {
    private final int MIN_NO_OF_FIELD = 0;
    private final int MAX_NO_OF_FIELD = 7;
    private final String QUEEN = "QUEEN";
    private final String PAWN = "PAWN";
    private final String NONE = "NONE";
    private final String BLACK = "BLACK";
    private final String WHITE = "WHITE";
    private List<BoardRow> boardRows = new ArrayList<>();
    private boolean isPlayerTurn= true;
    public void setRows () {
        for ( int i = 0; i<=7; i++){
            BoardRow boardRow = new BoardRow();
            boardRow.setNones();
            boardRows.add(i,boardRow);
        }
    }
    public void setFirstPosition () {
        int row;
        int col;
        for (row = 0; row<=2; row=row+2){
            for (col = 0; col <=6; col = col+2){
                setFigure(row,col, new Figure(BLACK,PAWN));
            }
        }
        row=6;
        for (col = 0; col <=6; col = col+2){
            setFigure(row,col, new Figure(WHITE,PAWN));
        }
        for (row = 5; row<=7; row=row+2){
            for (col = 1; col <=7; col = col+2){
                setFigure(row,col, new Figure(WHITE,PAWN));
            }
        }
        row=1;
        for (col = 1; col <=7; col = col+2){
            setFigure(row,col, new Figure(BLACK,PAWN));
        }
    }
    public Figure getFigure (int row, int col) {
        if (row >=MIN_NO_OF_FIELD && row <=MAX_NO_OF_FIELD && col >=MIN_NO_OF_FIELD && col <=MAX_NO_OF_FIELD){
            BoardRow resultBoardRow = boardRows.get(row);
            return resultBoardRow.getBoardRowList().get(col);
        } else {
            System.out.println("Given wrong position!!");     //exception
            return null;
        }
    }
    public void setFigure (int row, int col, Figure figure) {
        if (row >=MIN_NO_OF_FIELD && row <=MAX_NO_OF_FIELD && col >=MIN_NO_OF_FIELD && col <=MAX_NO_OF_FIELD){
            BoardRow resultBoardRow = boardRows.get(row);
            resultBoardRow.getBoardRowList().remove(col);
            if (figure.getNameOfFigure().equals(QUEEN) || figure.getNameOfFigure().equals(PAWN) || figure.getNameOfFigure().equals(NONE)) {
                resultBoardRow.getBoardRowList().add(col, new Figure(figure.getColor(), figure.getNameOfFigure()));
            } else {
                System.out.println("Wrong figure");
            }
        } else {
            System.out.println("Given wrong position!!");
        }
    }
    public void moveFigure (int rowFrom, int colFrom, int rowTo, int colTo){
        setFigure(rowTo, colTo, getFigure(rowFrom, colFrom));
        setFigure(rowFrom, colFrom, new Figure(NONE, NONE));
        setPlayerTurn(!isPlayerTurn);
    }
    public void hitFigure (int rowFrom, int colFrom, int rowTo, int colTo){
        setFigure(rowTo, colTo, getFigure(rowFrom, colFrom));
        setFigure(rowFrom, colFrom, new Figure(NONE, NONE));
    }
    public String toString () {
        String s = "";
        for (int row=0; row<8; row++)
            s+=rowToString(row);
        return s;
    }

    private String rowToString(int i) {
        return "||" + boardRows.get(i).getBoardRowList().stream()
                .map(Figure::toMark)
                .collect(Collectors.joining("|")) + "||" + "\n";
    }
    public boolean isPlayerTurn() {
        return isPlayerTurn;
    }
    public void setPlayerTurn(boolean playerTurn) {
        this.isPlayerTurn = playerTurn;
    }
}

