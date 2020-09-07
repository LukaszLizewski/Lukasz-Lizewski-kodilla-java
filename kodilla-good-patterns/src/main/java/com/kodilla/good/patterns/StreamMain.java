package com.kodilla.good.patterns;

import com.kodilla.good.patterns.challenges.MovieStore;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


public class StreamMain {
    public static void main(String[] args) {
        MovieStore movieStore = new MovieStore();
        String result = movieStore.getMovies().entrySet().stream()
                .flatMap(e -> e.getValue().stream())
                .collect(Collectors.joining("!"));
        System.out.println(result);

        String myResult= movieStore.getMovies().entrySet().stream()
                .flatMap(e->e.getValue().stream())
                .collect(Collectors.joining("!"));

        System.out.println(myResult);




    }
}
