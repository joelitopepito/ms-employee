package com.nttdata.bootcamp.msemployee.aplicacion;

import com.nttdata.bootcamp.msemployee.model.Transactionrecord;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface ITransactionrecordService {
	
    public Mono<Transactionrecord> crearTransaction(Mono<Transactionrecord> transactionrecord);

    public Flux<Transactionrecord> listarTodos();

}
