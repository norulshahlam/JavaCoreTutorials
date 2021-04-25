package Intermediate.AccessModifier;

public class intro1 {

	public static void main(String[] args) {
		
		protected1 new1 = new protected1();

		System.out.println(new1.y);	// (1)
		System.out.println(new1.z);

		System.out.println("");

		private1 new2 = new private1();
		System.out.println(new2.y);

		// below code shows error cos var a is private
		// System.out.println(new2.a);
		System.out.println(new2.y);

		System.out.println("");

		public1 new3 = new public1();
		// below code gives error because variable a is private
		// System.out.println(new3.a);
		System.out.println(new3.z);

	}
}
class protected1 {

	protected int y = 5;
	int z = 6;
}
@SuppressWarnings("unused")
class private1 extends protected1 {

	private int a = 1;
	int b = 2;
}
class public1 extends private1 {

	int c = 4;
}
