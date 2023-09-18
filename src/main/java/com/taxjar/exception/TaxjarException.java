package com.taxjar.exception;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class TaxjarException extends Exception {
    private Integer statusCode;

    public TaxjarException(String errorMessage, int statusCode) {
        super(parseMessage(errorMessage), null);
        this.statusCode = parseStatusCode(errorMessage, statusCode);
    }

    public TaxjarException(String errorMessage) {
        this(errorMessage, null);
    }

    public TaxjarException(String errorMessage, Throwable err) {
        super(parseMessage(errorMessage), err);
        this.statusCode = parseStatusCode(errorMessage);
    }

    public Integer getStatusCode() {
        return statusCode;
    }

    private static String parseMessage(String errorMessage) {
        ObjectMapper mapper = new ObjectMapper();

        if (errorMessage == null || errorMessage.equals("")) return "";

        try {
            JsonNode json = mapper.readTree(errorMessage);
            JsonNode error = json.get("error");
            JsonNode detail = json.get("detail");

            if (error != null && detail != null) {
                return error.textValue() + " - " + detail.textValue();
            } else {
                return errorMessage;
            }
        } catch (Exception e) {
            return errorMessage;
        }
    }

    private static Integer parseStatusCode(String errorMessage, int statusCode) {
        if (errorMessage == null || errorMessage.equals("")) {
            return statusCode;
        } else {
            return parseStatusCode(errorMessage);
        }
    }

    private static Integer parseStatusCode(String errorMessage) {
        ObjectMapper mapper = new ObjectMapper();

        if (errorMessage == null) return 0;

        try {
            JsonNode json = mapper.readTree(errorMessage);
            JsonNode status = json.get("status");

            if (status != null) {
                return status.intValue();
            } else {
                return 0;
            }
        } catch (Exception e) {
            return 0;
        }
    }
}
