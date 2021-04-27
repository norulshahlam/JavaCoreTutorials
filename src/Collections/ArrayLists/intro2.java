package Collections.ArrayLists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class intro2 {

	public static void main(String[] args) {
		//List allow element to be added by inserting into index specified by user. the concept of mentioning what type of data (ie integer, Float) in your collection is called GENERICS
		List<Integer> values = new ArrayList<Integer>(); 
		values.add(44);
		values.add(424);
		values.add(3);
		values.add(1,5); //add this element to the 2nd index
		
    System.out.println("Before sort");
		for(Object j : values)
			System.out.println(j);
	
		
      //List allow element to be sorted by natural order - increasing order
		Collections.sort(values); 
		System.out.println("\nafter sort");
		for(Object k : values)
			System.out.println(k);

	}

}
