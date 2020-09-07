package com.kodilla.good.patterns.challenges;

public interface TransactionService {
    public boolean startTransaction(UserCustomer buyer, UserCustomer seller, Items items);
}
