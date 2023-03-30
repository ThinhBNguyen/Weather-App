package com.thinh.project.weatherapp.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Wind {

    @JsonProperty("speed")
    private float speed;

    public Wind(){};
    public Wind(float speed) {
        this.speed = speed;
    }

    public float getSpeed() {
        return speed;
    }

    public void setSpeed(float speed) {
        this.speed = speed;
    }
}
