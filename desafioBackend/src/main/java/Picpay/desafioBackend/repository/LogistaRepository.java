package Picpay.desafioBackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import Picpay.desafioBackend.entity.Logista;

public interface LogistaRepository extends JpaRepository<Logista,Long> {
    
}
