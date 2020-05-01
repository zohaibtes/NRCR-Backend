package com.nrcr.backend.dao;

import com.nrcr.backend.model.RaceResults;

import java.util.List;

public interface RaceResultsDao {

    int insertResult(RaceResults results);

    List<RaceResults> selectAllResults();
}
