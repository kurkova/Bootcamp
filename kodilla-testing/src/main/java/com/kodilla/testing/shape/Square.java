package com.kodilla.testing.shape;

import java.util.Objects;

public class Square implements Shape {
    private String name;
    private double field;

    public Square(String name, double field) {
        this.name = name;
        this.field = field;
    }

    public String getShapeName() {
        return "Square";
    }

    public double getField() {
        return 0.00;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Square square = (Square) o;
        return Double.compare(square.field, field) == 0 &&
                Objects.equals(name, square.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, field);
    }
}


