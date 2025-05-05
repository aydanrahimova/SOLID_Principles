package O_OpenClosed.badExample;

/**
 * BAD EXAMPLE of the Open/Closed Principle (OCP).
 * This class breaks OCP because every time a new shape is added,
 * we must modify the existing `calculateArea` method.
 * The class is NOT closed for modification — any extension requires editing this code.
 */
public class Shape {
    public double calculateArea(Object shape) {
        if (shape instanceof Circle circle) {
            return Math.PI * circle.getRadius() * circle.getRadius();
        } else if (shape instanceof Rectangle rectangle) {
            return rectangle.getLength() * rectangle.getWidth();
        }
        // What if we add Triangle? We must modify this method again!
        return 0;
    }
}
