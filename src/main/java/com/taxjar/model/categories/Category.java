package com.taxjar.model.categories;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Category {
    @JsonProperty("name")
    String name;

    @JsonProperty("product_tax_code")
    String productTaxCode;

    @JsonProperty("description")
    String description;

    public String getName() {
        return name;
    }

    public String getProductTaxCode() {
        return productTaxCode;
    }

    public String getDescription() {
        return description;
    }
}
