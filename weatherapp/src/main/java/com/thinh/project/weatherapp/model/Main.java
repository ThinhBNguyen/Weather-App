package com.thinh.project.weatherapp.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Main {

    @JsonProperty("temp")
    private int temp;

    @JsonProperty("feels_like")
    private int feels_like;

    @JsonProperty("temp_min")
    private int temp_min;

    @JsonProperty("temp_max")
    private int temp_max;

    @JsonProperty("pressure")
    private int pressure;

    @JsonProperty("humidity")
    private int humidity;

    public Main(){};
    public Main(int temp, int feels_like, int temp_min, int temp_max, int pressure, int humidity) {
        this.temp = temp;
        this.feels_like = feels_like;
        this.temp_min = temp_min;
        this.temp_max = temp_max;
        this.pressure = pressure;
        this.humidity = humidity;
    }

    public int getTemp() {
        return temp;
    }

    public void setTemp(int temp) {
        this.temp = temp;
    }

    public int getFeels_like() {
        return feels_like;
    }

    public void setFeels_like(int feels_like) {
        this.feels_like = feels_like;
    }

    public int getTemp_min() {
        return temp_min;
    }

    public void setTemp_min(int temp_min) {
        this.temp_min = temp_min;
    }

    public int getTemp_max() {
        return temp_max;
    }

    public void setTemp_max(int temp_max) {
        this.temp_max = temp_max;
    }

    public int getPressure() {
        return pressure;
    }

    public void setPressure(int pressure) {
        this.pressure = pressure;
    }

    public int getHumidity() {
        return humidity;
    }

    public void setHumidity(int humidity) {
        this.humidity = humidity;
    }
}
