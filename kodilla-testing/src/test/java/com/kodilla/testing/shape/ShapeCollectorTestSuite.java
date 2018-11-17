package com.kodilla.testing.shape;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ShapeCollectorTestSuite {

    @Test
    public void testAddShape() {

        List<Shape> intShape = Arrays.asList("triangle")<>();

        ShapeCollector shapeCollector = new ShapeCollector();
        List<Shape> result = shapeCollector.addShape(new Shape());



