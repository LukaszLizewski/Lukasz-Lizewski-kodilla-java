package com.kodilla.extra.checkers;

import java.util.ArrayList;
import java.util.List;

public class BoardRow {
    private List<Figure> boardRowList = new ArrayList<>();
    public List<Figure> getBoardRowList () {
        return boardRowList;
    }
    public void setNones () {
        for (int i = 0; i<=7; i++) {
            boardRowList.add(i,new Figure("NONE", "NONE"));
        }
    }
}
