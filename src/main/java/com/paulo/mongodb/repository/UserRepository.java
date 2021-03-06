package com.paulo.mongodb.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.paulo.mongodb.domain.User;

@Repository
public interface UserRepository extends MongoRepository<User, String>
{

}