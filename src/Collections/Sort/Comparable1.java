package Collections.Sort;

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
 
 demo how to use comparable (not comparator) comparing only 1 element	sort from highest age to lowest	
 a) your Student class must implement comparable
 b) override compareTo() to define your sorting logic ie by rollno / age
 c) use this overridden method by calling sort() 
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Comparable1 {
	public static void main(String[] args) {

		List<Student> stud = new ArrayList<Student>();
		stud.add(new Student(101, "Vijay", 23));
		stud.add(new Student(106, "Ajay", 27));
		stud.add(new Student(109, "ashish", 18));
		stud.add(new Student(105, "Jai", 21));
		for (Student t : stud) {
			System.out.println("rollno:" + t.rollno + " age:" + t.age);
		}
		// c) NOTE: class will be modified!
		Collections.sort(stud);
		for (Student t : stud) {
			System.out.println("After sort - rollno:" + t.rollno + " age:" + t.age);
		}

	}
}

// a)
class Student implements Comparable<Student> {
	int rollno;
	String name;
	int age;

	public Student(int rollno, String name, int age) {
		super();

		this.rollno = rollno;
		this.name = name;
		this.age = age;

	}

	@Override
	public String toString() {
		return "student [rollno=" + rollno + ", age=" + age + "]";
	}

	@Override // b)
	public int compareTo(Student s) {

		// a. ternary operator.
		// b. return this.age > s.age ? -1 : this.age < s.age ? 1 : 0;

		return Integer.compare(this.age, s.age);
	}
}
/*
 * a. how it works for: return this.age > s.age ? -1 : this.age < s.age ? 1 : 0;
 * 
 * Compares this object with the specified object for order. Returns a negative
 * integer, zero, or a positive integer if this object is less than, equal to,
 * or greater than the specified object.
 * 
 * b. or u can use Integer.compare(). Based on the current order and variable,
 * we are sorting by age, in inc order. for dec order, juat reverse the order of
 * the arg. to sorrt by rollno, use rollno instead of age
 * 
 */