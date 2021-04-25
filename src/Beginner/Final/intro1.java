package Beginner.Final;
/*
this class demonstrates final var, method, class
in summary,
final var - cant make any changes
final method - cant overide parent method
final class - cant inherit class
*/
public class intro1 {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		B objB = new B();
		objB.show();
		
		final int i=5;
    //once var is final, no changes can be made. any changes made will give compile time error
	//i++;

	}
}

class A {
	final void show() {
		System.out.println("A show");
	}
}
//once class is declared final, it cannot be inherited. 
final class B extends A {
	
	//below gives error as the parent method disallow from being overridden. this is called final method
//	void show() {
//		System.out.println("A show");
//	}
}

//uncomment this to see class C cannot xtend class B as class B is declared final
//class C extends B {}


