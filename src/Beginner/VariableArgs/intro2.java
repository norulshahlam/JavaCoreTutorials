package Beginner.VariableArgs;

/* 
Variable length argument is a feature that allows a function 
o receive any (variable) number of arguments. There are situations where we want a function to handle variable number of arguments according to requirement. */

class calculate {
	void addition(int... j) {
		int sum = 0;
		for (int i : j) {
			sum = sum + i;
		}
		System.out.println(sum);
	}
}

public class intro2 {

	public static void main(String[] args) {

		calculate obj = new calculate();
		obj.addition(4,5);
	
	}
}
 