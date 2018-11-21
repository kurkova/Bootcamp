package com.kodilla.testing.shape;

public class Circle implements Shape {
    private String name;
    private double field;

    public Circle(String name, double field) {
        this.name = name;
        this.field = field;
    }

    public String getName() {
        return name;
    }

    public double getField() {
        return field;
    }

    public String  getShapeName(){
        name = "circle"
        return name;
    }

    public double getField(double r){
        field = r^2* 3.14;
        return field;
    }
}
