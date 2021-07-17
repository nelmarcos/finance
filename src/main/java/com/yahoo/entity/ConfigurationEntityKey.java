package com.yahoo.entity;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class ConfigurationEntityKey implements Serializable {

    private String name;

    @Column(name = "groupname")
    private String group;

    public ConfigurationEntityKey() {

    }

    public ConfigurationEntityKey(String name, String group) {
        this.name = name;
        this.group = group;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }
}
