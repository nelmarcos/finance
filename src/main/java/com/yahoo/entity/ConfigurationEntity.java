package com.yahoo.entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity(name = "configuration")
public class ConfigurationEntity implements Serializable {

    @EmbeddedId
    private ConfigurationEntityKey configurationEntityKey;

    private String value;

    public ConfigurationEntity () {

    }

    public ConfigurationEntity (ConfigurationEntityKey configurationEntityKey, String value) {
        this.configurationEntityKey = configurationEntityKey;
        this.value = value;
    }

    public ConfigurationEntityKey getConfigurationEntityKey() {
        return configurationEntityKey;
    }

    public void setConfigurationEntityKey(ConfigurationEntityKey configurationEntityKey) {
        this.configurationEntityKey = configurationEntityKey;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
