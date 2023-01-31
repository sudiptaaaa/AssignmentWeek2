package Inheritance;
public class Road {
    public static void main(String[] args) {
        Vehicle bus = new Bus("Blue",6,"Volvo");
        Vehicle car = new Car("Red",4,"Wagner");
        Vehicle truck = new Truck("Black",8,"Tata");
        System.out.println(truck);
        System.out.println(bus);
        System.out.println(car);
    }
}

/*
Output:
Bus honks
Bus has the most space
Car honks
Car is small
Truck honks 
Truck has varying capacity

Truck{'color='Black', noOfWheels=8, model='Tata'}
Bus{'color='Blue', noOfWheels=6, model='Volvo'}
Car{'color='Red', noOfWheels=4, model='Wagner'}
*/
