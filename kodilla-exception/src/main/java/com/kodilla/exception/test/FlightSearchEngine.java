package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FlightSearchEngine {
    public void findFight(Flight flight) throws RouteNotFoundException {
        Map<String, Boolean> listOfAirports = new HashMap<>();
        listOfAirports.put("GDA", true);
        listOfAirports.put("WAW", false);
        listOfAirports.put("BKK", true);
        listOfAirports.put("JFK", false);
        listOfAirports.put("VLC", true);
        listOfAirports.put("MAD", false);
        listOfAirports.put("BCN", false);
        listOfAirports.put("TRS", true);
        listOfAirports.put("DXB", false);
        listOfAirports.put("LAX", true);
        if (listOfAirports.containsKey(flight.getArrivalAirport())) {
            if(listOfAirports.get(flight.getArrivalAirport())){
                System.out.println("Flight is available");
            } else {
                System.out.println("Flight is unavailable");
            }
        } else {
            throw new RouteNotFoundException("Destination airport was not found");
        }
    }
}



