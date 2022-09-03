package Shapes.Ovals;

import Shapes.Shape;

public abstract class Oval extends Shape {

    public Oval(String shapeName) {
        super(shapeName);
    }

    public abstract double getPerimeter();

    public abstract double getArea();
}
