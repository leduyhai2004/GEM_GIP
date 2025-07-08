package section1_3.OOP.Inheritance;

// Lớp con 1: Car
public class Car extends Vehicle {
    private int seatCount;

    public Car(String model, int year, int seatCount) {
        super(model, year);
        this.seatCount = seatCount;
    }

    @Override
    public void start() {
        super.start();
        System.out.println("Car with " + seatCount + " seats is ready to go.");
    }
}
