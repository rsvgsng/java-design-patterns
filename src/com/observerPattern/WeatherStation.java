package com.observerPattern;

import com.observerPattern.interfaces.IObserver;
import com.observerPattern.interfaces.ISubject;

import java.util.ArrayList;
import java.util.List;

public class WeatherStation  implements ISubject {

    private List<IObserver> observers = new ArrayList<>();
    private float temperature;


    @Override
    public  void attach(IObserver o ){
        observers.add(o);
    }

    @Override
    public  void  detach(IObserver o ){
        observers.remove(o);
    }

    @Override
    public void notifyObservers(){
        for(IObserver observer : observers){
            observer.update(temperature);
        }
    }
    public void setTemperature(float temperature) {
        this.temperature = temperature;
        notifyObservers();
    }


}
