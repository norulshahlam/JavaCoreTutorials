package assignment1;
import java.util.Scanner;

class WhileLoop {
	public static void main(String[] args) {

		String[] refTable = { "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R",
				"S", "T", "U", "V", "W", "X", "Y", "Z", "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "(", ")", "*",
				"+", ",", "-", ".", "/" };

		String n = "";

		Scanner input = new Scanner(System.in);
		System.out.println("Input an integer");

		n = input.nextLine();
		
		for(int i=0; i<refTable.length; i++) {
			
		}
		while (!n.equals("a")) {
			System.out.println("You entered " + n);
			System.out.println("re Input an integer");
			n = input.nextLine();

		}

		System.out.println("Out of loop");
	}
}