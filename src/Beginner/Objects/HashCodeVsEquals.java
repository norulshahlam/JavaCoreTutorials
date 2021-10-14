package Beginner.Objects;

/*

hashCode() vs .equals()

A hash code is an integer that is derived from an object. Hash codes should be scrambled—if x and y are two distinct objects, there should be a high probability that 
x.hashCode() and y.hashCode() are different

Importance of equals() and hashCode() method

The implementation of equals() and hashCode() should follow these rules.

If o1.equals(o2), then o1.hashCode() == o2.hashCode() should always be true.
If o1.hashCode() == o2.hashCode is true, it doesn’t mean that o1.equals(o2) will be true.
*/

class Employee {
	private String name;
	private int age;

	public Employee(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "[" + age + ", " + name + "]";
	}

}

public class HashCodeVsEquals {
	public static void main(String[] args) {

		Employee e1 = new Employee("cindy", 55); // both has same value but obj reference is diff
		Employee e2 = new Employee("cindy", 55); // both has same value but obj reference is diff
		Employee e3 = e1; // point to same obj

		System.out.println("e1 : " + e1 + ", e2 : " + e2 + ", e3 : " + e3);
		System.out.println("is e3=e1?: " + e3.equals(e1) + ", is e1=e2?: " + e1.equals(e2));

		e3.setName("cindy");
		e3.setAge(55);
		// since e3 refers to e1, any change to either 1 will change the other. but
		// still, it returns true
		System.out.println("e1 : " + e1 + ", e2 : " + e2 + ", e3 : " + e3);
		System.out.println("is e3=e1?: " + e3.equals(e1) + ", is e1=e2?: " + e1.equals(e2));

		/*
		 * e1 & e2 gives diff hashcode as it is created as diff obj, although the values
		 * are the same. e3 & e1 is the same as e3 points to e1
		 */
		System.out.println("e1 is: " + e1.hashCode() + ", e2 : " + e2.hashCode() + ", e3 : " + e3.hashCode());


	}
}
