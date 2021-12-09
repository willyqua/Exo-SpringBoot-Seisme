package com.seisme.repositories;

import com.seisme.entities.Seisme;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface SeismeRepository extends MongoRepository<Seisme, String> {



}
