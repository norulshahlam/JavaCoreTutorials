package Intermediate.Regex;
/*
//this function checks if two strings are same
*/
import java.util.regex.Pattern;

public class matcher2 {
	public static void main(String[] args) {

		String a="test";
		String b="test";
		String c = new String("test1");
		String d = new String("test1");
		String e = new String("test");
		
		boolean isMatched = Pattern.matches(a, b);	
		System.out.println(isMatched);
		boolean isMatched2 = Pattern.matches(c,d);	
		System.out.println(isMatched2);
		
		boolean isMatched3 = Pattern.matches(a,e);	
		System.out.println(isMatched3);
		
	}
}

