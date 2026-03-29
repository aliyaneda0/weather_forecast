package com.aliya.weather.API.entity;


import jakarta.persistence.*;

@Entity
@Table (name = "weather")
public class Weather {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String city;

    private String forecast;

    private int humidity;

    public Weather() {

    }



    public Weather(int id, String city, String forecast,int humidity) {
        this.id = id;
        this.city = city;
        this.forecast = forecast;
        this.humidity = humidity;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getForecast() {
        return forecast;
    }

    public void setForecast(String forecast) {
        this.forecast = forecast;
    }

    public int getHumidity() {
        return humidity;
    }

    public void setHumidity(int humidity) {
        this.humidity = humidity;
    }
}
