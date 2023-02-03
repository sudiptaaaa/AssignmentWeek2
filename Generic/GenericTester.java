package Generic;

import java.util.ArrayList;
import java.util.List;

public class GenericTester {
	public static void main(String args[])
	{
		//integer list
		List<Integer> arr1 = new ArrayList();
		arr1.add(12);
		arr1.add(24);
		arr1.add(36);
		//float array
		List<Float> arr2 = new ArrayList();
		arr2.add(12.21f);
		arr2.add(24.42f);
		arr2.add(36.63f);
		//double array
		List<Double> arr3 = new ArrayList();
		arr3.add(12.34535);
		arr3.add(24.45455);
		arr3.add(36.57453);
		//character array
		List<Character> arr4 = new ArrayList();
		arr4.add('A');
		arr4.add('B');
		arr4.add('C');
		//create an object of class GenericDemo
		GenericDemo<Integer> obj = new GenericDemo<Integer>();
		System.out.println("Integer Values");
		obj.printArray(arr1);
		
		GenericDemo<Float> obj1 = new GenericDemo<Float>();
		System.out.println("Float Values");
		obj1.printArray(arr2);
		
		GenericDemo<Double> obj2 = new GenericDemo<Double>();
		System.out.println("Double Values");
		obj2.printArray(arr3);
		
		GenericDemo<Character> obj3 = new GenericDemo<Character>();
		System.out.println("Character Values");
		obj3.printArray(arr4);
	}
}

/*
Output:
Integer Values
12
24
36

Float Values
12.21
24.42
36.63

Double Values
12.34535
24.45455
36.57453

Character Values
A
B
C
 */