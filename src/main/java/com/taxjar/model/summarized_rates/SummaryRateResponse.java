package com.taxjar.model.summarized_rates;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;

public class SummaryRateResponse {
    @JsonProperty("summary_rates")
    public List<SummaryRate> summaryRates  = new ArrayList<>();;
}
