package com.kodilla.spring.portfolio;

import java.util.ArrayList;
import java.util.List;

public class TaskList {
    private List<String> tasks;

    public TaskList() {
        this.tasks = new ArrayList<>();
    }

    public void addTask(String string) {
        tasks.add(string);
    }

    public String getTask(int i) {
        String entry = tasks.get(i);
        return entry;
    }
}
