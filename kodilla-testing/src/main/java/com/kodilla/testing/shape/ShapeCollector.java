package com.kodilla.testing.shape;

import java.util.ArrayList;
import java.util.List;

public class ShapeCollector {

    private List<Shape> theShapesList = new ArrayList();

    public  Boolean addShape(Shape shape){
        theShapesList.add(shape);
        return true;
    }

    public  Boolean removeShape(Shape shape){

        return false;
    }

    public Shape getFigure(int n){
        return theShapesList.get(n);
    }

    public void showFigures(){
        //
    }

    public int size(){
        return theShapesList.size();
    }

}
