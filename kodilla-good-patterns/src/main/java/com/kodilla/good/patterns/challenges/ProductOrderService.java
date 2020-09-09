package com.kodilla.good.patterns.challenges;

public class ProductOrderService {

    private InformationService informationService;
    private TransactionService transactionService;
    private TransactionRepository transactionRepository;

    public ProductOrderService(final InformationService informationService,
                               final TransactionService transactionService,
                               final TransactionRepository rentalRepository) {
        this.informationService = informationService;
        this.transactionService = transactionService;
        this.transactionRepository = rentalRepository;
    }
    public TransactionDto process(final SellRequest sellRequest) {
        boolean isSold = transactionService.startTransaction(sellRequest.getUserCustomer(), sellRequest.getUserDealer(), sellRequest.getItems());

        if (isSold) {
            informationService.informContractors(sellRequest.getUserCustomer(), sellRequest.getUserDealer(), sellRequest.getItems());
            transactionRepository.repository(sellRequest.getUserCustomer(), sellRequest.getUserDealer(), sellRequest.getItems());
            return new TransactionDto(sellRequest, true);
        } else {
            return new TransactionDto(sellRequest, false);
        }
    }
}



