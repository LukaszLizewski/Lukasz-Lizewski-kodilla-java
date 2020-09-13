package com.kodilla.good.patterns.challenges.quest_2;

import java.util.List;
import java.util.stream.Collectors;

public class SearchEngine {
    public void departureSearchEngine(Flights flights, String city) {
        String departure = flights.getListOfRoutes().stream()
                .filter(e -> e.getArrivalCity().equals(city))
                .map(City::getDepartureCity)
                .collect(Collectors.joining("; "));
        System.out.println("The cities from which you can fly to "+ city+ " from are: "+departure);
    }
    public void arrivalSearchEngine(Flights flights, String city) {
        String arrival = flights.getListOfRoutes().stream()
                .filter(e -> e.getDepartureCity().equals(city))
                .map(City::getArrivalCity)
                .collect(Collectors.joining("; "));
        System.out.println('\n'+"The cities you can fly to from " + city +" are: "+ arrival);
    }
    public void throughSearchEngine(Flights flights, String departureCity, String arrivalCity, String transitCity) {
        List trip1 = flights.getListOfRoutes().stream()
                .filter(e-> e.getDepartureCity().equals(departureCity) && e.getArrivalCity().equals(transitCity))
                //.filter(e-> e.getDepartureCity().equals(transitCity))
                .collect(Collectors.toList());
        System.out.println('\n'+"Trip one:"+ trip1.toString());

        List trip2 = flights.getListOfRoutes().stream()
                .filter(e-> e.getDepartureCity().equals(transitCity) && e.getArrivalCity().equals(arrivalCity))
                //.filter(e-> e.getDepartureCity().equals(transitCity))
                .collect(Collectors.toList());
        System.out.println("Trip two:"+ trip2.toString());



        /*System.out.println('\n' +"Departure city " + departureCity + '\n' +
                "Arrival city: " + arrivalCity + '\n' +
                "Transfer city: " + through);*/
    }

}











