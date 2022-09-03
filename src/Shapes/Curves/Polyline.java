package Shapes.Curves;

import Shapes.Points.Point;

import java.util.Arrays;
import java.util.List;

public class Polyline extends Curve {
    private static final String SHAPE_NAME = "Polyline";
    private List<Point> points;

    public Polyline(List<Point> points) {
        super(SHAPE_NAME);
        this.points = points;
    }

    public Polyline(Point[] points) {
        this(Arrays.asList(points));
    }

    public Point getPoint(int number) {
        return points.get(number);
    }

    public List<Point> getPoints() {
        return points;
    }

    public int getVertexCount() {
        return points.size();
    }

    @Override
    public double getLength() {
        double length = 0;
        for (int index = 0; index < getVertexCount() - 1; index++) {
            length += points.get(index).distance(points.get(index + 1));
        }
        return length;
    }

}
