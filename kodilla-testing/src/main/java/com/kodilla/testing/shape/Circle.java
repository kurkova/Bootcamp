package com.kodilla.testing.shape;

public class Circle implements Shape {
    private String name;
    private double field;

    public Circle(String name, double field) {
        this.name = name;
        this.field = field;
    }

    public String getShapeName() {
        return "Circle";
    }


    public double getField() {
        return 0.00;
    }

}


