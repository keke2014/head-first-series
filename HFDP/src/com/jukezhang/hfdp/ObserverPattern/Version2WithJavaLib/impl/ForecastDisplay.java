package com.jukezhang.hfdp.ObserverPattern.Version2WithJavaLib.impl;

import com.jukezhang.hfdp.ObserverPattern.Version1.DisplayElement;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by juke.zjk on 2015/12/6 006.
 */
public class ForecastDisplay implements Observer, DisplayElement {
    Observable observable;
    private float currentPressure = 29.92f;
    private float lastPressure;

    public ForecastDisplay(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof WeatherData) {
            WeatherData weatherData = (WeatherData)o;
            lastPressure = currentPressure;
            currentPressure = weatherData.getPressure();
            display();
        }
    }

    @Override
    public void display() {
        if (Math.abs(currentPressure-lastPressure) < 0.000001) {
            System.out.println("More of the same");
        } else if (currentPressure-lastPressure > 0) {
            System.out.println("Forecast: Improving weather on the way!");
        } else if (currentPressure-lastPressure < 0) {
            System.out.println("Watch out for cooler, rainy weather");
        }
    }
}
