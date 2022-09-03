package Shapes.Points;

import Shapes.Shape;

public class Point extends Shape {
    private static final String SHAPE_NAME = "Point";
    private double x;
    private double y;

    public Point(double x, double y) {
        super(SHAPE_NAME);
        this.setCoordinates(x, y);
    }

    public Point() {
        this(0, 0);
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void setCoordinates(double x, double y) {
        this.setX(x);
        this.setY(y);
    }

    public double distance(Point point) {
        return Math.sqrt(Math.pow((point.getX() - x), 2) + Math.pow((point.getY() - y), 2));
    }

}
