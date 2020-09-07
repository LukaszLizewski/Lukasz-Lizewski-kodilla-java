package com.kodilla.good.patterns.challenges;

public class Items {
    private final String nameOfProduct;
    private final double priceOfProduct;

    public Items(String nameOfProduct, double priceOfProduct) {
        this.nameOfProduct = nameOfProduct;
        this.priceOfProduct = priceOfProduct;
    }
    public String getNameOfProduct() {
        return nameOfProduct;
    }
    public double getPriceOfProduct() {
        return priceOfProduct;
    }
}
