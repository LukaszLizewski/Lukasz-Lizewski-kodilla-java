package com.kodilla.good.patterns.challenges.quest_2;

public class Flights {
    public void routes(){
        City newYork = new City("New York");
        City losAngeles = new City("Los Angeles");
        City chicago = new City("Chicago");
        City phoenix = new City("Phoenix");
        City philadelphia = new City("Philadelphia[");
        City sanDiego = new City("San Diego");
        City dallas = new City("Dallas");
        City sanJose = new City("San Jose");
        City austin = new City("Austin");
        City columbus = new City("Columbus");

        newYork.addConnection(losAngeles);
        newYork.addConnection(chicago);
        newYork.addConnection(sanDiego);
        newYork.addConnection(sanJose);
        newYork.addConnection(columbus);
        losAngeles.addConnection(newYork);
        losAngeles.addConnection(phoenix);
        losAngeles.addConnection(austin);
        chicago.addConnection(dallas);
        chicago.addConnection(philadelphia);
        chicago.addConnection(losAngeles);
        phoenix.addConnection(philadelphia);
        phoenix.addConnection(sanDiego);
        phoenix.addConnection(sanJose);
        philadelphia.addConnection(newYork);
        philadelphia.addConnection(chicago);
        philadelphia.addConnection(columbus);
        sanDiego.addConnection(newYork);
        dallas.addConnection(sanDiego);
        dallas.addConnection(losAngeles);
        sanJose.addConnection(newYork);
        sanJose.addConnection(austin);
        austin.addConnection(philadelphia);
        austin.addConnection(phoenix);
        austin.addConnection(dallas);
        columbus.addConnection(sanDiego);

    }
}
