package com.kodilla.patterns.factory.tasks;

public final class TaskFactory {
    public static final String DRIVINGTASK = "DRIVING TASK";
    public static final String PAINTINGTASK = "PAINTING TASK";
    public static final String SHOPPINGTASK = "SHOPPING TASK";
    public final Tasks doTask (final String doTask){
        switch (doTask){
            case DRIVINGTASK:
                return new DrivingTask("DRIVING TASK", "New York City","motorbike");
            case PAINTINGTASK:
                return new PaintingTask("PAINTING TASK", "white","wall");
            case SHOPPINGTASK:
                return new ShoppingTask("SHOPPING TASK", "eggs", 3.56);
            default:
                return null;
        }
    }
}
