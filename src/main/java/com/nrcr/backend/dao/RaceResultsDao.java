package com.nrcr.backend.dao;

import com.nrcr.backend.model.RaceResults;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface RaceResultsDao extends MongoRepository<RaceResults, String> {

}
