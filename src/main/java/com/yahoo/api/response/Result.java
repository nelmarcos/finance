package com.yahoo.api.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Result {

    @JsonProperty("region")
    private String region;

    private String symbol;

    private String longName;

    private String dividendYield;

    private String forwardPE;

    private String priceToBook;

    private String fiftyTwoWeekLow;

    private String fiftyTwoWeekHigh;

    private String regularMarketPrice;

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public String getLongName() {
        return longName;
    }

    public void setLongName(String longName) {
        this.longName = longName;
    }

    public String getDividendYield() {
        return dividendYield;
    }

    public void setDividendYield(String dividendYield) {
        this.dividendYield = dividendYield;
    }

    public String getForwardPE() {
        return forwardPE;
    }

    public void setForwardPE(String forwardPE) {
        this.forwardPE = forwardPE;
    }

    public String getPriceToBook() {
        return priceToBook;
    }

    public void setPriceToBook(String priceToBook) {
        this.priceToBook = priceToBook;
    }

    public String getFiftyTwoWeekLow() {
        return fiftyTwoWeekLow;
    }

    public void setFiftyTwoWeekLow(String fiftyTwoWeekLow) {
        this.fiftyTwoWeekLow = fiftyTwoWeekLow;
    }

    public String getFiftyTwoWeekHigh() {
        return fiftyTwoWeekHigh;
    }

    public void setFiftyTwoWeekHigh(String fiftyTwoWeekHigh) {
        this.fiftyTwoWeekHigh = fiftyTwoWeekHigh;
    }

    public String getRegularMarketPrice() {
        return regularMarketPrice;
    }

    public void setRegularMarketPrice(String regularMarketPrice) {
        this.regularMarketPrice = regularMarketPrice;
    }

    @Override
    public String toString() {
        return "Result{" +
                "region='" + region + '\'' +
                ", dividendYield='" + dividendYield + '\'' +
                ", forwardPE='" + forwardPE + '\'' +
                ", priceToBook='" + priceToBook + '\'' +
                ", fiftyTwoWeekLow='" + fiftyTwoWeekLow + '\'' +
                ", fiftyTwoWeekHigh='" + fiftyTwoWeekHigh + '\'' +
                ", regularMarketPrice='" + regularMarketPrice + '\'' +
                '}';
    }
}
