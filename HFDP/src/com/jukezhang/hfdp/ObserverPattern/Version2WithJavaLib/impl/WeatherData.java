package com.jukezhang.hfdp.ObserverPattern.Version2WithJavaLib.impl;

import lombok.Getter;

import java.util.Observable;

/**
 * Created by juke.zjk on 2015/12/6 006.
 */
public class WeatherData extends Observable {
    private @Getter float temperature;
    private @Getter float humidity;
    private @Getter float pressure;

    public WeatherData() { }

    public void measurementsChanged() {
        setChanged();
        notifyObservers();
    }

    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }
}
