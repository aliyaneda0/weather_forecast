package com.aliya.weather.API.repository;

import com.aliya.weather.API.entity.Weather;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface WeatherRepo extends JpaRepository< Weather , Long> {


    void deleteByCity(String city);
}
