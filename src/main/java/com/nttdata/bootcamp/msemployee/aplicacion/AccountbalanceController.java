package com.nttdata.bootcamp.msemployee.aplicacion;

import com.nttdata.bootcamp.msemployee.model.Accountbalance;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
public class AccountbalanceController {

    @Autowired

    IAccountbalanceService iAccountbalanceService;

    @PostMapping("accountbalance")
    @ResponseStatus(HttpStatus.CREATED)
    public Mono<Accountbalance> createCue(@RequestBody Accountbalance accountbalance){
        Mono<Accountbalance> cueMono=Mono.just(accountbalance);
        return iAccountbalanceService.crearCuenta(cueMono);
    }

    @GetMapping(value = "accountbalance",produces = MediaType.TEXT_EVENT_STREAM_VALUE)
    public ResponseEntity<Flux<Accountbalance>> listarTodos(){

        Flux<Accountbalance> resp=iAccountbalanceService.listarTodos();

        return ResponseEntity.ok(resp);
    }

}
