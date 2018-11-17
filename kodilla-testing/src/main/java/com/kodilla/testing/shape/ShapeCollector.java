package com.kodilla.testing.shape;

import java.util.ArrayList;
import java.util.List;

public class ShapeCollector {
        Shape shape;
        public List<Shape> theShape = new ArrayList<>();

        public void addShape(Shape shape) {

            theShape.add(shape);
        }

        public void removeShape(Shape shape) {
            theShape.remove(shape);
        }

        public void getFigure(int n) {
            theShape.get(n);
        }

        public void showFigures() {
            for (int n = 0; n < theShape.size(); n++) {
                System.out.println(theShape.get(n));
            }
        }

}