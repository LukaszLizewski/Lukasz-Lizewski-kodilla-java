package com.kodilla.good.patterns.challenges.quest_1;

public class Application {
    public static void main (String [] args) {
        Order order = new Order("eggs",SupplierFactory.EXTRA_FOOD_SHOP);
        Wholesale wholesale = new Wholesale();
        boolean result = wholesale.processOrder(order);
        System.out.println(result);
    }
}
