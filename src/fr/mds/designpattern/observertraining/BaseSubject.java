package fr.mds.designpattern.observertraining;

import java.util.ArrayList;
import java.util.List;

public abstract class BaseSubject<T extends Observer> implements Subject<T> {
    private final List<T> observers = new ArrayList<>();

    @Override
    public void attach(T observer) {
        if (!this.observers.contains(observer)) {
            this.observers.add(observer);
        }
    }

    @Override
    public void detach(T observer) {
        if (this.observers.contains(observer)) {
            this.observers.remove(observer);
        }
    }

    @Override
    public void notifyEvent(String msg) {
        for (Observer observer : observers) {
            observer.update(msg);
        }
    }
}
