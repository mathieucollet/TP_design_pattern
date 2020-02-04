package fr.mds.designpattern.observertraining;

public interface Subject<T extends Observer> {

    void attach(T observer);

    void detach(T observer);

    void notifyEvent(String msg);
}
