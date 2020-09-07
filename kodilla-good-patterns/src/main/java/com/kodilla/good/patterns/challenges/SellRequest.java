package com.kodilla.good.patterns.challenges;

public class SellRequest {
    private UserCustomer userCustomer;
    private UserCustomer userDealer;
    private Items items;

    public SellRequest(UserCustomer userCustomer, UserCustomer userDealer, Items items) {
        this.userCustomer = userCustomer;
        this.userDealer = userDealer;
        this.items = items;
    }
    public UserCustomer getUserCustomer() {
        return userCustomer;
    }
    public UserCustomer getUserDealer() {
        return userDealer;
    }
    public Items getItems() {
        return items;
    }
}
