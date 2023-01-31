package Inheritance;

public class Car extends Vehicle{
    private boolean isImported;

    public Car(String color, int noOfWheels, String model, boolean isImported) {
        super(color, noOfWheels, model);
        this.isImported = isImported;
    }

    @Override
    void amountOfSpace() {
        System.out.println("Car has the least space");
    }

    @Override
    public String toString() {
        String det = super.toString();
        return "Car{" + '\'' +
                det +
                ", isImported=" + isImported +
                '}';
    }
}
