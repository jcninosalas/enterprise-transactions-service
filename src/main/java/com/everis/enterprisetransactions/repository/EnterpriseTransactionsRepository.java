package com.everis.enterprisetransactions.repository;

import com.everis.enterprisetransactions.model.EnterpriseTransactions;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import reactor.core.publisher.Mono;

public interface EnterpriseTransactionsRepository extends ReactiveMongoRepository<EnterpriseTransactions, String> {

    Mono<EnterpriseTransactions> findByRuc(String ruc);
}
