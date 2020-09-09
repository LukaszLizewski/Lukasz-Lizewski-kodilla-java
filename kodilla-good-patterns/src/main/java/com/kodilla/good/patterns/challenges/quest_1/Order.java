package com.kodilla.good.patterns.challenges.quest_1;

public class Order {
    private String productName;
    private String supplier;

    public Order(String productName, String supplier) {
        this.productName = productName;
        this.supplier = supplier;
    }
    public String getProductName() {
        return productName;
    }

    public String getSupplier() {
        return supplier;
    }
}
