package com.taxjar.model.transactions;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;

public class Order {
    @JsonProperty("transaction_id")
    String transactionId;

    @JsonProperty("user_id")
    Integer userId;

    @JsonProperty("transaction_date")
    String transactionDate;

    @JsonProperty("provider")
    String provider;

    @JsonProperty("from_country")
    String fromCountry;

    @JsonProperty("from_zip")
    String fromZip;

    @JsonProperty("from_state")
    String fromState;

    @JsonProperty("from_city")
    String fromCity;

    @JsonProperty("from_street")
    String fromStreet;

    @JsonProperty("to_country")
    String toCountry;

    @JsonProperty("to_zip")
    String toZip;

    @JsonProperty("to_state")
    String toState;

    @JsonProperty("to_city")
    String toCity;

    @JsonProperty("to_street")
    String toStreet;

    @JsonProperty("amount")
    Float amount;

    @JsonProperty("shipping")
    Float shipping;

    @JsonProperty("sales_tax")
    Float salesTax;

    @JsonProperty("exemption_type")
    String exemptionType;

    @JsonProperty("line_items")
    List<LineItem> lineItems  = new ArrayList<>();;

    public String getTransactionId() {
        return transactionId;
    }

    public String getTransactionDate() {
        return transactionDate;
    }

    public String getProvider() {
        return provider;
    }

    public String getFromCountry() {
        return fromCountry;
    }

    public String getFromZip() {
        return fromZip;
    }

    public String getFromState() {
        return fromState;
    }

    public String getFromCity() {
        return fromCity;
    }

    public String getFromStreet() {
        return fromStreet;
    }

    public String getToCountry() {
        return toCountry;
    }

    public String getToZip() {
        return toZip;
    }

    public String getToState() {
        return toState;
    }

    public String getToCity() {
        return toCity;
    }

    public String getToStreet() {
        return toStreet;
    }

    public Float getAmount() {
        return amount;
    }

    public Float getShipping() {
        return shipping;
    }

    public Float getSalesTax() {
        return salesTax;
    }

    public String getExemptionType() {
        return exemptionType;
    }

    public Integer getUserId() {
        return userId;
    }

    public List<LineItem> getLineItems() {
        return lineItems;
    }
}
