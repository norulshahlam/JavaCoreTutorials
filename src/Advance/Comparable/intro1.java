package Advance.Comparable;

/* Java provides two interfaces to sort objects using data members of the class:
 Comparable & Comparator
 
 Comparable 

 1) provides a single sorting sequence. ie, we can sort the collection on the basis of a single element such as id or name or price. 
 2) affects the original class, i.e., the actual class is modified. 
 3) provides compareTo() method to sort elements. 
 4) in java.lang package. 
 5) can sort the list elements of Comparable type by Collections.sort(List) method.
 
 Comparator 

 1) provides multiple sorting sequences. ie, can sort the collection on the basis of multiple elements such as id, name, and price etc. 
 2) doesn't affect the original class, i.e the actual class is not modified. 
 3) provides compare() method to sort elements.
 4) in java.util package. 
 5) can sort the list elements of Comparator type by Collections.sort(List, Comparator) method.
 
 When to use Comparator /Comparable?
 If you are using custom class, use Comparable
 If a class cannot be changed, use Comparator
 if sorting of objects needs to be based on natural order then use Comparable 
 if sorting needs to be done on attributes of different objects, then use Comparator in Java.
 For Comparable, don’t need to make any code changes at client side for using Arrays.sort() or Collection.sort() methods automatically uses the compareTo() method of the class. 
 For Comparator, client needs to provide the Comparator class to use in compare() method.
 
 demo how to use comparable (not comparator) comparing only 1 element	sort from highest marks to lowest	
 a) your Student class must implement comparable
 b) override compareTo() to define your sorting logic ie by rollno / marks
 c) use this overridden method by calling sort() 
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class intro1 {
		public static void main(String[] args) {

		List<Student> stud = new ArrayList<Student>();
		stud.add(new Student(1, 55));
		stud.add(new Student(2, 45));
		stud.add(new Student(3, 63));
		stud.add(new Student(4, 92));
		stud.add(new Student(5, 21));
		for(Student t : stud){
			System.out.println("rollno:"+t.rollno+" marks:"+t.marks);
		}
    // c) NOTE: class will be modified!
		Collections.sort(stud); 
		for(Student t : stud){
			System.out.println("After sort - rollno:"+t.rollno+" marks:"+t.marks);
		}
		
	}
}
// a)
class Student implements Comparable<Student> {
	int rollno;
	int marks;

	public Student(int rollno, int marks) {
		super();
		this.rollno = rollno;
		this.marks = marks; 
	}

	@Override
	public String toString() {
		return "student [rollno=" + rollno + ", marks=" + marks + "]";
	}

	@Override   //b)
	public int compareTo(Student s) {
System.out.println("this.marks: "+this.marks+" , marks: "+s.marks);
		// ternary operator.
		return this.marks > s.marks ? -1 : this.marks < s.marks ? 1 : 0;
	}
} 
/*
 * how it works for: return this.marks > s.marks ? -1 : this.marks < s.marks ? 1 : 0;
 * 
 * Compares this object with the specified object for order. 
 * Returns a negative integer, zero, or a positive integer if
 * this object is less than, equal to, or greater than the specified object.
 */


