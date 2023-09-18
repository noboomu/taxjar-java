package com.taxjar.model.summarized_rates;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SummaryRate {
    @JsonProperty("country_code")
    String countryCode;

    @JsonProperty("country")
    String country;

    @JsonProperty("region_code")
    String regionCode;

    @JsonProperty("region")
    String region;

    @JsonProperty("minimum_rate")
    MinimumRate minimumRate;

    @JsonProperty("average_rate")
    AverageRate averageRate;

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

    public MinimumRate getMinimumRate() {
        return minimumRate;
    }

    public AverageRate getAverageRate() {
        return averageRate;
    }
}
