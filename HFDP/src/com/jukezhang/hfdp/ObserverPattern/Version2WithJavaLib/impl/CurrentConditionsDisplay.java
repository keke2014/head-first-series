package com.jukezhang.hfdp.ObserverPattern.Version2WithJavaLib.impl;

import com.jukezhang.hfdp.ObserverPattern.Version2WithJavaLib.DisplayElement;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by juke.zjk on 2015/12/6 006.
 */
public class CurrentConditionsDisplay implements Observer, DisplayElement {
    private float temprature;
    private float humidity;
    Observable observable;

    public CurrentConditionsDisplay(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }

    @Override
    public void update(Observable obs, Object arg) {
        if (obs instanceof WeatherData) {
            WeatherData weatherData = (WeatherData)obs;
            this.temprature = weatherData.getTemperature();
            this.humidity = weatherData.getHumidity();
            display();
        }
    }

    @Override
    public void display() {
        System.out.println("Current conditions: "+temprature+"F degrees and "+humidity+"% humidity");
    }
}
