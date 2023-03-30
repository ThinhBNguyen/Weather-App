package com.thinh.project.weatherapp.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Weather {

    @JsonProperty("description")
    private String description;

    @JsonProperty("icon")
    private String icon;

    public Weather(){};
    public Weather(String description, String icon) {
        this.description = description;
        this.icon = icon;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }
}
