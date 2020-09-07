package com.kodilla.good.patterns.challenges;

public class TransactionRepositoryStore implements TransactionRepository{
    @Override
    public void repository(UserCustomer buyer, UserCustomer seller, Items items) {
        System.out.println("Transactions between BUYER: " + "\n" +
                buyer.getUserName() + "\n" +
                buyer.getName() + "\n" +
                buyer.getLastName() + "\n" +
                " and SELLER: " + "\n" +
                seller.getUserName() + "\n" +
                seller.getName() + "\n" +
                seller.getLastName() + "\n" +
                "subject of the transaction :" + "\n" +
                items.getNameOfProduct() + "\n" +
                items.getPriceOfProduct() + "$");
    }
}
