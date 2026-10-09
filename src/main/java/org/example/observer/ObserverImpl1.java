package org.example.observer;

public class ObserverImpl1 implements Observer {
    private int length=2 ;
    private int width =2;
    private int height =2;

    @Override
    public void update(int length, int width, int height) {
        this.length = length;
        this.width = width;
        this.height = height;
        this.calculate();
    }


    @Override
    public int calculate() {
        System.out.println("result with *  is : "+this.length*this.width*this.height);
        return this.length*this.width*this.height;
    }
}
