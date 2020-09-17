package com.kodilla.patterns.factory.tasks;

public class DrivingTask implements Tasks{
    final String taskName;
    final String where;
    final String using;

    public DrivingTask(String taskName, String where, String using) {
        this.taskName = taskName;
        this.where = where;
        this.using = using;
    }
    @Override
    public void executeTask() {
        System.out.println("execute task -> driving -> status: undone");
    }
    @Override
    public String getTaskName() {
        return taskName;
    }
    @Override
    public boolean isTaskExecuted() {
        return false;
    }
    public String getWhere() {
        return where;
    }
    public String getUsing() {
        return using;
    }
}
