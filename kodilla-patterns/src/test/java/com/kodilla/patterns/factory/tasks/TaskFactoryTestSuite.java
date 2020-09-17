package com.kodilla.patterns.factory.tasks;

import com.kodilla.patterns.prototype.Task;
import org.junit.Assert;
import org.junit.Test;

public class
TaskFactoryTestSuite {
    @Test
    public void testDrivingTask(){
        //Given
        TaskFactory taskFactory = new TaskFactory();
        //When
        Tasks drivingTask = taskFactory.doTask(TaskFactory.DRIVINGTASK);
        drivingTask.executeTask();
        //Then
        Assert.assertEquals(false,drivingTask.isTaskExecuted());
        Assert.assertEquals("DRIVING TASK",drivingTask.getTaskName());
    }
    @Test
    public void testPaintingTask(){
        //Given
        TaskFactory taskFactory = new TaskFactory();
        //When
        Tasks paintingTask = taskFactory.doTask(TaskFactory.PAINTINGTASK);
        paintingTask.executeTask();
        //Then
        Assert.assertEquals(true,paintingTask.isTaskExecuted());
        Assert.assertEquals("PAINTING TASK",paintingTask.getTaskName());
    }
    @Test
    public void testShoppingTask(){
        //Given
        TaskFactory taskFactory = new TaskFactory();
        //When
        Tasks shoppingTask = taskFactory.doTask(TaskFactory.SHOPPINGTASK);
        shoppingTask.executeTask();
        //Then
        Assert.assertEquals(true,shoppingTask.isTaskExecuted());
        Assert.assertEquals("SHOPPING TASK",shoppingTask.getTaskName());
    }
}
