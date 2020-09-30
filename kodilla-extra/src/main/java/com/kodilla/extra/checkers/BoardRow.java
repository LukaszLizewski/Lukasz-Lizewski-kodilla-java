package com.kodilla.extra.checkers;

import java.util.ArrayList;
import java.util.List;

public class BoardRow {
    private List<Figure> boardRowList = new ArrayList<>();
    public List<Figure> getBoardRowList() {
        return boardRowList;
    }
    public void setNones(){
        Nones none0 = new Nones("NONE","NONE");
        Nones none1 = new Nones("NONE","NONE");
        Nones none2 = new Nones("NONE","NONE");
        Nones none3 = new Nones("NONE","NONE");
        Nones none4 = new Nones("NONE","NONE");
        Nones none5 = new Nones("NONE","NONE");
        Nones none6 = new Nones("NONE","NONE");
        Nones none7 = new Nones("NONE","NONE");
        boardRowList.add(0,none0);
        boardRowList.add(1,none1);
        boardRowList.add(2,none2);
        boardRowList.add(3,none3);
        boardRowList.add(4,none4);
        boardRowList.add(5,none5);
        boardRowList.add(6,none6);
        boardRowList.add(7,none7);
    }
}
