package com.design.cn.observer;

public interface Subject {

    void registryObserver(Observer observer);

    void remove(Observer observer);

    void notifyObserver();
}
