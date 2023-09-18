package com.taxjar.model.summarized_rates;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AverageRate {
    @JsonProperty("label")
    String label;

    @JsonProperty("rate")
    Float rate;

    public String getLabel() {
        return label;
    }

    public Float getRate() {
        return rate;
    }
}
