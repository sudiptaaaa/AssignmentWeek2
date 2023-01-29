package Overloading;

public class TesterCalculator {
    public static void main(String[] args){
        Calculator c = new Calculator();
        c.findAverage(10, 25, 15);
        c.findAverage(10, 25, 15, 12);
        c.findAverage(10,10,10,10,10);
        
    }
}

/*
 * Output:
 * Average of 3 numbers: 16.67
 * Average of 4 numbers: 15.5
 * Average of 5 numbers: 10.0
 */