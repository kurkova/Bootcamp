package com.kodilla.patterns.factory.tasks;

import org.junit.Assert;
import org.junit.Test;

public class TaskFactoryTestSuite {
    private TaskFactory taskFactory = new TaskFactory();

    @Test
    public void testFactoryShopping() {
        //Given
        //When
        Task shopping = taskFactory.makeTask(TaskFactory.SHOPPING);
        //Then
        Assert.assertEquals("Buy new clothes", shopping.getTaskName());
    }

    @Test
    public void testFactoryPainting() {
        //Given
        //When
        Task painting = taskFactory.makeTask(TaskFactory.PAINTING);
        //Then
        Assert.assertEquals("Painting new house", painting.getTaskName());
    }

    @Test
    public void testFactoryDriving() {
        //Given
        //When
        Task driving = taskFactory.makeTask(TaskFactory.DRIVING);
        //Then
        Assert.assertEquals("Travel to airport", driving.getTaskName());
    }
}

