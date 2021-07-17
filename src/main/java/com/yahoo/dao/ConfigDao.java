package com.yahoo.dao;

import com.yahoo.entity.ConfigurationEntity;
import com.yahoo.repository.ConfigurationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.LinkedList;
import java.util.List;

@Service
public class ConfigDao {

    @Autowired
    private ConfigurationRepository configurationRepository;

    @Cacheable(value = "get-config-cache")
    public List<ConfigurationEntity> getConfig() {
        List<ConfigurationEntity> configurationEntityList = new LinkedList<>();
        configurationRepository.findAll().forEach(configurationEntityList::add);
        return configurationEntityList;
    }
}
