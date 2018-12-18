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
        String s = "";
        String coma = ", ";
        for (int i = 0; i < theShapesList.size(); i++) {
            if (i > 0) {
                s = s + coma + theShapesList.get(i).getShapeName();
            } else {
                s = s + theShapesList.get(i).getShapeName();
            }
        }
        return s;
    }

    public int size() {
        return theShapesList.size();
    }
}
