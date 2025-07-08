package section1_3.OOP.Inheritance;

// Lớp con 2: ElectricCar kế thừa Car
public class ElectricCar extends Car {
    private int batteryCapacity;

    public ElectricCar(String model, int year, int seatCount, int batteryCapacity) {
        super(model, year, seatCount);
        this.batteryCapacity = batteryCapacity;
    }

    @Override
    public void start() {
        System.out.println("Powering up battery (" + batteryCapacity + " kWh)...");
        super.start();
    }
}
