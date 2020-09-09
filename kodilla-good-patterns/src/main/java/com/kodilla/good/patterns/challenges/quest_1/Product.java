package com.kodilla.good.patterns.challenges.quest_1;

public class Product {
    private final String nameOfProduct;
    private final int quantity;
    private final String unit;

    public Product(String nameOfProduct, int quantity, String unit) {
        this.nameOfProduct = nameOfProduct;
        this.quantity = quantity;
        this.unit = unit;
    }
    @Override
    public String toString() {
        return "Product: " +
                "name of product = " + nameOfProduct  +
                ", quantity = " + quantity +
                ", unit = " + unit;
    }
    public String getNameOfProduct() {
        return nameOfProduct;
    }
    public int getQuantity() {
        return quantity;
    }
    public String getUnit() {
        return unit;
    }
}
