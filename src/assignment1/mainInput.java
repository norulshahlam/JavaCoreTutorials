package assignment1;

import java.util.Scanner;

public class mainInput {
	
	public static void main(String args[]) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("eenter message to decode: ");
		String plainText = input.nextLine();
		String output = new offsetArray().encoder(plainText);
		
		System.out.println("encoded message is "+output);
	}
}
