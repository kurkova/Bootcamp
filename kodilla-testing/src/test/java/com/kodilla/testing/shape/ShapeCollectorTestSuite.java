package com.kodilla.testing.shape;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ShapeCollectorTestSuite {

    @Test
    public void testAddShape(){
        //Given
        ShapeCollector testList = new ShapeCollector();
        List<Shape> shapesList = testList.addShape(new Triangle("Triangle", 20.0));
        Assert.assertEquals(1, shapesList.size());
    }
    @Test
    public void testRemoveShape(){
        ShapeCollector testList = new ShapeCollector();
        List<Shape> theShape = testList.removeShape();


        theShape =  testList.removeShape(new Triangle("Triangle", 20.0));

        Assert.assertEquals(0, theShape.size() );


    }




}
