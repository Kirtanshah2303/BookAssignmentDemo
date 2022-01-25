package com.example.SpringMongo.repository;

import com.example.SpringMongo.model.Demo;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface demoRepo extends MongoRepository<Demo,String> {
}
