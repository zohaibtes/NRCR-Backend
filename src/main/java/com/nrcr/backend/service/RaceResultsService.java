package com.nrcr.backend.service;

import com.nrcr.backend.dao.RaceResultsDao;
import com.nrcr.backend.model.RaceResults;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RaceResultsService {

    private final RaceResultsDao resultsDao;

    @Autowired
    public RaceResultsService(@Qualifier("fakeDao") RaceResultsDao resultsDao) {
        this.resultsDao = resultsDao;
    }

    public int insertResult(RaceResults results) {
        return resultsDao.insertResult(results);
    }

    public List<RaceResults> getAllResults() {
        return resultsDao.selectAllResults();
    }
}
