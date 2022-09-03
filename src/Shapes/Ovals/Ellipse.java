package Shapes.Ovals;

import Shapes.Points.Point;

public class Ellipse extends Oval {

    private static final String SHAPE_NAME = "Ellipse";
    private Point firstFocus;
    private Point secondFocus;
    private double focusDistance;

    public Ellipse(Point firstFocus, Point secondFocus, double focusDistance) {
        super(SHAPE_NAME);
        this.firstFocus = firstFocus;
        this.secondFocus = secondFocus;
        this.focusDistance = focusDistance;
    }

    public Ellipse(double focusDistance) {
        this(new Point(), new Point(), focusDistance);
    }

    public Point getFirstFocus() {
        return firstFocus;
    }

    public void setFirstFocus(Point firstFocus) {
        this.firstFocus = firstFocus;
    }

    public Point getSecondFocus() {
        return secondFocus;
    }

    public void setSecondFocus(Point secondFocus) {
        this.secondFocus = secondFocus;
    }

    public double getFocusDistance() {
        return focusDistance;
    }

    public void setFocusDistance(double focusDistance) {
        this.focusDistance = focusDistance;
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
