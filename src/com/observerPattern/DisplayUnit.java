package com.observerPattern;

import com.observerPattern.interfaces.IObserver;

class PhoneDisplay implements IObserver {
    @Override
    public void update(float temperature) {
        System.out.println("Phone display: Temperature updated to " + temperature + " degrees.");
    }
}

class WindowDisplay implements IObserver {
    @Override
    public void update(float temperature) {
        System.out.println("Window display: Temperature updated to " + temperature + " degrees.");
    }
}

