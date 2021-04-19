package Advance.Coupling;


/*
Loose coupling is a design goal that seeks to reduce the inter-dependencies between components of a system with the goal of reducing the risk that changes in one component will require changes in any other component. Loose coupling is much more generic concept intended to increase the flexibility of system, make it more maintainable and makes the entire framework more stable.
 */
public class LooseCoupling1 {
	public static void main(String[] args) {


    //u can inject either van or bike - loose coupling
		Vehicle v = new Van();
		v.travelBy();

	}
}

interface Vehicle {
	void travelBy();
}

class Van implements Vehicle {
	@Override
	public void travelBy() {
		System.out.println("Travel by Van");
	}
}

class Bike implements Vehicle {
	@Override
	public void travelBy() {
		System.out.println("Travel by Bike");
	}
}

/*
In the above example, Main and Van objects are loosely coupled. It means Vehicle is an interface and we can inject any of the implemented classes at run time and we can provide service to the end user.

The examples of Loose coupling are Interface, JMS, Spring IOC(Dependency Injection, it can reduce the tight coupling).
 */
