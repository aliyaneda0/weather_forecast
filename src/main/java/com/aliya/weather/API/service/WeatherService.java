package com.aliya.weather.API.service;


import com.aliya.weather.API.entity.Weather;
import com.aliya.weather.API.repository.WeatherRepo;
import jakarta.servlet.ServletOutputStream;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class WeatherService {


    @Autowired
    private WeatherRepo weatherRepo;

    public List<Weather> getAllWeather() {
        return weatherRepo.findAll();
    }

    public String getByCity(String city){
        System.out.println("Fetching weather for the city : " + city);

        Optional<Weather> weather = weatherRepo.findByCity(city);

        return weather.map(Weather::getForecast).orElse("Weather data not available .");
    }

    public Weather saveWeather(Weather weather) {

        return weatherRepo.save(weather);
    }

    public void deleteByCity(String city) {

        weatherRepo.deleteByCity(city);
    }
}
