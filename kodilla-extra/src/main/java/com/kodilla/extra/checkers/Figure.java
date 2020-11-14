package com.kodilla.extra.checkers;

public class Figure {
    private final String BLACK_COLOR = "BLACK";
    private final String WHITE_COLOR = "WHITE";
    private final String QUEEN = "QUEEN";
    private final String PAWN = "PAWN";
    private final String NONE = "NONE";
    private String color;
    private String nameOfFigure;
    public Figure (String color, String nameOfFigure) {
        if (color.equals(BLACK_COLOR) || color.equals(WHITE_COLOR) || color.equals(NONE)) {
            this.color = color;
        } else {
            System.out.println("Wrong COLOR!"); //exception
        }
        if (nameOfFigure.equals(QUEEN) || nameOfFigure.equals(PAWN) || nameOfFigure.equals(NONE)) {
            this.nameOfFigure = nameOfFigure;
        } else {
            System.out.println("Wrong FIGURE!"); //exception
        }
    }
    public String getNameOfFigure () {
        return nameOfFigure;
    }
    public String getColor () {
        return color;
    }
    public String toMark () {
        if (color.equals(BLACK_COLOR) && nameOfFigure.equals(QUEEN)) {
            return "bQ";
        } if (color.equals(WHITE_COLOR) && nameOfFigure.equals(QUEEN)) {
            return "wQ";
        } if (color.equals(BLACK_COLOR) && nameOfFigure.equals(PAWN)) {
            return "bP";
        } if (color.equals(WHITE_COLOR) && nameOfFigure.equals(PAWN)) {
            return "wP";
        } else {
            return "__";
        }
    }
}
