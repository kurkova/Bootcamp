package com.kodilla.patterns.factory.tasks;

import org.junit.Assert;
import org.junit.Test;

public class TaskFactoryTestSuite {
    TaskFactory task = new TaskFactory();

    @Test
    public void testFactoryShopping() {
        //Given
        //When
        Task shopping = task.makeTask(TaskFactory.SHOPPING);
        shopping.executeTask();
        //Then
        Assert.assertEquals("Buy new clothes", shopping.getTaskName());
        Assert.assertEquals(true, shopping.isTaskExecuted());
    }

    @Test
    public void testFactoryPainting() {
        //Given
        //When
        Task painting = task.makeTask(TaskFactory.PAINTING);
        painting.executeTask();
        //Then
        Assert.assertEquals("Painting new house", painting.getTaskName());
        Assert.assertEquals(true, painting.isTaskExecuted());
    }

    @Test
    public void testFactoryDriving() {
        //Given
        //When
        Task driving = task.makeTask(TaskFactory.DRIVING);
        driving.executeTask();
        //Then
        Assert.assertEquals("Travel to airport", driving.getTaskName());
        Assert.assertEquals(true, driving.isTaskExecuted());
    }
}

