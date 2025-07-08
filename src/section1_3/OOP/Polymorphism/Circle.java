package section1_3.OOP.Polymorphism;

// Implement nhiều hình khác nhau
public class Circle implements Shape {
    private double radius;
    public Circle(double radius) { this.radius = radius; }
    public double area() { return Math.PI * radius * radius; }
}
