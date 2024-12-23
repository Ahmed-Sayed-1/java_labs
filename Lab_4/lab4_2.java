import java.util.ArrayList;
import java.util.List;
import lab4.*;
class lab4_2 {
    public static void main(String[] args) {
        List<Rectangle> rectangles = new ArrayList<>();
        rectangles.add(new Rectangle());
        rectangles.add(new Rectangle());

        List<Shape> shapes = new ArrayList<>();
        shapes.add(new Rectangle());
        shapes.add(new Circle());

        System.out.println("Drawing Rectangles:");
        ShapeTest.drawShapes(rectangles);

        System.out.println("Drawing Shapes:");
        ShapeTest.drawShapes(shapes);
    }
}

