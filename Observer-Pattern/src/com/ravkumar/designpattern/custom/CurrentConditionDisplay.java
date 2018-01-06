package com.ravkumar.designpattern.custom;

import com.ravkumar.designpattern.DisplayElement;

public class CurrentConditionDisplay implements Observer,DisplayElement {

    private float temperature;
    private float humidity;
    private float pressure;

    private Subject weatherData;

    public CurrentConditionDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void disply() {
        System.out.println("Current Conditions : ");
        System.out.println("Temperature : " + this.temperature);
        System.out.println("Humidity : " + this.humidity);
        System.out.println("Pressure : " + this.pressure);

    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temperature = temp;
        this.humidity = humidity;
        this.pressure = pressure;
        disply();
    }

    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        CurrentConditionDisplay displayObject = new CurrentConditionDisplay(weatherData);
        weatherData.setMeasurement(20f,30f,1.1f);
    }
}
