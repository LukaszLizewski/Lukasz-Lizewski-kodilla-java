package com.kodilla.temp;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main (String args []){
        Array.getList().stream()
                .map(String::toUpperCase)
                .forEach(System.out::println);

    }
}
