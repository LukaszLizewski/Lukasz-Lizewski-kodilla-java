package com.kodilla.testing.collection;
import com.kodilla.testing.collection.OddNumbersExterminator;

import java.util.*;
import org.junit.*;

public class CollectionTestSuite {
    @Before
    public void before() {
        System.out.println("Test Case: begin");
    }
    @After
    public void after() {
        System.out.println("Test Case: after");
    }
    @Test
    public void testOddNumbersExterminatorEmptyList() {
        ArrayList<Integer> emptyTestList = new ArrayList<>();
        OddNumbersExterminator oddNumbers = new OddNumbersExterminator();
        List<Integer> result = oddNumbers.exterminate(emptyTestList);
        Assert.assertEquals(emptyTestList, result);
    }
    @Test
    public void testOddNumbersExterminatorNormalList() {
        ArrayList<Integer> testList = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            if (i % 2 == 0) {
                testList.add(i);
            }
        }
        OddNumbersExterminator oddNumbers = new OddNumbersExterminator();
        List<Integer> result = oddNumbers.exterminate(testList);
        Assert.assertEquals(testList, result);
    }
}