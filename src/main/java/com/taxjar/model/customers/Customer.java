package com.taxjar.model.customers;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;

public class Customer {
    @JsonProperty("customer_id")
    String customerId;

    @JsonProperty("exemption_type")
    String exemptionType;

    @JsonProperty("exempt_regions")
    List<ExemptRegion> exemptRegions  = new ArrayList<>();;

    @JsonProperty("name")
    String name;

    @JsonProperty("country")
    String country;

    @JsonProperty("state")
    String state;

    @JsonProperty("zip")
    String zip;

    @JsonProperty("city")
    String city;

    @JsonProperty("street")
    String street;

    public String getCustomerId() {
        return customerId;
    }

    public String getExemptionType() {
        return exemptionType;
    }

    public List<ExemptRegion> getExemptRegions() {
        return exemptRegions;
    }

    public String getName() {
        return name;
    }

    public String getCountry() {
        return country;
    }

    public String getState() {
        return state;
    }

    public String getZip() {
        return zip;
    }

    public String getCity() {
        return city;
    }

    public String getStreet() {
        return street;
    }
}
