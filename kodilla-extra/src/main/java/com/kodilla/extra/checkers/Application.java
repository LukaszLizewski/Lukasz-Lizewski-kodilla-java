package com.kodilla.extra.checkers;

public class Application {
    public static void main(String [] args) {
        Board board = new Board();
        Logic logic = new Logic(board);
        board.setRows();


        board.setFigure(3,3,new Figure("BLACK","PAWN"));
        board.setFigure(5,5,new Figure("WHITE","PAWN"));
        System.out.println(board.toString());
        logic.computer();
        board.moveFigure(5,5,4,4);
        System.out.println(board.toString());
        logic.computer();
        System.out.println(board.toString());







    }
}
