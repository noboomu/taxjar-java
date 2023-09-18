package com.taxjar.model.transactions;

import com.fasterxml.jackson.annotation.JsonProperty;

public class LineItem {
    @JsonProperty("id")
    String id;

    @JsonProperty("quantity")
    Integer quantity;

    @JsonProperty("product_identifier")
    String productIdentifier;

    @JsonProperty("description")
    String description;

    @JsonProperty("product_tax_code")
    String productTaxCode;

    @JsonProperty("unit_price")
    Float unitPrice;

    @JsonProperty("discount")
    Float discount;

    @JsonProperty("sales_tax")
    Float salesTax;

    public String getId() {
        return id;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public String getProductIdentifier() {
        return productIdentifier;
    }

    public String getDescription() {
        return description;
    }

    public String getProductTaxCode() {
        return productTaxCode;
    }

    public Float getUnitPrice() {
        return unitPrice;
    }

    public Float getDiscount() {
        return discount;
    }

    public Float getSalesTax() {
        return salesTax;
    }
}
