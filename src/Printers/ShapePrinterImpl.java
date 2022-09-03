package Printers;

import Shapes.Shape;

public class ShapePrinterImpl implements ShapePrinter {
    @Override
    public void print(Shape shape) {
        System.out.println(shape.getName());
    }
}
