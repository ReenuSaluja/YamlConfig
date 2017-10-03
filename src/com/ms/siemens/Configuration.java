package com.ms.siemens;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.List;

@ConfigurationProperties(prefix = "config")
public class Configuration {
    private List<String> listParams;
    private String path;

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public List<String> getListParams() {
        return listParams;
    }

    public void setListParams(List<String> listParams) {
        this.listParams = listParams;
    }
}