package com.coxey.app.person;

import com.fasterxml.jackson.annotation.JsonProperty;

public class IdentityCard {
    @JsonProperty("IdType")
    private int idType;
    @JsonProperty("IdSeries")
    private int idSeries;
    @JsonProperty("IdNum")
    private int idNum;

    public IdentityCard(int idType, int idSeries, int idNum) {
        this.idType = idType;
        this.idSeries = idSeries;
        this.idNum = idNum;
    }

    public IdentityCard() {
    }

    public int getIdType() {
        return idType;
    }

    public int getIdSeries() {
        return idSeries;
    }

    public int getIdNum() {
        return idNum;
    }
}
