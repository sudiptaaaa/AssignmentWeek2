package Interface;
import java.util.Scanner;

public class TesterCalculator {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n(upto 1000): ");
        int n = sc.nextInt();
        if(n>1000){
            System.out.println("Value of n must be less than 1000: ");
            n = sc.nextInt();
        }
        MyCalculator c = new MyCalculator();
		System.out.println("Sum of all its divisors is: " +c.divisor_sum(n));
    }
}

/*
 * Output:
 * Enter n(upto 1000): 6
 * Sum of all its divisors is: 12
 */