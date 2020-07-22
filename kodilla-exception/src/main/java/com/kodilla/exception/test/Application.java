package com.kodilla.exception.test;

public class Application {
    public static void main(String[] args) {
        Flight flight = new Flight("VLC","NULL");
        FlightSearchEngine flightSearchEngine = new FlightSearchEngine();
        try {
            flightSearchEngine.findFight(flight);
        } catch (RouteNotFoundException s){
            System.out.println(s);
        } finally {
            System.out.println("Polish Airlines wish you a successful flight");
        }
    }
}
