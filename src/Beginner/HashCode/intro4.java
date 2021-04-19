package Beginner.HashCode;

public class intro4 {

	public static void main(String[] args) {
	
		Object a = new Object();		
		Object b = a;		
		Object c = new Object();
		
		System.out.println(a.hashCode());
		System.out.println(b.hashCode()); // same as 'a'
		System.out.println(c.hashCode());
		
	}
}
