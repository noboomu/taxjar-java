package com.taxjar.model.taxes;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Jurisdictions {
    @JsonProperty("country")
    String country;

    @JsonProperty("state")
    String state;

    @JsonProperty("county")
    String county;

    @JsonProperty("city")
    String city;

    public String getCountry() { return country; }

    public String getState() { return state; }

    public String getCounty() { return county; }

    public String getCity() { return city; }
}
