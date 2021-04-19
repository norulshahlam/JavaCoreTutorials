package Beginner.Print;


//The printf() method of Java PrintStream class is a convenience method to write a String which is formatted to this output Stream. It uses the specified format string and arguments.

import java.util.Calendar;

public class PrintF {

	public static void main(String[] args) {
		
		int i=1;
		int j=2;
		int k=i+j;
		
		System.out.println("the addition of "+i+" and " +j+ " is " +k);
		
		System.out.printf("the addition of %d and %d is %d\n\n",i,j,k);
		System.out.println("other format.....:");
		
		long n = 461012;
	      System.out.format("%d%n", n);      //  -->  "461012"
	      System.out.format("%08d%n", n);    //  -->  "00461012"
	      System.out.format("%+8d%n", n);    //  -->  " +461012"
	      System.out.format("%,8d%n", n);    // -->  " 461,012"
	      System.out.format("%+,8d%n%n", n); //  -->  "+461,012"
	      
	      double pi = Math.PI;

	      System.out.format("%f%n", pi);       // -->  "3.141593"
	      System.out.format("%.3f%n", pi);     // -->  "3.142"
	      System.out.format("%10.3f%n", pi);   // -->  "     3.142"
	      System.out.format("%-10.3f%n", pi);  // -->  "3.142"
	     
	      Calendar c = Calendar.getInstance();
	      System.out.format("%tB %te, %tY%n", c, c, c); // -->  "May 29, 2006"

	      System.out.format("%tl:%tM %tp%n", c, c, c);  // -->  "2:34 am"

	      System.out.format("%tD%n", c);    // -->  "05/29/06"

	}

}
