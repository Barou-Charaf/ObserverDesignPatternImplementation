package org.example.observer;

import java.util.ArrayList;
import java.util.List;

public class ObserverImpl2 implements Observer {

    List<Integer> history = new ArrayList<>();

    @Override
    public void update(Observable observable) {
        if (observable instanceof ObservableImpl) {
            System.out.println("implementation2 update ==============================");
            addToHistory(((ObservableImpl)observable).getStatus());
            double sum=0;
            for (var ele : history) {
                sum += ele;
            }
            System.out.println("Observer implementation 2 result  : " +sum);

        }
    }
    public void addToHistory(int value){
        history.add(value);
    }
}
