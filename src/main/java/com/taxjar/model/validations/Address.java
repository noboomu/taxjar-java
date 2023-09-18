package com.taxjar.model.validations;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Address {
    @JsonProperty("country")
    String country;

    @JsonProperty("zip")
    String zip;

    @JsonProperty("state")
    String state;

    @JsonProperty("city")
    String city;

    @JsonProperty("street")
    String street;

    public String getCountry() {
        return country;
    }

    public String getZip() {
        return zip;
    }

    public String getState() {
        return state;
    }

    public String getCity() {
        return city;
    }

    public String getStreet() {
        return street;
    }
}
