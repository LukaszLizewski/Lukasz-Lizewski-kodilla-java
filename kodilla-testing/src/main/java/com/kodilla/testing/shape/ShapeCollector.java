package com.kodilla.testing.shape;
import java.util.ArrayList;

public class ShapeCollector {
    public ArrayList<Shape> shapes = new ArrayList<>();
    public void addFigure (Shape shape){
        shapes.add(shape);
    }
    public void removeFigure (Shape shape){
        shapes.remove(shape);
    }
    public int getFigure () {
        return shapes.size();
    }
}
