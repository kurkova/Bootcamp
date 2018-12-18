package com.kodilla.testing.shape;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringJoiner;
import java.util.stream.Collectors;

public class ShapeCollector {

    private List<Shape> theShapesList = new ArrayList();

    public void addShape(Shape shape) {
        theShapesList.add(shape);
    }

    public void removeShape(Shape shape) {
        theShapesList.remove(shape);
    }

    public Shape getFigure(int n) {
        return theShapesList.get(n);
    }

    public String showFigures() {

        String theResultStringOfShapes = theShapesList.stream()
                .map(Shape::toString)
                .collect(Collectors.joining(", "));
        return theResultStringOfShapes;
        }

    public int size() {
        return theShapesList.size();
    }
}
