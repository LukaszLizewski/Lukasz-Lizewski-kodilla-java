package com.kodilla.testing.collection;
import java.util.*;

public class OddNumbersExterminator {
    public List<Integer> exterminate (ArrayList<Integer> numbers) {
        List<Integer> evenNumbers = new ArrayList<>();
        for (Integer evenNumber : numbers) {
            if (evenNumber % 2 == 0) {
                evenNumbers.add(evenNumber);
            }
        }
        for (Integer spr:evenNumbers){
            System.out.println("SPR"+spr);
        }
        return evenNumbers;
    }
}


