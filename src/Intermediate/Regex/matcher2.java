package Intermediate.Regex;
/*
//this function checks if two strings are same
*/
import java.util.regex.Pattern;

public class matcher2 {
	public static void main(String[] args) {

		String a="test";
		String b="test";
		
		boolean isMatched = Pattern.matches(a, b);	
		System.out.println(isMatched);
		
	}
}

