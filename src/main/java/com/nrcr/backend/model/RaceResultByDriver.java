package com.nrcr.backend.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.ArrayList;

public class RaceResultByDriver {
    @Getter @Setter @Field("driverName")
    private final String driverName;
    @Getter @Setter @Field("bestQualifyingLaps")
    private final String bestQualifyingLaps;
    @Getter @Setter @Field("bestQualifyingTime")
    private final String bestQualifyingTime;
    @Getter @Setter @Field("raceLaps")
    private final String raceLaps;
    @Getter @Setter @Field("raceTime")
    private final String raceTime;
    @Getter @Setter @Field("raceLapTimes")
    private final ArrayList<String> raceLapTimes;

    public RaceResultByDriver(String driverName, String bestQualifyingLaps, String bestQualifyingTime,
                              String raceLaps, String raceTime, ArrayList<String> raceLapTimes) {
        this.driverName = driverName;
        this.bestQualifyingLaps = bestQualifyingLaps;
        this.bestQualifyingTime = bestQualifyingTime;
        this.raceLaps = raceLaps;
        this.raceTime = raceTime;
        this.raceLapTimes = raceLapTimes;
    }
}
