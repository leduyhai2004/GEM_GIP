package section1_3.OOP.Polymorphism;

public class Rectangle implements Shape {
    private double width, height;
    public Rectangle(double w, double h) {
        this.width = w; this.height = h;
    }
    public double area() { return width * height; }
}
