package com.kodilla.good.patterns.challenges.quest_2;

public class City {
    private String departureCity;
    private String arrivalCity;

    public City(String departureCity, String arrivalCity) {
        this.departureCity = departureCity;
        this.arrivalCity = arrivalCity;
    }
    public String getDepartureCity() {
        return departureCity;
    }
    public String getArrivalCity() {
        return arrivalCity;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof City)) return false;

        City city = (City) o;

        if (!departureCity.equals(city.departureCity)) return false;
        return arrivalCity.equals(city.arrivalCity);
    }
    @Override
    public int hashCode() {
        int result = departureCity.hashCode();
        result = 31 * result + arrivalCity.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "departure from city ->" + departureCity +"; "+
                "arrival to City ->" + arrivalCity ;
    }
}

