package com.farzac.crud.api.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.farzac.crud.api.documents.Cliente;

@Repository
public interface ClienteRepository extends MongoRepository<Cliente, String> {

}
