package com.kodilla.testing.shape;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;


public class ShapeCollectorTestSuite {
    private ShapeCollector shapesList = new ShapeCollector();

    @Before
    public void init(){
        shapesList.addShape(new Triangle("Triangle", 20.0));
        shapesList.addShape(new Square("Square", 21.0));
        shapesList.addShape(new Circle("Circle", 19.0));
    }

    @Test
    public void testAddShape(){
        Assert.assertTrue( shapesList.addShape(new Triangle("Triangle", 16.0)));

    }

    @Test
    public void testRemoveShape(){
        Assert.assertTrue(shapesList.removeShape(new Square("square", 20.0)));
    }

    @Test
    public void testGetFigure(){
        Assert.assertEquals(new Triangle("Triangle", 20.0), shapesList.getFigure(0));
    }
    @Test
    public void testShowFigures(){

    }

}
