package Beginner.Objects;

/*	object : copy of a class
 * 	class : template/blueprint for an object. contains data and method
 * 	for this example, we use Employee class. alex, john,peter is an object
 */
public class intro1 {
	@SuppressWarnings("unused")
	public static void main(String[] args) {

		Employee alex = new Employee();
		Employee john = new Employee();
		Employee peter = new Employee();

		alex.salary = 30000;
		alex.bonus = 20000;
		alex.CalTotalPay();
	}
}

class Employee {
	double salary, bonus;

	void CalTotalPay() {
		double TotalPay = salary + bonus;
		System.out.println("Total pay for alex is: " + TotalPay);
	}
}