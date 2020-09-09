package com.kodilla.good.patterns.challenges.quest_2;

public class Application {
    public static void main (String [] args) {
        Flights flights = new Flights();
        FlightsFromCity flightsFromCity = new FlightsFromCity();
        flightsFromCity.find("New York");


    }
}
