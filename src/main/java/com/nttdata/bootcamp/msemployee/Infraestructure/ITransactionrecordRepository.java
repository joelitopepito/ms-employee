package com.nttdata.bootcamp.msemployee.Infraestructure;

import com.nttdata.bootcamp.msemployee.model.Transactionrecord;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface ITransactionrecordRepository extends ReactiveMongoRepository<Transactionrecord,String> {
}
