package com.kodilla.stream.array;

import org.junit.Assert;
import org.junit.Test;

public class ArrayOperationsTestSuite {
    @Test
    public void ArrayOperationTestSuite(){
        //Given
        TableMaker tableMaker = new TableMaker(20,1,1);
        int [] table= tableMaker.getTable();
        //When
        double result = ArrayOperations.getAverage(table);
        //Then
        Assert.assertEquals(10.5,result,0.1);
        }

    }

