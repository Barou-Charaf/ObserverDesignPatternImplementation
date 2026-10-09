package org.example.observer;



public abstract class Observable {
    public abstract void addObserver(Observer observer);
    public abstract void removeObserver(Observer observer);
    public abstract void notifyAll(int a, int b , int c);
}
