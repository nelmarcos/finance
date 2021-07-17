package com.yahoo.finance;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cache.CacheManager;
import org.springframework.cache.annotation.CachingConfigurerSupport;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.client.RestTemplate;

@Configuration
@EnableCaching
@ComponentScan("com.yahoo")
@EntityScan("com.yahoo.entity")
@EnableJpaRepositories("com.yahoo.repository")
public class FinanceConfiguration extends CachingConfigurerSupport {

    @Bean
    public RestTemplate getRestTemplate() {
        System.out.println("RestTemplate instance is created");
        return new RestTemplate();
    }

    /*public net.sf.ehcache.CacheManager ehCacheManager(){
        CacheConfiguration cacheConfiguration = new CacheConfiguration();
        cacheConfiguration.setName("ten-second-cache");
        cacheConfiguration.setMemoryStoreEvictionPolicy("LRU");
        cacheConfiguration.setMaxEntriesLocalHeap(1000);
        cacheConfiguration.setTimeToLiveSeconds(10);

        net.sf.ehcache.config.Configuration config = new net.sf.ehcache.config.Configuration();
        config.addCache(cacheConfiguration);
        return net.sf.ehcache.CacheManager.newInstance(config);
    }

    @Bean
    @Override
    public CacheManager cacheManager() {
        return new EhCacheCacheManager(ehCacheManager());
    }*/

}
