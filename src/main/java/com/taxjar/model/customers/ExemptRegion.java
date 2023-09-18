package com.taxjar.model.customers;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ExemptRegion {
    @JsonProperty("country")
    String country;

    @JsonProperty("state")
    String state;

    public String getCountry() {
        return country;
    }

    public String getState() {
        return state;
    }
}
