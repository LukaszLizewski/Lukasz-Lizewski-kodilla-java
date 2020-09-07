package com.kodilla.good.patterns.challenges;

public class SellRequestRetriever {
    public SellRequest transaction() {
        UserCustomer customer = new UserCustomer("Joe", "Tribiani", "Joseph", "New York", 345234123);
        UserCustomer dealer = new UserCustomer("Chandler", "Bing", "Chan", "New York", 876654543);

        Items item1 = new Items("cell phone", 12.45);
        Items item2 = new Items("game", 5.35);
        Items item3 = new Items("computer mouse", 3.35);
        Items item4 = new Items("candle", 1.45);
        Items item5 = new Items("car", 4500.00);
        Items item6 = new Items("tape", 1.99);
        Items item7 = new Items("aeroplane", 234000.00);
        Items item8 = new Items("space shuttle", 1000000.00);
        Items item9 = new Items("telescope", 999.99);

        return new SellRequest (customer , dealer, item8);
    }
}
