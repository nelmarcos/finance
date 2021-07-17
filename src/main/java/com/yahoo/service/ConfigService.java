package com.yahoo.service;

import com.yahoo.dao.ConfigDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.stereotype.Component;

@Component
public class ConfigService {

    private static final String KEY = "x-rapidapi-key";

    private static final String HOST = "x-rapidapi-host";

    private static final String HEADER = "header";

    public static final String MY_KEY = "mykey";

    @Autowired
    private ConfigDao configDao;

    public String getConfig(String group, String name) {
        return configDao.getConfig().stream().filter(configurationEntity ->
                configurationEntity.getConfigurationEntityKey().getGroup().equalsIgnoreCase(group) &&
                        configurationEntity.getConfigurationEntityKey().getName().equalsIgnoreCase(name)
        ).findFirst().orElseThrow(NullPointerException::new).getValue();
    }

    public HttpHeaders getHttpHeaders() {
        HttpHeaders headers = new HttpHeaders();
        headers.add(KEY, getConfig(HEADER, KEY));
        headers.add(HOST, getConfig(HEADER, HOST));
        //headers.add(KEY, "e0770f7606mshf73bea1e57fbe09p1f4902jsne7828cce893b");
        //headers.add(HOST, "apidojo-yahoo-finance-v1.p.rapidapi.com");
        return headers;
    }

    public HttpEntity getHttpEntity() {
        return new HttpEntity(getHttpHeaders());
    }
}
