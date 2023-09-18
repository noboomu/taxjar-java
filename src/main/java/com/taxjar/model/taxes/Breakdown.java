package com.taxjar.model.taxes;

import com.fasterxml.jackson.annotation.JsonProperty;


import java.util.ArrayList;
import java.util.List;

public class Breakdown {
    @JsonProperty("taxable_amount")
    Float taxableAmount;

    @JsonProperty("tax_collectable")
    Float taxCollectable;

    @JsonProperty("combined_tax_rate")
    Float combinedTaxRate;

    @JsonProperty("state_taxable_amount")
    Float stateTaxableAmount;

    @JsonProperty("state_tax_rate")
    Float stateTaxRate;

    @JsonProperty("state_tax_collectable")
    Float stateTaxCollectable;

    @JsonProperty("county_taxable_amount")
    Float countyTaxableAmount;

    @JsonProperty("county_tax_rate")
    Float countyTaxRate;

    @JsonProperty("county_tax_collectable")
    Float countyTaxCollectable;

    @JsonProperty("city_taxable_amount")
    Float cityTaxableAmount;

    @JsonProperty("city_tax_rate")
    Float cityTaxRate;

    @JsonProperty("city_tax_collectable")
    Float cityTaxCollectable;

    @JsonProperty("special_district_taxable_amount")
    Float specialDistrictTaxableAmount;

    @JsonProperty("special_tax_rate")
    Float specialDistrictTaxRate;

    @JsonProperty("special_district_tax_collectable")
    Float specialDistrictTaxCollectable;

    // International

    @JsonProperty("country_taxable_amount")
    Float countryTaxableAmount;

    @JsonProperty("country_tax_rate")
    Float countryTaxRate;

    @JsonProperty("country_tax_collectable")
    Float countryTaxCollectable;

    // Canada

    @JsonProperty("gst_taxable_amount")
    Float gstTaxableAmount;

    @JsonProperty("gst_tax_rate")
    Float gstTaxRate;

    @JsonProperty("gst")
    Float gst;

    @JsonProperty("pst_taxable_amount")
    Float pstTaxableAmount;

    @JsonProperty("pst_tax_rate")
    Float pstTaxRate;

    @JsonProperty("pst")
    Float pst;

    @JsonProperty("qst_taxable_amount")
    Float qstTaxableAmount;

    @JsonProperty("qst_tax_rate")
    Float qstTaxRate;

    @JsonProperty("qst")
    Float qst;

    // ---

    @JsonProperty("shipping")
    Shipping shipping;

    @JsonProperty("line_items")
    List<BreakdownLineItem> lineItems = new ArrayList<>();

    public Float getTaxableAmount() {
        return taxableAmount;
    }

    public Float getTaxCollectable() {
        return taxCollectable;
    }

    public Float getCombinedTaxRate() {
        return combinedTaxRate;
    }

    public Float getStateTaxableAmount() {
        return stateTaxableAmount;
    }

    public Float getStateTaxRate() {
        return stateTaxRate;
    }

    public Float getStateTaxCollectable() {
        return stateTaxCollectable;
    }

    public Float getCountyTaxableAmount() {
        return countyTaxableAmount;
    }

    public Float getCountyTaxRate() {
        return countyTaxRate;
    }

    public Float getCountyTaxCollectable() {
        return countyTaxCollectable;
    }

    public Float getCityTaxableAmount() {
        return cityTaxableAmount;
    }

    public Float getCityTaxRate() {
        return cityTaxRate;
    }

    public Float getCityTaxCollectable() {
        return cityTaxCollectable;
    }

    public Float getSpecialDistrictTaxableAmount() {
        return specialDistrictTaxableAmount;
    }

    public Float getSpecialDistrictTaxRate() {
        return specialDistrictTaxRate;
    }

    public Float getSpecialDistrictTaxCollectable() {
        return specialDistrictTaxCollectable;
    }

    public Float getCountryTaxableAmount() {
        return countryTaxableAmount;
    }

    public Float getCountryTaxRate() {
        return countryTaxRate;
    }

    public Float getCountryTaxCollectable() {
        return countryTaxCollectable;
    }

    public Float getGstTaxableAmount() {
        return gstTaxableAmount;
    }

    public Float getGstTaxRate() {
        return gstTaxRate;
    }

    public Float getGst() {
        return gst;
    }

    public Float getPstTaxableAmount() {
        return pstTaxableAmount;
    }

    public Float getPstTaxRate() {
        return pstTaxRate;
    }

    public Float getPst() {
        return pst;
    }

    public Float getQstTaxableAmount() {
        return qstTaxableAmount;
    }

    public Float getQstTaxRate() {
        return qstTaxRate;
    }

    public Float getQst() {
        return qst;
    }

    public Shipping getShipping() {
        return shipping;
    }

    public List<BreakdownLineItem> getLineItems() {
        return lineItems;
    }
}
