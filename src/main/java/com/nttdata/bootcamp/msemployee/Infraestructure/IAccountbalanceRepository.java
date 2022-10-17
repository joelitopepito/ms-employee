package com.nttdata.bootcamp.msemployee.Infraestructure;

import com.nttdata.bootcamp.msemployee.model.Accountbalance;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface IAccountbalanceRepository  extends ReactiveMongoRepository<Accountbalance, String> {
}
