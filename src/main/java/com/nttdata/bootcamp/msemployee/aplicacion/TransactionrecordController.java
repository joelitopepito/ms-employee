package com.nttdata.bootcamp.msemployee.aplicacion;

import com.nttdata.bootcamp.msemployee.model.Transactionrecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
public class TransactionrecordController {
    @Autowired
    ITransactionrecordService iTransactionrecordService;

    @PostMapping("transactionrecord")
    @ResponseStatus(HttpStatus.CREATED)
    public Mono<Transactionrecord> createTra(@RequestBody Transactionrecord transactionrecord){
    	Mono<Transactionrecord> traMono=Mono.just(transactionrecord);
        return iTransactionrecordService.crearTransaction(traMono);
    }

    @GetMapping(value = "transactionrecord",produces = MediaType.TEXT_EVENT_STREAM_VALUE)
    public ResponseEntity<Flux<Transactionrecord>> listarTodos(){
    	
    	Flux<Transactionrecord> resp= iTransactionrecordService.listarTodos();
        
    	return ResponseEntity.ok(resp);
    }
}
