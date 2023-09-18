package com.taxjar.model.validations;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ViesResponse {
    @JsonProperty("country_code")
    String countryCode;

    @JsonProperty("vat_number")
    String vatNumber;

    @JsonProperty("request_date")
    String requestDate;

    @JsonProperty("valid")
    Boolean valid;

    @JsonProperty("name")
    String name;

    @JsonProperty("address")
    String address;

    public String getCountryCode() {
        return countryCode;
    }

    public String getVatNumber() {
        return vatNumber;
    }

    public String getRequestDate() {
        return requestDate;
    }

    public Boolean getValid() {
        return valid;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }
}
