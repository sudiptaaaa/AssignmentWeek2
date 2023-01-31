package Inheritance;

public class Bus extends Vehicle{
    private boolean isPublicTransport;

    public Bus(String color, int noOfWheels, String model, boolean isPublicTransport) {
        super(color, noOfWheels, model);
        this.isPublicTransport = isPublicTransport;
    }

    @Override
    void amountOfSpace() {
        System.out.println("Bus has the most space");
    }

    @Override
    public String toString() {
        String det = super.toString();
        return "Bus{" +  '\'' +
                det +
                ", isPublicTransport=" + isPublicTransport +
                '}';
    }
}
