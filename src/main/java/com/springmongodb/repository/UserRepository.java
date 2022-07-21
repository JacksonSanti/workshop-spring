package com.springmongodb.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.springmongodb.domain.User;

@Repository
public interface UserRepository extends MongoRepository<User, String>{

}
