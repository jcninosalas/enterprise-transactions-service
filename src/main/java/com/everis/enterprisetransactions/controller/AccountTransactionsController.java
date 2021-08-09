package com.everis.enterprisetransactions.controller;

import com.everis.enterprisetransactions.model.AccountTransaction;
import com.everis.enterprisetransactions.model.TransactionResponse;
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
    private WithdrawTransactionsService service;

    @PostMapping("/e-customer/transaction")
    public Mono<TransactionResponse> newTransation(@RequestBody AccountTransaction transaction, @RequestParam String ruc) {
        return service.createNewTransaction(transaction, ruc);
    }
}
