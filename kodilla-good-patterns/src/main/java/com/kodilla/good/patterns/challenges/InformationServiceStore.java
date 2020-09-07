package com.kodilla.good.patterns.challenges;

import java.sql.SQLOutput;

public class InformationServiceStore implements InformationService {
    @Override
    public void informContractors(UserCustomer buyer, UserCustomer seller, Items items) {
        System.out.println("A user called " + seller.getUserName() +
                " sold the "+items.getNameOfProduct()+" item at the price of " + items.getPriceOfProduct() +
                " to the user " + buyer.getUserName());
    }
}
