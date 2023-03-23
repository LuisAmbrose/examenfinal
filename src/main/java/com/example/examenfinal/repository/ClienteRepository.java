package com.example.examenfinal.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.examenfinal.model.Cliente;


public interface ClienteRepository extends  MongoRepository<Cliente, Long> {

}
