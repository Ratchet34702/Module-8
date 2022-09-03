package Shapes.Polygons;

import Shapes.Points.Point;

import java.util.List;

public class RegularPolygon extends Polygon {

    private static final String SHAPE_NAME = "Regular Polygon";
    private int vertexCount;
    private double sideLength;

    public RegularPolygon(int vertexCount, double sideLength) {
        super(SHAPE_NAME);
        this.vertexCount = vertexCount;
        this.sideLength = sideLength;
    }

    public int getVertexCount() {
        return vertexCount;
    }

    public void setVertexCount(int vertexCount) {
        this.vertexCount = vertexCount;
    }

    public double getSideLength() {
        return sideLength;
    }

    public void setSideLength(double sideLength) {
        this.sideLength = sideLength;
    }

    @Override
    public double getPerimeter() {
        return sideLength * vertexCount;
    }

    @Override
    public double getArea() {
        return vertexCount * Math.pow(sideLength, 2) / (4 * Math.tan(Math.PI / vertexCount));
    }
}
