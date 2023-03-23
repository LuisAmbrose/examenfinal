package com.example.examenfinal.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.examenfinal.model.Restaurante;


public interface RestauranteRepository extends  MongoRepository<Restaurante, Long> {

}
