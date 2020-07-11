package com.kodilla.testing.collection;

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
        System.out.println("testOddNumbersExterminatorEmptyList");
        ArrayList<Integer> emptyTestList = new ArrayList<>();
        //Given
        OddNumbersExterminator oddNumbers = new OddNumbersExterminator();
        //When
        List<Integer> result = oddNumbers.exterminate(emptyTestList);
        //Then
        Assert.assertEquals(emptyTestList, result);
    }
    @Test
    public void testOddNumbersExterminatorNormalList() {
        System.out.println("testOddNumbersExterminatorNormalList");
        ArrayList<Integer> testList = new ArrayList<>();
        ArrayList<Integer> oddTestList = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            testList.add(i);
            if (i % 2 == 0) {
                oddTestList.add(i);
            }
        }
        //Given
        OddNumbersExterminator oddNumbers = new OddNumbersExterminator();
        //When
        List<Integer> result = oddNumbers.exterminate(testList);
        //Then
        Assert.assertEquals(oddTestList, result);
    }
}