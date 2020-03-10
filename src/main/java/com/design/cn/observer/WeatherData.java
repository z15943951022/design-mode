package com.design.cn.observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Subject {

    private float temperature;

    private float pressure;

    private float humidity;

    private List<Observer> observers =new ArrayList<>();


    public void update(float temperature , float pressure, float humidity){
        this.temperature=temperature;
        this.pressure=pressure;
        this.humidity=humidity;
        notifyObserver();
    }

    @Override
    public void registryObserver(Observer observer){
        observers.add(observer);
    }

    @Override
    public void remove(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObserver() {
        for (Observer observer : observers) {
            observer.update(temperature,pressure,humidity);
        }
    }
}
