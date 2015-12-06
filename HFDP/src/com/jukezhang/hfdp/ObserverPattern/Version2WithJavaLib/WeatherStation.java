package com.jukezhang.hfdp.ObserverPattern.Version2WithJavaLib;

import com.jukezhang.hfdp.ObserverPattern.Version2WithJavaLib.impl.CurrentConditionsDisplay;
import com.jukezhang.hfdp.ObserverPattern.Version2WithJavaLib.impl.ForecastDisplay;
import com.jukezhang.hfdp.ObserverPattern.Version2WithJavaLib.impl.WeatherData;

/**
 * Created by juke.zjk on 2015/12/6 006.
 */
public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);

        weatherData.setMeasurements(80, 65, 30.4f);
        weatherData.setMeasurements(82, 70, 29.2f);
        weatherData.setMeasurements(78, 90, 29.2f);
    }
}
