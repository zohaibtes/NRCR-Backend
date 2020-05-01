package com.nrcr.backend.model;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;

public class RaceResultByDriver {
    @Getter @Setter
    private final String driverName;
    @Getter @Setter
    private final String bestQualifyingLaps;
    @Getter @Setter
    private final String bestQualifyingTime;
    @Getter @Setter
    private final String raceLaps;
    @Getter @Setter
    private final String raceTime;
    @Getter @Setter
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
