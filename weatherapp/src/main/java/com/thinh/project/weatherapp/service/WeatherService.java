package com.thinh.project.weatherapp.service;


import com.thinh.project.weatherapp.model.WeatherResponse;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class WeatherService {
    private static final String KEY = "ab2e7def10c6fb38948ea41e2df12ed6";
    private static final String WEATHER_URL = "https://api.openweathermap.org/data/2.5/weather?q=%s&appid=%s&units=imperial";

    public WeatherResponse getWeatherByCity(String city){
        RestTemplate restTemplate = new RestTemplate();
        String url = String.format(WEATHER_URL, city, KEY);
        WeatherResponse weatherResponse = restTemplate.getForObject(url, WeatherResponse.class);
        return weatherResponse;
    }
}
