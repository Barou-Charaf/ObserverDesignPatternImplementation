package org.example.observer;

public class ObserverImpl2 implements Observer {
    private int length =1;
    private int width =1;
    private int height =1;

    @Override
    public void update(int length, int width, int height) {
        this.length = length;
        this.width = width;
        this.height = height;
        this.calculate();
    }


    @Override
    public int calculate() {
        System.out.println("result with +  is : "+(this.length+this.width+this.height));
        return this.height+this.length+this.width;
    }
}
