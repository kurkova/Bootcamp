package com.kodilla.patterns2.observer.homework;

import java.util.*;

public class StudentTask implements Observable {
    private final List<Observer> observers;
    private final Deque<String> tasks;
    private final String taskName;

    public StudentTask(String taskName) {
        observers = new ArrayList<>();
        tasks = new ArrayDeque<>();
        this.taskName = taskName;
    }

    public String getTaskName() {
        return taskName;
    }

    public Deque<String> getTasks() {
        return tasks;
    }

    public void addTask(String task) {
        tasks.offerLast(task);
        notifyObservers();
    }

    @Override
    public void registerObserve(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(this);
        }
    }
}
