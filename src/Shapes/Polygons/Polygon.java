package Shapes.Polygons;

import Shapes.Shape;

public abstract class Polygon extends Shape {

    public Polygon(String shapeName) {
        super(shapeName);
    }

    public abstract double getPerimeter();

    public abstract double getArea();
}
