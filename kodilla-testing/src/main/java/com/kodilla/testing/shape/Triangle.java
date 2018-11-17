package com.kodilla.testing.shape;

public class Triangle implements Shape {
    private String name;
    //private double field;

    public String  getShapeName(){
        name = "triangle";
        return name;
    }

    /*public double getField(double a, double h){
        field = (a * h)/2;
        return field;
    }*/
}
