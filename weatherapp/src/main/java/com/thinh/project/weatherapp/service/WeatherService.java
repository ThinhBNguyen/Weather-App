package com.thinh.project.weatherapp.service;


import com.thinh.project.weatherapp.model.WeatherResponse;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class WeatherService {
    private static final String KEY = "";
    private static final String WEATHER_URL = "";

    public WeatherResponse getWeatherByCity(String city){
        RestTemplate restTemplate = new RestTemplate();
        String url = String.format(WEATHER_URL, city, KEY);
        WeatherResponse weatherResponse = restTemplate.getForObject(url, WeatherResponse.class);
        return weatherResponse;
    }
}
