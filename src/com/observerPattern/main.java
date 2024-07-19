package com.observerPattern;

import com.observerPattern.interfaces.IObserver;

public class main {
    public static void main(String[] args) {
        WeatherStation weatherStation = new WeatherStation();
        IObserver phoneDisplay = new PhoneDisplay();
        IObserver windowDisplay = new WindowDisplay();

        weatherStation.attach(phoneDisplay);
        weatherStation.attach(windowDisplay);

        weatherStation.setTemperature(25.5f);
        weatherStation.setTemperature(30.0f);

        weatherStation.detach(phoneDisplay);
        weatherStation.setTemperature(20.0f);

    }
}
