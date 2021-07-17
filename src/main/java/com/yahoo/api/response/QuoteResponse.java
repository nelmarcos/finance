package com.yahoo.api.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class QuoteResponse {

    @JsonProperty("result")
    private List<Result> result;

    @JsonProperty("error")
    private Object error;

    public List<Result> getResult() {
        return result;
    }

    public void setResult(List<Result> result) {
        this.result = result;
    }

    public Object getError() {
        return error;
    }

    public void setError(Object error) {
        this.error = error;
    }

    @Override
    public String toString() {
        return "QuoteResponse{" +
                "result=" + result +
                ", error=" + error +
                '}';
    }
}
