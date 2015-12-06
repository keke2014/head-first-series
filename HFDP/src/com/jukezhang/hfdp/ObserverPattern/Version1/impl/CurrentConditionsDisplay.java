package com.jukezhang.hfdp.ObserverPattern.Version1.impl;

import com.jukezhang.hfdp.ObserverPattern.Version1.DisplayElement;
import com.jukezhang.hfdp.ObserverPattern.Version1.Observer;
import com.jukezhang.hfdp.ObserverPattern.Version1.Subject;

/**
 * Created by juke.zjk on 2015/12/6 006.
 */
public class CurrentConditionsDisplay implements Observer, DisplayElement {
    private float temprature;
    private float humidity;
    private Subject weatherData;

    public CurrentConditionsDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update(float temprature, float humidity, float pressure) {
        this.temprature = temprature;
        this.humidity = humidity;
        display();
    }

    @Override
    public void display() {
        System.out.println("Current conditions: "+temprature+"F degrees and "+humidity+"% humidity");
    }
}
