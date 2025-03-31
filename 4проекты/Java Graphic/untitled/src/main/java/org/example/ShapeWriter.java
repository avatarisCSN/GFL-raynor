package org.example;

public class ShapeWriter {
    private final Shape shape;

    public ShapeWriter(Shape shape) {
        this.shape = shape;
    }
public String getName(){
        return shape.getName();
}
}
