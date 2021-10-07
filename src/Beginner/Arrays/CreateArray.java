package Beginner.Arrays;

/*	
Arrays are used to store multiple values in a single variable, instead of declaring separate variables for each value. We can store only the fixed size of elements in the array. It doesn't grow its size at runtime. 
*/
public class CreateArray {
  @SuppressWarnings("unused")
	public static void main(String[] args) {

		int add = 0;
		
		// method #1 - array size is defined but its elements are not added yet
		int array1[] = new int[10]; 

		// method #2 - elements are added upon creation of arrays
		int array2[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 }; 
		System.out.println("aaa"+array2[3]);

    // adding elements by using for loop
		for (int a = 0; a < array1.length; a++) { 
      // very tricky. element is 0-9
			array1[a] = add + 1;
			add++;
			System.out.println("array2 at index " + a + " is " + array1[a]);
		}
		System.out.println("end");

    //prin out the array
    for(int a : array1){
      System.out.println("array2: "+a);
    }

	}
}
