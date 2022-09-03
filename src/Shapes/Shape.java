package Shapes;

public abstract class Shape {
    private final String SHAPE_NAME;

    public Shape(String shapeName) {
        SHAPE_NAME = shapeName;
    }

    public String getName() {
        return SHAPE_NAME;
    }
}
