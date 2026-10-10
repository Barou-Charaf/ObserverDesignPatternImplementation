package org.example.observer;

public class ObserverImpl1 implements Observer {
    @Override
    public void update(Observable observable) {
        if(observable instanceof ObservableImpl){
        System.out.println("ObserverImpl1 update ==========================");
        System.out.println("new provided value : "+((ObservableImpl)observable).getStatus());
        System.out.println("===========================================");

        }
    }
}
