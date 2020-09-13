package com.kodilla.good.patterns.challenges.quest_2;

import java.util.ArrayList;
import java.util.List;

public class Flights {
        public List<City> getListOfRoutes() {
        City routes1 = new City("New York","Los Angeles" );
        City routes2 = new City("Los Angeles","New York");
        City routes3 = new City("Chicago","Phoenix");
        City routes4 = new City("Phoenix","New York");
        City routes5 = new City("Austin","Los Angeles");
        City routes6 = new City("San Diego","New York");
        City routes7 = new City("San Diego","Austin");
        City routes8 = new City("Philadelphia","Austin");
        City routes9 = new City("Los Angeles","Chicago");
        City routes10 = new City("Chicago","San Diego");
        City routes11 = new City("New York","San Diego");
        List<City> listOfRoutes= new ArrayList<>();
        listOfRoutes.add(routes1);
        listOfRoutes.add(routes2);
        listOfRoutes.add(routes3);
        listOfRoutes.add(routes4);
        listOfRoutes.add(routes5);
        listOfRoutes.add(routes6);
        listOfRoutes.add(routes7);
        listOfRoutes.add(routes8);
        listOfRoutes.add(routes9);
        listOfRoutes.add(routes10);
        listOfRoutes.add(routes11);
        return listOfRoutes;
    }
}
