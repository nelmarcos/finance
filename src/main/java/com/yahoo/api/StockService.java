package com.yahoo.api;

import com.yahoo.api.response.QuoteResponse;
import com.yahoo.api.response.StockSummaryResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import javax.ws.rs.client.ClientBuilder;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

@Component
public class StockService {

    @Autowired
    private RestTemplate restTemplate;

    private static final String KEY = "x-rapidapi-key";

    private static final String HOST = "x-rapidapi-host";

    public QuoteResponse getQoutes(List<String> symbol) {
        HttpHeaders headers = new HttpHeaders();
        headers.add(KEY, "e0770f7606mshf73bea1e57fbe09p1f4902jsne7828cce893b");
        headers.add(HOST, "apidojo-yahoo-finance-v1.p.rapidapi.com");
        HttpEntity entity = new HttpEntity(headers);
        ResponseEntity<QuoteResponse> response = restTemplate.exchange("https://apidojo-yahoo-finance-v1.p.rapidapi.com/stock/v2/get-summary?symbol=AMRN&region=US", HttpMethod.GET, entity, QuoteResponse.class);
        return response.getBody();
    }

    public void getSummary() {


        RestTemplate restTemplate = new RestTemplate();
        StockSummaryResponse stockSummaryResponse = new StockSummaryResponse();
        HttpHeaders headers = new HttpHeaders();
        headers.add("x-rapidapi-key", "e0770f7606mshf73bea1e57fbe09p1f4902jsne7828cce893b");
        headers.add("x-rapidapi-host", "apidojo-yahoo-finance-v1.p.rapidapi.com");
        HttpEntity<String> entity = new HttpEntity<String>(headers);
        ResponseEntity<String> response = restTemplate.exchange("https://apidojo-yahoo-finance-v1.p.rapidapi.com/stock/v2/get-summary?symbol=AMRN&region=US", HttpMethod.GET, entity, String.class);
        String body = response.getBody();
    }

    public static void main(String[] args) {
        new StockService().getSummary();
    }
}
