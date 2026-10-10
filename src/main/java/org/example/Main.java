package org.example;


import org.example.observer.*;

public class Main {
    public static void main(String[] args) {

        Observable observable= new ObservableImpl();

        Observer observer1 =new ObserverImpl1();
        Observer observer2 =new ObserverImpl2();

        observable.addObserver(observer1);
        observable.addObserver(observer2);

        observable.setStatus(100);
        observable.setStatus(20);
        observable.setStatus(-40);



    }
}