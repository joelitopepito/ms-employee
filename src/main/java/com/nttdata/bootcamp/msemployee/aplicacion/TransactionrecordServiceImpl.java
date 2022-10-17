package com.nttdata.bootcamp.msemployee.aplicacion;

import com.nttdata.bootcamp.msemployee.Infraestructure.ITransactionrecordRepository;
import com.nttdata.bootcamp.msemployee.model.Transactionrecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service

public class TransactionrecordServiceImpl implements ITransactionrecordService {
    @Autowired
    ITransactionrecordRepository iTransactionrecordRepository;

    @Override
    public Mono<Transactionrecord> crearTransaction(Mono<Transactionrecord> transactionMono){
        return transactionMono.flatMap(iTransactionrecordRepository::insert);
    }
    @Override
    public Flux<Transactionrecord> listarTodos() {
        return iTransactionrecordRepository.findAll(); }
}
