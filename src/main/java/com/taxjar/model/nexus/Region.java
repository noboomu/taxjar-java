package com.taxjar.model.nexus;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Region {
    @JsonProperty("country_code")
    String countryCode;

    @JsonProperty("country")
    String country;

    @JsonProperty("region_code")
    String regionCode;

    @JsonProperty("region")
    String region;

    public String getCountryCode() {
        return countryCode;
    }

    public String getCountry() {
        return country;
    }

    public String getRegionCode() {
        return regionCode;
    }

    public String getRegion() {
        return region;
    }
}
