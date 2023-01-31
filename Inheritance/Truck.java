package Inheritance;

public class Truck extends Vehicle{
    private boolean isPublicTransport;

    private String shippingDetails;
    public Truck(String color, int noOfWheels, String model,String shippingDetails) {
        super(color, noOfWheels, model);
        this.shippingDetails = shippingDetails;
    }

    @Override
    void amountOfSpace() {
        System.out.println("Truck has medium amount of space");
    }

    @Override
    public String toString() {
        String det = super.toString();
        return "Truck{" +  '\'' +
                det +
                ", shippingDetails='" + shippingDetails + '\'' +
                '}';
    }
}
