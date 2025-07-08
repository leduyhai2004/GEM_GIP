package section1_3.OOP.Polymorphism;

import java.util.List;

// Utility class dùng đa hình
public class AreaCalculator {
    // Overloading: calc cho nhiều tham số
    public double calc(Shape shape) {
        return shape.area();
    }
    public double calc(List<Shape> shapes) {
        return shapes.stream().mapToDouble(Shape::area).sum();
    }
}
