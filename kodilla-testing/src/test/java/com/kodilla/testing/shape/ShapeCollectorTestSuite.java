package com.kodilla.testing.shape;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringJoiner;
import java.util.stream.Collectors;


public class ShapeCollectorTestSuite {
    private ShapeCollector shapesList = new ShapeCollector();

    @Before
    public void init() {
        shapesList.addShape(new Triangle("Triangle", 20.0));
        shapesList.addShape(new Square("Square", 21.0));
        shapesList.addShape(new Circle("Circle", 19.0));
    }

    @Test
    public void testAddShape() {
        shapesList.addShape(new Triangle("Triangle", 15.00));
        Assert.assertEquals(4, shapesList.size());
        Assert.assertEquals(new Triangle("Triangle", 15.00), shapesList.getFigure(3));
    }

    @Test
    public void testRemoveShape() {
        shapesList.removeShape(new Circle("Circle", 19.0));
        Assert.assertEquals(2, shapesList.size());
    }

    @Test
    public void testGetFigure() {
        Assert.assertEquals(new Triangle("Triangle", 20.0), shapesList.getFigure(0));
    }

    @Test
    public void testShowFigures() {
        Assert.assertEquals("Triangle,Square,Circle", shapesList.showFigures());
    }
}
