package Collections.ArrayLists;
/*
 Array:
1) Fixed in Nature.
2) Wrt memory, Array is not recommended.
3) Wrt performance, Array is recommended to use.
4) Arrays can hold homogenous datatype elements.
5) Arrays can hold both primitives and objects.

Collections:
1) Growable in nature.
2) Wrt to memory, it is recommended to use.
3) Wrt performance, it is not recommended.
4) It can hold heterogeneous datatype elements.
5) Collection can hold only Objects but not primitives.

this demo is to show arraylist of type Student. shows how to 
1. create, 
2. adds objects, 
3. print it. 
4. sort the marks from the highest using custom comparator (lambda) 
*/

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class intro1 {

	public static void main(String[] args) {

		List<student> stud = new ArrayList<student>();
		stud.add(new student(1, 55));
		stud.add(new student(2, 45));
		stud.add(new student(3, 63));
		stud.add(new student(4, 92));
		stud.add(new student(5, 21));

    //this method is using lambda and the line below uses ternary operator
		Collections.sort(stud, (s1, s2) -> { 
      // algorithm for sorting marks from high to low
			return s1.marks > s2.marks ? -1 : s1.marks < s2.marks ? 1 : 0; 
		});
		for (student j : stud)
			System.out.println(j);
	}
}

class student {
	int rollno;
	int marks;

	public student(int rollno, int marks) {
		this.rollno = rollno;
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "student [rollno=" + rollno + ", marks=" + marks + "]";
	}
}