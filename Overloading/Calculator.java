package Overloading;

public class Calculator{

    public void findAverage(int num1, int num2, int num3) {
        double avg = (double)(num1+ num2 + num3)/3;
        System.out.println("Average of 3 numbers: " + Math.round(avg * 100.0) / 100.0);      
    }

    public void findAverage(int num1, int num2, int num3, int num4) {
        double avg = (double)(num1+ num2 + num3 + num4)/4;
        System.out.println("Average of 4 numbers: " + Math.round(avg * 100.0) / 100.0);      
    }

    public void findAverage(int num1, int num2, int num3, int num4, int num5) {
        double avg = (double)(num1+ num2 + num3 + num4 + num5)/5;
        System.out.println("Average of 5 numbers: " + Math.round(avg * 100.0) / 100.0);      
    }
}