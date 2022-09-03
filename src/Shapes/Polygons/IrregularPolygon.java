package Shapes.Polygons;

import Shapes.Points.Point;

import java.util.ArrayList;
import java.util.List;

public class IrregularPolygon extends Polygon {
    private static final String SHAPE_NAME = "Irregular Polygon";
    private List<Point> points;

    public IrregularPolygon(List<Point> points) {
        super(SHAPE_NAME);
        this.points = new ArrayList<>(points);
    }

    @Override
    public double getPerimeter() {
        double length = 0;
        for (int index = 0; index < points.size() - 1; index++) {
            length += points.get(index).distance(points.get(index + 1));
        }
        length += points.get(0).distance(points.get(getVertexCount() - 1));
        return length;
    }

    @Override
    public double getArea() {
        return 0;
    }

    public List<Point> getPoints() {
        return new ArrayList<>(points);
    }

    public int getVertexCount() {
        return points.size();
    }

}
