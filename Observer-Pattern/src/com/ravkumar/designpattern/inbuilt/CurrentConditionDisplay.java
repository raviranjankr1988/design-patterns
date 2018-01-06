package com.ravkumar.designpattern.inbuilt;

import com.ravkumar.designpattern.DisplayElement;

import java.util.Observable;
import java.util.Observer;


public class CurrentConditionDisplay implements Observer,DisplayElement {

    Observable observable;
    private float temperature;
    private float humidity;
    private float pressure;

    public CurrentConditionDisplay(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }

    @Override
    public void update(Observable obs, Object arg) {
        if(obs instanceof WeatherData){
            WeatherData weatherData = (WeatherData) obs;
            this.temperature = weatherData.getTemperature();
            this.humidity = weatherData.getHumidity();
            this.pressure = weatherData.getPressure();
            disply();
        }
    }

    @Override
    public void disply() {
        System.out.println("Current Conditions : ");
        System.out.println("Temperature : " + this.temperature);
        System.out.println("Humidity : " + this.humidity);
        System.out.println("Pressure : " + this.pressure);

    }

    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        CurrentConditionDisplay displayObject = new CurrentConditionDisplay(weatherData);
        weatherData.setMeasurements(20f,30f,1.1f);
    }
}
