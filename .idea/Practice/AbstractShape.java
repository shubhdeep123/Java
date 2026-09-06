package Practice;

import java.util.ArrayList;
import java.util.List;

public class AbstractShape {
    public static void main (String[] args) {
        Shape circle = new Circle();
        Shape rectangle = new Rectangle();
        Shape triangle = new Triangle();

        List<Shape> shapes = new ArrayList<>();
        shapes.add(circle);
        shapes.add(rectangle);
        shapes.add(triangle);

        // calling area with shape interface reference
        for (Shape shape : shapes) {
            shape.area();
        }

    }
}

abstract class Shape {
    abstract void area();
    abstract void perimeter();
}

class Circle extends Shape {
    @Override
    void area() {
        System.out.println("Area of Circle");
    }
}

class Rectangle extends Shape {
    @Override
    void area() {
        System.out.println("Area of Rectangle");
    }
}

class Triangle extends Shape {
    @Override
    void area() {
        System.out.println("Area of Triangle");
    }
}
