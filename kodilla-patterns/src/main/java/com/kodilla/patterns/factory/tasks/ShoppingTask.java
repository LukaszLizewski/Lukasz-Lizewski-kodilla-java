package com.kodilla.patterns.factory.tasks;

public class ShoppingTask implements Tasks{
    final String taskName;
    final String whatToBuy;
    final double quantity;

    public ShoppingTask(String taskName, String whatToBuy, double quantity) {
        this.taskName = taskName;
        this.whatToBuy = whatToBuy;
        this.quantity = quantity;
    }
    @Override
    public void executeTask () {
        System.out.println("execute task -> shopping -> status: done");
    }
    @Override
    public String getTaskName() {
        return taskName;
    }
    @Override
    public boolean isTaskExecuted() {
        return true;
    }
}
