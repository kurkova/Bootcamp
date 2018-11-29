package com.kodilla.testing.shape;

import java.util.ArrayList;
import java.util.List;

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

    public List<Shape> showFigures() {
        for (int n = 0; n < theShapesList.size(); n++) {
            theShapesList.get(n);
        }
        return theShapesList;
    }

    public int size() {
        return theShapesList.size();
    }
}
