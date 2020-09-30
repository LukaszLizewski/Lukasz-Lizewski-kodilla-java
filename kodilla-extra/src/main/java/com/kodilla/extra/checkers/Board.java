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
    private List<BoardRow> boardRows = new ArrayList<>();

    public void setRows(){
        BoardRow boardRow0 = new BoardRow();
        boardRow0.setNones();
        BoardRow boardRow1 = new BoardRow();
        boardRow1.setNones();
        BoardRow boardRow2 = new BoardRow();
        boardRow2.setNones();
        BoardRow boardRow3 = new BoardRow();
        boardRow3.setNones();
        BoardRow boardRow4 = new BoardRow();
        boardRow4.setNones();
        BoardRow boardRow5 = new BoardRow();
        boardRow5.setNones();
        BoardRow boardRow6 = new BoardRow();
        boardRow6.setNones();
        BoardRow boardRow7 = new BoardRow();
        boardRow7.setNones();
        boardRows.add(0,boardRow0);
        boardRows.add(1,boardRow1);
        boardRows.add(2,boardRow2);
        boardRows.add(3,boardRow3);
        boardRows.add(4,boardRow4);
        boardRows.add(5,boardRow5);
        boardRows.add(6,boardRow6);
        boardRows.add(7,boardRow7);
    }
    public Figure getFigure (int row, int col){
        if (row >=MIN_NO_OF_FIELD && row <=MAX_NO_OF_FIELD && col >=MIN_NO_OF_FIELD && col <=MAX_NO_OF_FIELD){
            BoardRow resultBoardRow = boardRows.get(row);
            return resultBoardRow.getBoardRowList().get(col);
        } else {
            System.out.println("Given wrong position!");     //exception
            return null;
        }
    }
    public void setFigure(int row, int col, Figure figure){
        if (row >=MIN_NO_OF_FIELD && row <=MAX_NO_OF_FIELD && col >=MIN_NO_OF_FIELD && col <=MAX_NO_OF_FIELD){
            BoardRow resultBoardRow = boardRows.get(row);
            resultBoardRow.getBoardRowList().remove(col);
            if (figure.getNameOfFigure().equals(QUEEN) || figure.getNameOfFigure().equals(PAWN) || figure.getNameOfFigure().equals(NONE)) {
                resultBoardRow.getBoardRowList().add(col, new Queen(figure.getColor(), figure.getNameOfFigure()));
            } else {
                System.out.println("Wrong figure");
            }
        } else {
            System.out.println("Given wrong position!");    //exception
        }
    }
    public String  toString(){

        String result = "||"+ boardRows.get(0).getBoardRowList().stream()
                .map(e->e.toString())
                .collect(Collectors.joining("|")) + "||" + "\n" +
                "||"+ boardRows.get(1).getBoardRowList().stream()
                .map(e->e.toString())
                .collect(Collectors.joining("|")) + "||" + "\n" +
                "||"+ boardRows.get(2).getBoardRowList().stream()
                .map(e->e.toString())
                .collect(Collectors.joining("|"))+ "||" + "\n" +
                "||"+ boardRows.get(3).getBoardRowList().stream()
                .map(e->e.toString())
                .collect(Collectors.joining("|"))+ "||" + "\n" +
                "||"+ boardRows.get(4).getBoardRowList().stream()
                .map(e->e.toString())
                .collect(Collectors.joining("|"))+ "||" + "\n" +
                "||"+ boardRows.get(5).getBoardRowList().stream()
                .map(e->e.toString())
                .collect(Collectors.joining("|")) + "||" + "\n" +
                "||"+ boardRows.get(6).getBoardRowList().stream()
                .map(e->e.toString())
                .collect(Collectors.joining("|")) + "||" + "\n" +
                "||"+ boardRows.get(7).getBoardRowList().stream()
                .map(e->e.toString())
                .collect(Collectors.joining("|")) + "||" ;
        return result;
    }
}

