package com.example.demo.dao;

import com.example.demo.model.RaceResults;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository("fakeDAO")
public class FakeResultsDataAccessService implements ResultsDAO {

    private static List<RaceResults> DB = new ArrayList<>();

    @Override
    public int insertResults(UUID _id, RaceResults results) {
        DB.add(new RaceResults(_id, results.getRaceDate(), results.getRaceClass(), results.getRaceName(),
                results.getRaceLeg(), results.getRaceResultByDriver()));
        return 1;
    }

    @Override
    public List<RaceResults> selectAllResults() {
        return DB;
    }

    @Override
    public Optional<RaceResults> selectResultsByID(UUID _id) {
        return DB.stream()
                .filter(results -> results.get_id().equals(_id))
                .findFirst();
    }

    @Override
    public int deleteResultsByID(UUID _id) {
        Optional<RaceResults> resultsMaybe = selectResultsByID(_id);
        if (resultsMaybe.isEmpty()) {
            return 0;
        }
        DB.remove(resultsMaybe.get());
        return 1;
    }

    @Override
    public int updateResultsByID(UUID _id, RaceResults results) {
        return selectResultsByID(_id)
                .map(r -> {
                    int indexofResultsToUpdate = DB.indexOf(r);
                    if (indexofResultsToUpdate >= 0) {
                        DB.set(indexofResultsToUpdate, new RaceResults(_id, results.getRaceDate(), results.getRaceClass(), results.getRaceName(),
                                results.getRaceLeg(), results.getRaceResultByDriver()));
                        return 1;
                    }
                    return 0;
                })
                .orElse(0);
    }
}
