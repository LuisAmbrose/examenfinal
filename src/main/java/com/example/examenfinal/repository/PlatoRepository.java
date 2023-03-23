package com.example.examenfinal.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.examenfinal.model.Plato;


public interface PlatoRepository extends  MongoRepository<Plato, Long> {

}
