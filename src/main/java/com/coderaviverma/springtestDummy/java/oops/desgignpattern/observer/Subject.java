package com.coderaviverma.springtestDummy.java.oops.desgignpattern.observer;

public interface Subject {
    void addObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers();
}