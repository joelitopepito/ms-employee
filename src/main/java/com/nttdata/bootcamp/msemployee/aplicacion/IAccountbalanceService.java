package com.nttdata.bootcamp.msemployee.aplicacion;

import com.nttdata.bootcamp.msemployee.model.Accountbalance;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface IAccountbalanceService {

    public Mono<Accountbalance> crearCuenta(Mono<Accountbalance> accountbalance);

    public Flux<Accountbalance> listarTodos();
}
