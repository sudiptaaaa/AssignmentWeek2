package Inheritance;

public abstract class Vehicle {
    private String color;
    private int noOfWheels;
    private String model;


    public Vehicle(String color, int noOfWheels, String model) {
        this.color = color;
        this.noOfWheels = noOfWheels;
        this.model = model;
        this.honks();
        this.amountOfSpace();
    }


    public void honks(){
        System.out.println(this.getClass().getSimpleName() + " honks");
    }

    abstract void amountOfSpace() ;

    @Override
    public String toString() {
        return "color='" + color + '\'' +
                ", noOfWheels=" + noOfWheels +
                ", model='" + model + '\'';

    }
}
