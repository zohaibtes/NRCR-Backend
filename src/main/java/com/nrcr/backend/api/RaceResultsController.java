package com.nrcr.backend.api;

import com.nrcr.backend.model.RaceResults;
import com.nrcr.backend.service.RaceResultsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//@RequestMapping("api/v1/results")
@RestController
public class RaceResultsController {

    private final RaceResultsService resultsService;

    @Autowired
    public RaceResultsController(RaceResultsService resultsService) {
        this.resultsService = resultsService;
    }

   /* @PostMapping
    public void insertResults(@RequestBody RaceResults results) {
        resultsService.insertResult(results);
    }*/

    @GetMapping("api/v1/results")
    public List<RaceResults> getAllResults() {
       return resultsService.getAllResults();
    }

    @GetMapping("/")
    public String helloWorld() {
        return "NRCR Backend is in the cloud - Woohoo!!";
    }
}
