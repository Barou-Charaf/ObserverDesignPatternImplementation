package org.example;


import org.example.observer.*;

public class Main {
    public static void main(String[] args) {

        Observable observable = new ObservableImpl();
        Observer  observer = new ObserverImpl1();
        Observer observer2 = new ObserverImpl2();


        observable.addObserver(observer);
        observable.addObserver(observer2);

        System.out.println("================================");
        observable.notifyAll(1,1,1);
        System.out.println("================================");

        observable.notifyAll(2,2,2);
        System.out.println("================================");



        observable.notifyAll(3,3,3);
        System.out.println("================================");

        observable.notifyAll(4,4,4);
        System.out.println("================================");

        observable.notifyAll(5,5,5);


    }
}