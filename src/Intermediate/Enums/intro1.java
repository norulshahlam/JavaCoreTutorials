package Intermediate.Enums;
/*
A Java Enum is a special Java type used to define collections of constants. 
Sometimes, a variable should only hold a restricted set of values. 
For example, you may sell clothes or pizza in four sizes: small, medium, large, and extra large.
*/
enum clothesSizes{
	SMALL, MEDIUM, LARGE;
}

public class intro1 {
	
	public static void main(String[] args) {
	
		System.out.println(clothesSizes.LARGE);
	}

}