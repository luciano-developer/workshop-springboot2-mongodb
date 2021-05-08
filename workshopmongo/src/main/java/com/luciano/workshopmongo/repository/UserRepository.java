package com.luciano.workshopmongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.luciano.workshopmongo.dominio.User;

@Repository
public interface UserRepository extends MongoRepository<User, String> {

}
