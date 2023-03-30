package com.thinh.project.weatherapp.controller;

import com.thinh.project.weatherapp.model.WeatherResponse;
import com.thinh.project.weatherapp.service.WeatherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/weather")
public class WeatherController {

    @Autowired
    private WeatherService weatherService;


    //show view with input field for 'city'
    @GetMapping("/city")
    public String showWeather(Model theModel){
        theModel.addAttribute("weatherResponse", null);
        return "weather";
    }


    //takes 'city' from input to send HTTP request and populate weatherresponse class then display.
    @GetMapping("/city/get")
    public String getWeatherByCity(@RequestParam String city, Model theModel){
        WeatherResponse weatherResponse = new WeatherResponse();
        weatherResponse = weatherService.getWeatherByCity(city);
        if(weatherResponse != null){
        theModel.addAttribute("weatherResponse", weatherResponse);
        }
        return "weather";
    }

}
