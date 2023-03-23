package com.example.examenfinal.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.examenfinal.model.Carta;


public interface CartaRepository extends  MongoRepository<Carta, Long> {

}
