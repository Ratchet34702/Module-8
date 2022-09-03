import Printers.ShapePrinter;
import Printers.ShapePrinterImpl;
import Shapes.Ovals.Circle;
import Shapes.Ovals.Ellipse;
import Shapes.Polygons.IrregularPolygon;
import Shapes.Curves.Polyline;
import Shapes.Points.Point;
import Shapes.Polygons.RegularPolygon;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ShapePrinter shapePrinter = new ShapePrinterImpl();
        shapePrinter.print(new Ellipse( 5));
        shapePrinter.print(new Circle(2));
        shapePrinter.print(new Point());
        shapePrinter.print(new IrregularPolygon(new ArrayList<>()));
        shapePrinter.print(new RegularPolygon(5, 10));
        shapePrinter.print(new Polyline(new ArrayList<>()));
    }
}