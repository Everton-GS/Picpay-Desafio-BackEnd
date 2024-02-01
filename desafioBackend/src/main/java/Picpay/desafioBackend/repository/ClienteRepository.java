package Picpay.desafioBackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import Picpay.desafioBackend.entity.Cliente;

public interface ClienteRepository  extends JpaRepository<Cliente,Long>{
    
}
