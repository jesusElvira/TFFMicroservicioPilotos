package com.arquitecturaMicroserviciosAla.microserviciosAla.repository;

import com.arquitecturaMicroserviciosAla.microserviciosAla.model.Pilot;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PilotRepository extends MongoRepository<Pilot, String> { }
