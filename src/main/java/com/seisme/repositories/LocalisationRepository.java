package com.seisme.repositories;

import com.seisme.entities.Localisation;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface LocalisationRepository extends MongoRepository<Localisation, String> {


}
