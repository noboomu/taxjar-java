package com.taxjar.model.validations;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Validation {
    @JsonProperty("valid")
    Boolean valid;

    @JsonProperty("exists")
    Boolean exists;

    @JsonProperty("vies_available")
    Boolean viesAvailable;

    @JsonProperty("vies_response")
    ViesResponse viesResponse;

    public Boolean getValid() {
        return valid;
    }

    public Boolean getExists() {
        return exists;
    }

    public Boolean getViesAvailable() {
        return viesAvailable;
    }

    public ViesResponse getViesResponse() {
        return viesResponse;
    }
}
