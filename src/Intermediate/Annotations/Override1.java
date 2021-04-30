package Intermediate.Annotations;
/* 
Introduced in java 1.5
@Override annotation assures that the subclass method is overriding the parent class method. If it is not so, compile time error occurs. Sometimes, we does the silly mistake such as spelling mistakes etc. 
So, it is better to mark @Override annotation that provides assurity that method is overridden.
 */

class animal {
	void checkClass() {
		System.out.println("from animal");
	}	
}

class dog extends animal {

	/*	
  we intend to override parent method but bcos of typo, (CheckClass, not checkClass) this has become a new method. By @override, compiler will show that this method is not found in parent class	
  */

	void CheckClass() { 		
		System.out.println("from dog");
	}
}

public class Override1 {

	public static void main(String[] args) {

		dog d = new dog();
    //this method is supposed to print from child class, not parent.
		d.checkClass(); 
	}

}
