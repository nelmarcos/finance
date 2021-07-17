package com.yahoo.controller;

import com.yahoo.api.MarketService;
import com.yahoo.api.response.QuoteResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.Cache;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping(value = "/quote")
public class MarketController {

    private static Logger log = LoggerFactory.getLogger(MarketController.class);

    @Autowired
    private MarketService marketService;

    private static List<String> defaultStock = Arrays.asList("AAPL", "AMZN");

    @RequestMapping(produces = MediaType.APPLICATION_JSON_VALUE, method = RequestMethod.GET)
    public QuoteResponse viewQoute() {
        return marketService.getQoutes(defaultStock);
    }

    @RequestMapping(value = "/{symbol}", produces = MediaType.APPLICATION_JSON_VALUE, method = RequestMethod.GET)
    public QuoteResponse viewQuoteStock(@PathVariable String symbol) {
        return marketService.getQoutes(Arrays.asList(symbol));
    }

    @RequestMapping(value = "/query", produces = MediaType.APPLICATION_JSON_VALUE, method = RequestMethod.GET)
    public QuoteResponse viewQuoteStockQuery(@RequestParam String symbol) {
        return marketService.getQoutes(Arrays.asList(symbol));
    }

    @RequestMapping(value = "/cache/{name}", method = RequestMethod.GET)
    public Cache getCacheDetails(@PathVariable String name) {
        return marketService.getCacheByName(name);
    }
}
