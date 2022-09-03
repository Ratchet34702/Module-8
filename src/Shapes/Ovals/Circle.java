package Shapes.Ovals;

import Shapes.Points.Point;

public class Circle extends Oval {

    private static final String SHAPE_NAME = "Circle";
    private Point center;
    private double radius;

    public Circle(Point center, double radius) {
        super(SHAPE_NAME);
        this.center = center;
        this.radius = radius;
    }

    public Circle(double radius) {
        this(new Point(), radius);
    }

    public Point getCenter() {
        return center;
    }

    public void setCenter(Point center) {
        this.center = center;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getPerimeter() {
        return 0;
    }

    @Override
    public double getArea() {
        return 0;
    }
}
