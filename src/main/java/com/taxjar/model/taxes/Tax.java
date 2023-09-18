package com.taxjar.model.taxes;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Tax {
    @JsonProperty("order_total_amount")
    Float orderTotalAmount;

    @JsonProperty("shipping")
    Float shipping;

    @JsonProperty("taxable_amount")
    Float taxableAmount;

    @JsonProperty("amount_to_collect")
    Float amountToCollect;

    @JsonProperty("rate")
    Float rate;

    @JsonProperty("has_nexus")
    Boolean hasNexus;

    @JsonProperty("freight_taxable")
    Boolean freightTaxable;

    @JsonProperty("tax_source")
    String taxSource;

    @JsonProperty("exemption_type")
    String exemptionType;

    // ---

    @JsonProperty("jurisdictions")
    Jurisdictions jurisdictions;

    @JsonProperty("breakdown")
    Breakdown breakdown;

    public Float getOrderTotalAmount() {
        return orderTotalAmount;
    }

    public Float getShipping() {
        return shipping;
    }

    public Float getTaxableAmount() {
        return taxableAmount;
    }

    public Float getAmountToCollect() {
        return amountToCollect;
    }

    public Float getRate() {
        return rate;
    }

    public Boolean getHasNexus() {
        return hasNexus;
    }

    public Boolean getFreightTaxable() {
        return freightTaxable;
    }

    public String getTaxSource() {
        return taxSource;
    }

    public String getExemptionType() {
        return exemptionType;
    }

    public Jurisdictions getJurisdictions() {
        return jurisdictions;
    }

    public Breakdown getBreakdown() {
        return breakdown;
    }
}
