package com.kodilla.extra.checkers;

public class Logic {
    private final String BLACK = "BLACK";
    private final String WHITE = "WHITE";
    private final String NONE = "NONE";
    private Board board;
    public Logic(Board board) {
        this.board = board;
    }
    public void setBoard (Board board) {
        this.board = board;
    }
    public void computer () {
        if (board.isPlayerTurn()){
            System.out.println("Player's turn");
        } else {
            System.out.println("Computers's turn");
            computerLogic();
            board.setPlayerTurn(true);
        }
    }
    private void computerLogic () {
        System.out.println("computer_Logic");
        checkToHit();
        minimaxAlgorithm();
    }
    public void minimaxAlgorithm () {
        System.out.println("computer_minimax");
    }
    private void checkToHit () {
        System.out.println("computer_tryToHit");
        for (int row=0; row<=7; row++){
            for (int col=0; col<=7; col++){
                if (board.getFigure(row,col).getColor().equals(BLACK) && !board.isPlayerTurn()){
                    System.out.println("computer_Found BLACK on position row: " + row + " col: " + col);
                    tryToHit(row,col);
                }
            }
        }
    }
    private void tryToHit (int row, int col) {
        if (board.getFigure(row+1,col+1).getColor().equals(WHITE) &&
                board.getFigure(row+1+1,col+1+1).getColor().equals(NONE)) {
            board.moveFigure(row, col, row+1+1, col+1+1);
            board.setFigure(row+1, col+1, new Figure(NONE, NONE));
        } else if (board.getFigure(row+1,col-1).getColor().equals(WHITE) &&
                board.getFigure(row+1+1,col-1-1).getColor().equals(NONE)) {
            board.moveFigure(row, col, row+1+1, col-1-1);
            board.setFigure(row+1, col-1, new Figure(NONE, NONE));
        } else if (board.getFigure(row-1,col-1).getColor().equals(WHITE) &&
                board.getFigure(row-1-1,col-1-1).getColor().equals(NONE)) {
            board.moveFigure(row, col, row-1-1, col-1-1);
            board.setFigure(row-1, col-1, new Figure(NONE, NONE));
        } else if (board.getFigure(row-1,col+1).getColor().equals(WHITE) &&
                board.getFigure(row-1-1,col+1+1).getColor().equals(NONE)) {
            board.moveFigure(row, col, row-1-1, col+1+1);
            board.setFigure(row - 1, col+1, new Figure(NONE, NONE));
        }
    }
}
