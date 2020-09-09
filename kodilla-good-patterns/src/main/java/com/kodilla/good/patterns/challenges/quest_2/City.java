package com.kodilla.good.patterns.challenges.quest_2;

import java.util.ArrayList;

public class City {
    private String nameOfCity;
    private ArrayList connection;

    public City(String nameOfCity) {
        this.nameOfCity = nameOfCity;
    }
    public String getNameOfCity() {
        return nameOfCity;
    }
    public ArrayList getConnection() {
        return connection;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof City)) return false;

        City city = (City) o;

        return nameOfCity.equals(city.nameOfCity);
    }
    @Override
    public int hashCode() {
        return nameOfCity.hashCode();
    }
    public void addConnection (City city){
        connection.add(city);
    }
}

