package com.yahoo.api;

import com.yahoo.service.ConfigService;
import com.yahoo.api.response.QuoteResponse;
import com.yahoo.api.response.QuoteResponseBody;
import com.yahoo.util.StringParserUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.Cache;
import org.springframework.cache.CacheManager;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Component
public class MarketService {

    private static Logger log = LoggerFactory.getLogger(MarketService.class);

    private static final String GET_QUOTE_URL = "https://apidojo-yahoo-finance-v1.p.rapidapi.com/market/v2/get-quotes?region={}&symbols={}";

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private ConfigService configService;

    @Autowired
    private CacheManager cacheManager;

    public QuoteResponse getQoutes(List<String> symbol) {
        HttpEntity entity = configService.getHttpEntity();
        String encodedSymbol = StringUtils.arrayToDelimitedString(symbol.toArray(), "%2C");

        ResponseEntity<QuoteResponseBody> response = restTemplate.exchange(
                StringParserUtil.insertToString(GET_QUOTE_URL, "US", encodedSymbol),
                HttpMethod.GET, entity, QuoteResponseBody.class);
        if (response.getBody() != null) {
            return response.getBody().getQuoteResponse();
        }
        return null;
    }

    public Cache getCacheByName(String name) {
        return cacheManager.getCache(name);
    }

}
