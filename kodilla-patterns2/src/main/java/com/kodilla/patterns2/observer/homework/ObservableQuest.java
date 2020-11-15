package com.kodilla.patterns2.observer.homework;

public interface ObservableQuest {
    void registerObserver (ObserverQuest observerQuest);
    void notifyObservers();
    void removeObserver (ObserverQuest observerQuest);
}
