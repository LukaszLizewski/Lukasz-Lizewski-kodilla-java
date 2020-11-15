package com.kodilla.patterns2.observer.homework;



import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

public class StudentQuest implements ObservableQuest {
    private final List<ObserverQuest> observers;
    private final ArrayDeque <String> quests;
    private final String studentName;

    public StudentQuest(String studentName) {
        observers = new ArrayList<>();
        quests = new ArrayDeque<>();
        this.studentName = studentName;
    }
    public void addQuest (String quest) {
        quests.addLast(quest);
        notifyObservers();
    }
    @Override
    public void registerObserver(ObserverQuest observerQuest) {
        observers.add(observerQuest);
    }
    @Override
    public void notifyObservers() {
        for (ObserverQuest observer : observers) {
            observer.update(this);
        }
    }
    @Override
    public void removeObserver(ObserverQuest observerQuest) {
        observers.remove(observerQuest);
    }
    public ArrayDeque<String> getQuests() {
        return quests;
    }
    public String getStudentName() {
        return studentName;
    }
}
