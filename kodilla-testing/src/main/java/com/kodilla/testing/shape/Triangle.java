package com.kodilla.testing.shape;

public class Triangle implements Shape {
    private String name;
    private double field;

    public Triangle(String name, double field) {
        this.name = name;
        this.field = field;
    }

    public String getName() {
        return name;
    }

    public String getShapeName(){
        return "Triangle";
    }

    public double getField(){
        return 0.00;
    }
}

