package com.kodilla.good.patterns.challenges.quest_2;

public class Application {
    public static void main (String [] args) {
        SearchEngine search = new SearchEngine();
        Flights flights = new Flights();
        flights.getListOfRoutes();
        search.departureSearchEngine(flights,"New York");
        search.arrivalSearchEngine(flights,"Austin");
        search.throughSearchEngine(flights,"Los Angeles", "San Diego","New York");
    }
}
