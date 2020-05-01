package com.nrcr.backend.dao;

import com.nrcr.backend.model.RaceResults;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository("fakeDao")
public class FakePersonDataAccessService implements RaceResultsDao {

    private static List<RaceResults> DB = new ArrayList<>();

    @Override
    public int insertResult(RaceResults results) {
        DB.add(new RaceResults(results.getId(), results.getRaceDate(), results.getRaceClass(), results.getRaceName(),
                results.getRaceLeg(), results.getByDriver()));
        return 1;
    }

    @Override
    public List<RaceResults> selectAllResults() {
        return DB;
    }
}
