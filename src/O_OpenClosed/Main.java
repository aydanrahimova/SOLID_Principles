package O_OpenClosed;

import O_OpenClosed.badExample.Shape;
import O_OpenClosed.goodExample.Circle;

public class Main {
    public static void main(String[] args) {
        //good example
        Circle circle = new Circle(5);
        System.out.println(circle.calculateArea());

        //bad example
        Shape shape = new Shape();
        O_OpenClosed.badExample.Circle circle1 = new O_OpenClosed.badExample.Circle(5);
        System.out.println(shape.calculateArea(circle1));

    }
}
