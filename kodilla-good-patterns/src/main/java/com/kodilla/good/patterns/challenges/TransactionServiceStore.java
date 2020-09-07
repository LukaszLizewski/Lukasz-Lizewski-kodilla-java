package com.kodilla.good.patterns.challenges;

public class TransactionServiceStore implements TransactionService {
    @Override
    public boolean startTransaction(UserCustomer buyer, UserCustomer seller, Items items) {
        System.out.println("klasa: TransactionServiceStore -> cala logika zwiazana z transakcja zwracająca prawdę");
        return true;
    }
}
