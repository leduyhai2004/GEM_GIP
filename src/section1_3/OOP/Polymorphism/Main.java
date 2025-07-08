package section1_3.OOP.Polymorphism;

import java.util.List;

// Sử dụng
public class Main {
    public static void main(String[] args) {
        Shape c = new Circle(5);
        Shape r = new Rectangle(4, 6);

        AreaCalculator calc = new AreaCalculator();
        System.out.println("Circle area: " + calc.calc(c));      // động
        System.out.println("Total area: " + calc.calc(List.of(c, r))); // nạp chồng
    }
}
