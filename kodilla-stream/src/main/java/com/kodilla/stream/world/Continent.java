package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public final class Continent {
    private final String continentName;
   // private final Country country;
    private final List<Country> listOfCountries = new ArrayList<>();
    public Continent(final String continentName/*, final Country country*/) {
        this.continentName = continentName;
        /*this.country = country;*/
    }
    public String getContinentName() {
        return continentName;
    }
    public void addCountry(Country country){
        listOfCountries.add(country);
    }
    public List<Country> getListOfCountries() {
        return new ArrayList<>(listOfCountries);
    }
    public List<BigDecimal> getQuantityOfCountries() {
        return listOfCountries.stream()
                .map(Country::getPeopleQuantity)
                .collect(Collectors.toList());
    }
}
