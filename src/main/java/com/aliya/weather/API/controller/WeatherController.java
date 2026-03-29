package com.aliya.weather.API.controller;


import com.aliya.weather.API.entity.Weather;
import com.aliya.weather.API.repository.WeatherRepo;
import com.aliya.weather.API.service.WeatherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//@RestController
//@RequestMapping("/weather")
//public class WeatherController {
//
//    @Autowired
//    public WeatherService weatherService;
//
//    @Autowired
//    public WeatherRepo weatherRepo;
//
//
//    @GetMapping("/all")
//    public List<Weather> findWeather(){
//
//        return weatherRepo.findAll();
//
//    }
//
////    @GetMapping("/{city}")
////    public Weather findWeatherByCity(@RequestParam String city)
////    {
////
////    }
//
//
//    public Weather saveWeather(@RequestBody Weather weather){
//
//        return weatherRepo.save(weather);
//
//    }
//
//    @DeleteMapping("/{city}")
//    public String deleteWeather(@PathVariable String city){
//
//        weatherRepo.delete(city);
//
//        return city + " weather deleted";
//    }
//
////    @PatchMapping("/{city}")
////    public String updateWeather(@PathVariable String city){
////
////    }
//}
//


@RestController
@RequestMapping("/weather")
public class WeatherController {

    @Autowired
    private WeatherService weatherService;

    // GET all
    @GetMapping("/all")
    public List<Weather> findWeather() {
        return weatherService.getAllWeather();
    }

    // POST save
    @PostMapping
    public Weather saveWeather(@RequestBody Weather weather) {
        return weatherService.saveWeather(weather);
    }

    // DELETE by city
    @DeleteMapping("/{city}")
    public String deleteWeather(@PathVariable String city) {
        weatherService.deleteByCity(city);
        return city + " weather deleted";
    }
}