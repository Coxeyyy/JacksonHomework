package com.coxey.app.person;

import com.fasterxml.jackson.annotation.JsonProperty;

public class FindPersonInfo {
    @JsonProperty("PersonName")
    private PersonName personName;
    @JsonProperty("IdentityCard")
    private IdentityCard identityCard;
    @JsonProperty("PartyId")
    private int partyId;

    public FindPersonInfo(PersonName personName, IdentityCard identityCard, int partyId) {
        this.personName = personName;
        this.identityCard = identityCard;
        this.partyId = partyId;
    }

    public FindPersonInfo() {
    }

    public PersonName getPersonName() {
        return personName;
    }

    public IdentityCard getIdentityCard() {
        return identityCard;
    }

    public int getPartyId() {
        return partyId;
    }
}
