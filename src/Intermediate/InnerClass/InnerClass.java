package Intermediate.InnerClass;
/*
An inner class is a class that is defined inside another class. Why would you want to do that? There are two reasons:
Inner classes can be hidden from other classes in the same package.
Inner class methods can access the data from the scope in which they are defined—including the data that would otherwise be private.
 */
class outer {
	void show(){
		System.out.println("outer");
	}
	
	 class inner{
		void show() {
			System.out.println("inner");
		}
	}
}

public class InnerClass {

	public static void main(String[] args) {
		
    //this is defining object from a class within the scope
		outer a = new outer(); 
		a.show();

    //use this if inner class is not static
		//outer.inner b = new outer.inner(); 
		outer.inner b = a.new inner();
		b.show();
	}
}
