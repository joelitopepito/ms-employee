package com.nttdata.bootcamp.msemployee.aplicacion;

import com.nttdata.bootcamp.msemployee.Infraestructure.IAccountbalanceRepository;
import com.nttdata.bootcamp.msemployee.model.Accountbalance;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class AccountbalanceServiceImpl implements IAccountbalanceService{

    @Autowired
    IAccountbalanceRepository  iAccountbalanceRepository;

    @Override
    public Mono<Accountbalance> crearCuenta(Mono<Accountbalance> accountbalanceMono){
        return accountbalanceMono.flatMap(iAccountbalanceRepository::insert);
    }
    @Override
    public Flux<Accountbalance> listarTodos() {
        return iAccountbalanceRepository.findAll(); }
}
