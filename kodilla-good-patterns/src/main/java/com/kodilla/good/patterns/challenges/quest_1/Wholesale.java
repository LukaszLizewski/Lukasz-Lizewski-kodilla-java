package com.kodilla.good.patterns.challenges.quest_1;



public class Wholesale {
    public boolean processOrder (Order order){
        return SupplierFactory.getSupplier(order.getSupplier()).process(order.getProductName());
    }
}
