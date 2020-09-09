package com.kodilla.good.patterns.challenges.quest_1;

public class Application {
    public static void main (String [] args) {
        NewManufacturer newManufacturer = new NewManufacturer();
        newManufacturer.addManufacturer();

        Manufacturer supplier = newManufacturer.getExtraFoodShop();
        System.out.println(supplier.process());
        String name  = supplier.getNameOfManufacturer();
        System.out.println("name of supplier: " + name);
        Object list = supplier.getListOfProducts().get(2);
        System.out.println(list.toString());
    }
}
