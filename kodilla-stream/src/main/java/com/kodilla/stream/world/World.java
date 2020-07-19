package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public final class World {
    private final String planetName;
    private final List<Continent> listOfContinents = new ArrayList<>();
    public World(final String planetName) {
        this.planetName = planetName;
    }
    public String getPlanetName() {
        return planetName;
    }
    public void addContinent(Continent continent){
        listOfContinents.add(continent);
    }
    public List<Continent> getListOfContinents() {
        return new ArrayList<>(listOfContinents);
    }
    public BigDecimal getPeopleQuantity(){
        return  listOfContinents.stream()
                .flatMap(continent -> continent.getListOfCountries().stream())
                .map(Country::getPeopleQuantity)
                .reduce(BigDecimal.ZERO, (sum, current) -> sum = sum.add(current));
    }
}
