package org.example.observer;

import java.util.ArrayList;
import java.util.List;

public class ObservableImpl extends Observable {

    List<Observer> observers = new ArrayList<>();

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }


    public void notifyAll(int a, int b , int c){
        for(var observer:observers){
            observer.update(a,b,c);
        }
    }
}
