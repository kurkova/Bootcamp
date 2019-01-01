package com.kodilla.patterns.factory.tasks;

import org.junit.Assert;
import org.junit.Test;

public class TaskFactoryTestSuite {
    private TaskFactory task = new TaskFactory();

    @Test
    public void testFactoryShopping() {
        //Given
        //When
        Task shopping = task.makeTask(TaskFactory.SHOPPING);
        //Then
        Assert.assertEquals("Buy new clothes", shopping.getTaskName());
    }

    @Test
    public void testFactoryPainting() {
        //Given
        //When
        Task painting = task.makeTask(TaskFactory.PAINTING);
        //Then
        Assert.assertEquals("Painting new house", painting.getTaskName());
    }

    @Test
    public void testFactoryDriving() {
        //Given
        //When
        Task driving = task.makeTask(TaskFactory.DRIVING);
        //Then
        Assert.assertEquals("Travel to airport", driving.getTaskName());
    }
}

