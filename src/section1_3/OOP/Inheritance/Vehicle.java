package section1_3.OOP.Inheritance;

// Lớp cha chung
public class Vehicle {
    protected String model;
    protected int year;

    public Vehicle(String model, int year) {
        this.model = model;
        this.year = year;
    }

    public void start() {
        System.out.println("Starting vehicle: " + model);
    }
}

