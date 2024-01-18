package com.coxey.app.person;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

@JsonRootName(value = "PersonInfo")
public class PersonInfo {
    @JsonProperty("FindPersonInfo")
    private FindPersonInfo findPersonInfo;

    public PersonInfo(FindPersonInfo findPersonInfo) {
        this.findPersonInfo = findPersonInfo;
    }

    public PersonInfo() {
    }

    public FindPersonInfo getFindPersonInfo() {
        return findPersonInfo;
    }
}
