package com.kodilla.good.patterns.challenges.quest_1;

import java.util.ArrayList;

public class NewManufacturer {

    private Manufacturer extraFoodShop;
    private Manufacturer healthyShop;
    private Manufacturer glutenFreeShop;

    public void addManufacturer() {

        ArrayList<Product> extraFoodShopList  = new ArrayList<>();
        ArrayList<Product> healthyShopList = new ArrayList<>();
        ArrayList<Product> glutenFreeShopList = new ArrayList<>();

        Product egs = new Product("egs", 10, "pieces");
        Product bananas = new Product("bananas", 10, "kg");
        Product tomatoes = new Product("tomatoes", 10, "kg");
        Product potatoes = new Product("potatoes", 10, "kg");
        Product apples = new Product("apples", 10, "kg");
        Product grapes = new Product("grapes", 10, "kg");
        Product bred = new Product("bred", 10, "pieces");
        Product milk = new Product("milk", 10, "litre");
        Product water = new Product("water", 10, "litre");

        extraFoodShopList.add(egs);
        extraFoodShopList.add(bananas);
        extraFoodShopList.add(tomatoes);
        healthyShopList.add(potatoes);
        healthyShopList.add(apples);
        healthyShopList.add(grapes);
        glutenFreeShopList.add(bred);
        glutenFreeShopList.add(milk);
        glutenFreeShopList.add(water);

        extraFoodShop = new Manufacturer("ExtraFoodShop", extraFoodShopList);
        healthyShop = new Manufacturer("HealthyShop", healthyShopList);
        glutenFreeShop = new Manufacturer("GlutenFreeShop", glutenFreeShopList);
    }
    public Manufacturer getExtraFoodShop() {
        return extraFoodShop;
    }
    public Manufacturer getHealthyShop() {
        return healthyShop;
    }
    public Manufacturer getGlutenFreeShop() {
        return glutenFreeShop;
    }
}

