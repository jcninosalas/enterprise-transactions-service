package com.everis.enterprisetransactions.service;

import com.everis.enterprisetransactions.repository.EnterpriseTransactionsRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class DepositTransactionsService {

    @Autowired
    private EnterpriseTransactionsRepository repository;
}
