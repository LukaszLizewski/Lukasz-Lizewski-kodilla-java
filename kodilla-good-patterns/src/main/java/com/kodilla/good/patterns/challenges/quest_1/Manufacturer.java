package com.kodilla.good.patterns.challenges.quest_1;

import java.util.ArrayList;
import java.util.List;

public class Manufacturer implements Process{
    private String nameOfManufacturer;
    private ArrayList listOfProducts;
    public Manufacturer (String nameOfManufacturer, ArrayList listOfProducts) {
        this.nameOfManufacturer=nameOfManufacturer;
        this.listOfProducts=listOfProducts;
    }
    public String getNameOfManufacturer () {
        return nameOfManufacturer;
    }
    public ArrayList getListOfProducts () {
        return listOfProducts;
    }
    public boolean process (){
        System.out.println("name: "+nameOfManufacturer + " uruchomiono proces identyczny dla każdego dostawcy, true oznacza:zrealizowano");
        return true;
    }
}

