package com.everis.enterprisetransactions.controller;

import com.everis.enterprisetransactions.model.AccountTransaction;
import com.everis.enterprisetransactions.model.TransactionResponse;
import com.everis.enterprisetransactions.service.DepositTransactionsService;
import com.everis.enterprisetransactions.service.WithdrawTransactionsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
public class AccountTransactionsController {

    @Autowired
    private WithdrawTransactionsService withdrawService;

    @Autowired
    private DepositTransactionsService depositService;

    @PostMapping("/e-transaction/withdraw")
    public Mono<TransactionResponse> withdrawTransaction(
            @RequestBody AccountTransaction transaction,
            @RequestParam String ruc) {
        return withdrawService.createNewTransaction(transaction, ruc);
    }

    @PostMapping("/e-transaction/deposit")
    public Mono<TransactionResponse> depositTransation(
            @RequestBody AccountTransaction transaction,
            @RequestParam String ruc) {
        return depositService.createNewTransaction(transaction, ruc);
    }
}
