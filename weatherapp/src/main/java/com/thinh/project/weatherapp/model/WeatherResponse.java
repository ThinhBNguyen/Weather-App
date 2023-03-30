package com.thinh.project.weatherapp.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class WeatherResponse {
    @JsonProperty("weather")
    private List<Weather> weather;
    @JsonProperty("main")
    private Main main;

    @JsonProperty("wind")
    private Wind wind;

    public WeatherResponse(){

    }

    public WeatherResponse(List<Weather> weather, Main main, Wind wind) {
        this.weather = weather;
        this.main = main;
        this.wind = wind;
    }

    public List<Weather> getWeather() {
        return weather;
    }

    public void setWeather(List<Weather> weather) {
        this.weather = weather;
    }

    public Main getMain() {
        return main;
    }

    public void setMain(Main main) {
        this.main = main;
    }

    public Wind getWind() {
        return wind;
    }

    public void setWind(Wind wind) {
        this.wind = wind;
    }
}
