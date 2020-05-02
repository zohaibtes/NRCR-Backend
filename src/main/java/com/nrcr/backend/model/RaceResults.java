package com.nrcr.backend.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.ArrayList;

@Document(collection = "raceResults")

public @Data
class RaceResults {

    @Getter @Setter
    @Id
    private final ObjectId id;
    @Getter @Setter @Field("raceDate")
    private final String raceDate;
    @Getter @Setter @Field("raceClass")
    private final String raceClass;
    @Getter @Setter @Field("raceName")
    private final String raceName;
    @Getter @Setter @Field("raceLeg")
    private final String raceLeg;
    @Getter @Setter @Field("raceResultByDriver")
    private final ArrayList<RaceResultByDriver> byDriver;

    public RaceResults(@JsonProperty("_id") ObjectId id,
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
