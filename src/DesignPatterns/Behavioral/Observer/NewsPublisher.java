package DesignPatterns.Behavioral.Observer;

import java.util.ArrayList;
import java.util.List;

public class NewsPublisher implements Subject {
    private List<Observer> observerList=new ArrayList<>();
    @Override
    public void addObserver(Observer observer) {
        observerList.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observerList.remove(observer);
    }

    @Override
    public void notifyObservers(String news) {
        for(Observer observer:observerList){
            observer.update("Message published");
        }
    }
}
