package com.aliya.weather.API.controller;


import com.aliya.weather.API.entity.Weather;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/weather")
public class WeatherController {


    @GetMapping("/all")
    public List<Weather> findWeather(){


    }

    @GetMapping("/{city}")
    public Weather findWeatherByCity(@RequestParam String city)
    {

    }

    @PostMapping("/{}")
    public Weather saveWeather(){

    }

    @DeleteMapping("")
    public void deleteWeather(){

    }

    @PostMapping("/")
    public String updateWeather(){

    }
}
