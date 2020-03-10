package com.design.cn.observer;

import java.util.Objects;

public class CurrentCondtitions implements Observer {
    private float temperature;

    private float pressure;

    private float humidity;

    public void update(float temperature ,float pressure,float humidity){
        this.temperature=temperature;
        this.pressure=pressure;
        this.humidity=humidity;
        toString();
    }

    @Override
    public String toString() {
        System.out.println( "CurrentCondtitions{" +
                "temperature=" + temperature +
                ", pressure=" + pressure +
                ", humidity=" + humidity +
                '}');
        return "";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CurrentCondtitions that = (CurrentCondtitions) o;
        return Float.compare(that.temperature, temperature) == 0 &&
                Float.compare(that.pressure, pressure) == 0 &&
                Float.compare(that.humidity, humidity) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(temperature, pressure, humidity);
    }
}
