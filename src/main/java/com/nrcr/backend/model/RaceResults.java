package com.nrcr.backend.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;

public class RaceResults {

    @Getter @Setter
    private final String id;
    @Getter @Setter
    private final String raceDate;
    @Getter @Setter
    private final String raceClass;
    @Getter @Setter
    private final String raceName;
    @Getter @Setter
    private final String raceLeg;
    @Getter @Setter
    private final ArrayList<RaceResultByDriver> byDriver;

    public RaceResults(@JsonProperty("_id") String id,
                       @JsonProperty("raceDate") String raceDate,
                       @JsonProperty("raceClass") String raceClass,
                       @JsonProperty("raceName") String raceName,
                       @JsonProperty("raceLeg") String raceLeg,
                       @JsonProperty("raceResultByDriver") ArrayList<RaceResultByDriver> byDriver) {
        this.id = id;
        this.raceDate = raceDate;
        this.raceClass = raceClass;
        this.raceName = raceName;
        this.raceLeg = raceLeg;
        this.byDriver = byDriver;
    }
}
