package com.kodilla.good.patterns.challenges;

public class TransactionDto {
    private SellRequest sellRequest;
    private boolean isItSold;

    public TransactionDto(SellRequest sellRequest, boolean isItSold) {
        this.sellRequest = sellRequest;
        this.isItSold = isItSold;
    }
    @Override
    public String toString() {
        return "TransactionDto{" +
                "sellRequest=" + sellRequest +
                ", isItSold=" + isItSold +
                '}';
    }
}
