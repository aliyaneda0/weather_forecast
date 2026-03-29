package com.aliya.weather.API.service;


import com.aliya.weather.API.entity.Weather;
import com.aliya.weather.API.repository.WeatherRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WeatherService {


    @Autowired
    private WeatherRepo weatherRepo;

    public List<Weather> getAllWeather() {
        return weatherRepo.findAll();
    }

    public Weather saveWeather(Weather weather) {

        return weatherRepo.save(weather);
    }

    public void deleteByCity(String city) {

        weatherRepo.deleteByCity(city);
    }
}
