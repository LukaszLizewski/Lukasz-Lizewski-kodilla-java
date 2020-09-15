package com.kodilla.spring.portfolio;

import java.util.ArrayList;
import java.util.List;

public class TaskList {
    private final List tasks;
    public TaskList() {
        tasks = new ArrayList<>();
    }
    public List getTasks() {
        return tasks;
    }
}
