package org.example.observer;

import java.util.ArrayList;
import java.util.List;

public class ObservableImpl implements Observable {
    private List<Observer> observers = new ArrayList<>();
    private int value;
    @Override
    public void addObserver(Observer observer) {
        if(observer != null && !observers.contains(observer)) {
            observers.add(observer);
        }
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for(Observer observer : observers) {
            observer.update(this);
        }

    }

    public void setStatus(int value){
        this.value = value;
        notifyObservers();
    }

    public int getStatus(){
        return value;
    }
}
