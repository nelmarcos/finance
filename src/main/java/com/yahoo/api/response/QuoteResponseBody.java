package com.yahoo.api.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class QuoteResponseBody {

    @JsonProperty("quoteResponse")
    private QuoteResponse quoteResponse;

    public QuoteResponse getQuoteResponse() {
        return quoteResponse;
    }

    public void setQuoteResponse(QuoteResponse quoteResponse) {
        this.quoteResponse = quoteResponse;
    }

    @Override
    public String toString() {
        return "QuoteResponseBody{" +
                "quoteResponse=" + quoteResponse +
                '}';
    }
}
