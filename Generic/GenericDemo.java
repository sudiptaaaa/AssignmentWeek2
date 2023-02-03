package Generic;

import java.util.Iterator;
import java.util.List;

public class GenericDemo<E>
{ 
	public void printArray(List<E> data) {
		
		Iterator itr = data.iterator();
		while(itr.hasNext())
			System.out.println(itr.next());
		System.out.println();
	}
} 