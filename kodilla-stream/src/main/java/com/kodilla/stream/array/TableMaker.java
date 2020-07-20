package com.kodilla.stream.array;

import java.util.ArrayList;
import java.util.List;

public final class TableMaker {
    private final int arraySize;
    private final int firstValue;
    private final int increment;

    public TableMaker(final int arraySize,final int firstValue,final int increment) {
        this.arraySize = arraySize;
        this.firstValue = firstValue;
        this.increment = increment;
    }
    public int[] getTable(){
        int table[] = new int [arraySize];
        for (int i=0; i<arraySize; i++){
            table[i]=firstValue+i*increment;
        }
        return table;
    }
}
