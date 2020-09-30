package com.kodilla.extra.checkers;

public class Application {
    public static void main(String args[]) {
        Board board = new Board();
        board.setRows();
        board.setFigure(0,0,new Figure("WHITE","PAWN"));
        board.setFigure(1,1,new Pawn("WHITE","PAWN"));
        board.setFigure(3,2,new Pawn("WHITE","PAWN"));
        board.setFigure(3,2,new Nones("NONE","NONE"));
        board.setFigure(6,6,new Queen("BLACK","QUEEN"));
        board.setFigure(7,7,new Queen("BLACK","QUEEN"));
        board.setFigure(0,3,new Queen("BLACK","QUEEN"));

        Figure result1 = board.getFigure(1, 1);
        Figure result2 = board.getFigure(7, 7);
        Figure result3 = board.getFigure(3, 2);

        System.out.println("Result no 1 type of figure :" + result1.getNameOfFigure());
        System.out.println("Result no 1 type of color :" + result1.getColor());
        System.out.println("Result no 2 type of figure :" + result2.getNameOfFigure());
        System.out.println("Result no 2 type of color :" + result2.getColor());
        System.out.println("Result no 3 type of figure :" + result3.getNameOfFigure());
        System.out.println("Result no 3 type of color :" + result3.getColor());
        System.out.println(board.toString());

    }
}
