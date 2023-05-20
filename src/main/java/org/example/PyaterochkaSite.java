package org.example;

import java.util.ArrayList;
import java.util.List;

public class PyaterochkaSite implements Observed{
    private List<String> discounts = new ArrayList<>();
    private List<Observer> subscribers = new ArrayList<>();

    public void addDiscount(String discount) {
        this.discounts.add(discount);
        notifyObservers();
    }

    public void removeDiscount(String discount) {
        this.discounts.remove(discount);
        notifyObservers();
    }

    @Override
    public void addObserver(Observer observer) {
        this.subscribers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        this.subscribers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer: subscribers) {
            observer.handleEvent(discounts);
        }
    }
}
