package Intermediate.ReferenceVariable;

public class intro2 {

 	// Here i is an Instance variable.		 
	int i;
	
	public static void main(String[] args) {
		// Here i is an Instance variable.		 
		test t1 = new test();
		System.out.println("Value before calling method1: " + t1.i);

	}
	@SuppressWarnings("unused")
	  //  Here j is a method parameter. And k is a local variable.
		void method1(int j) {
		int k;
		i = j;
		/* Local Variable(k)'s life ends once execution for this method
		 * completes. As k is local is variable it needs to be initialized 
		 * before we can use it. But as it is not getting used here, it can   stay here without initializing		 */
	}
}
class test {
	//below variable is static variable means it is class level variable
	static int i;

	public static void main(String[] args) {
		// As i is an static variable it can be accessed directly without using any object
		System.out.println("Value before calling method1: " + i);
		test t1 = new test();
		t1.method1();
		System.out.println("Value after calling method1: " + i);
		t1.method2();
		System.out.println("Value after calling method2: " + i);
	}

	void method1() {
		i++;
	}

	void method2() {
		i++;
	}
}