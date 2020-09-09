package com.kodilla.good.patterns.challenges.quest_1;

public class SupplierFactory {

    public static final String EXTRA_FOOD_SHOP = "ExtraFoodShop";
    public static final String HEALTHY_SHOP = "HealthyShop";
    public static final String GLUTEN_FREE_SHOP = "GlutenFreeShop";

    public static Process getSupplier(String supplier) {
        if (supplier.equals(EXTRA_FOOD_SHOP)){
            return new ExtraFoodShop();
        } else if (supplier.equals(HEALTHY_SHOP)){
            return new HealthyShop();
        } else if (supplier.equals(GLUTEN_FREE_SHOP)) {
            return new GlutenFreeShop();
        } else {
            return  null;
        }
    }
}
