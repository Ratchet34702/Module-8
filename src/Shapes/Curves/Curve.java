package Shapes.Curves;

import Shapes.Shape;

public abstract class Curve extends Shape {

    public Curve(String shapeName) {
        super(shapeName);
    }

    public abstract double getLength();

}
