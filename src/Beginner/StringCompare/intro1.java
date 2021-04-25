package Beginner.StringCompare;

/*
 In general both .equals() and “==” operator in Java are used to compare objects to check equality but here are some of the differences between the two:

1. Main difference between .equals() method and == operator is that one is method and other is operator.

2. We can use == operators for reference comparison (address comparison) and .equals() method for content comparison. 
In simple words, "==" checks if both objects point to the same memory location 
whereas .equals() evaluates to the comparison of values in the objects.

always use this .equals() when comparing strings nvr use '==' method. that is only for integer

3. If a class does not override the equals method, then by default it uses equals(Object o)  method of the closest parent class that has overridden this method.
 */

public class intro1 {
	public static void main(String[] args) {
		String a = "apple";
		String b = "apple";
		String c = "APPLE";
		String d = new String("apple");
		String e = new String("apple");

		System.out.println(a==b); //true
		System.out.println(b==c); //false bcos it is case sensitive
		System.out.println(a==d); //false - diff obj
		System.out.println(a.equals(d)); //true - same val
		System.out.println(d==e); //false - diff obj
		System.out.println(d.equals(e)); //true - same value
	}
}
