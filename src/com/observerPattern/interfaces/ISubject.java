package com.observerPattern.interfaces;
import java.util.ArrayList;
import java.util.List;


public interface ISubject {
    void attach(IObserver o);
    void detach(IObserver o);
    void notifyObservers();
}
