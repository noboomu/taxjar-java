package com.taxjar.model.rates;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Rate {
    @JsonProperty("zip")
    String zip;

    @JsonProperty("state")
    String state;

    @JsonProperty("state_rate")
    Float stateRate;

    @JsonProperty("county")
    String county;

    @JsonProperty("county_rate")
    Float countyRate;

    @JsonProperty("city")
    String city;

    @JsonProperty("city_rate")
    Float cityRate;

    @JsonProperty("combined_district_rate")
    Float combinedDistrictRate;

    @JsonProperty("combined_rate")
    Float combinedRate;

    @JsonProperty("freight_taxable")
    Boolean freightTaxable;

    // International

    @JsonProperty("country")
    String country;

    @JsonProperty("name")
    String name;

    // Australia / SST States

    @JsonProperty("country_rate")
    Float countryRate;

    // European Union

    @JsonProperty("standard_rate")
    Float standardRate;

    @JsonProperty("reduced_rate")
    Float reducedRate;

    @JsonProperty("super_reduced_rate")
    Float superReducedRate;

    @JsonProperty("parking_rate")
    Float parkingRate;

    @JsonProperty("distance_sale_threshold")
    Float distanceSaleThreshold;

    public String getZip() {
        return zip;
    }

    public String getCountry() {
        return country;
    }

    public Float getCountryRate() {
        return countryRate;
    }

    public String getState() {
        return state;
    }

    public Float getStateRate() {
        return stateRate;
    }

    public String getCounty() {
        return county;
    }

    public Float getCountyRate() {
        return countyRate;
    }

    public String getCity() {
        return city;
    }

    public Float getCityRate() {
        return cityRate;
    }

    public Float getCombinedDistrictRate() {
        return combinedDistrictRate;
    }

    public Float getCombinedRate() {
        return combinedRate;
    }

    public Boolean getFreightTaxable() {
        return freightTaxable;
    }

    public String getName() {
        return name;
    }

    public Float getStandardRate() {
        return standardRate;
    }

    public Float getReducedRate() {
        return reducedRate;
    }

    public Float getSuperReducedRate() {
        return superReducedRate;
    }

    public Float getParkingRate() {
        return parkingRate;
    }

    public Float getDistanceSaleThreshold() {
        return distanceSaleThreshold;
    }
}
