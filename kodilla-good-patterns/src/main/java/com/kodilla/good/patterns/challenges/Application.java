package com.kodilla.good.patterns.challenges;

public class Application {
    public static void main(String[] args) {

        SellRequestRetriever sellRequestRetriever = new SellRequestRetriever();
        SellRequest sellRequest = sellRequestRetriever.transaction();

        ProductOrderService productOrderService = new ProductOrderService(new InformationServiceStore(),
                                                                          new TransactionServiceStore(),
                                                                          new TransactionRepositoryStore());
        productOrderService.process(sellRequest);
    }
}
