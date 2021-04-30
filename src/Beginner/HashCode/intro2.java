package Beginner.HashCode;

/*

hashCode() vs .equals()

A hash code is an integer that is derived from an object. Hash codes should be scrambled—if x and y are two distinct objects, there should be a high probability that 
x.hashCode() and y.hashCode() are different
*/
class Hashing{
	private int i=0;
	private String j="default";
	
	public int getI() {
		return i;
	}

	public void setI(int i) {
		this.i = i;
	}

	public String getJ() {
		return j;
	}

	public void setJ(String j) {
		this.j = j;
	}

	public Hashing() {	//contructor with zero argument
		super();
	}

	public Hashing(String j) {
		super();
		this.j = j;
	}

	Hashing(int i, String j){ //constructor with 2 arguments
		this.i =i;
		this.j =j;
	}
	
	public void PrintMe() {
		System.out.println(i +" "+ j);
	}
}

public class intro2 {
	public static void main(String[] args) {
		Hashing x = new Hashing(2,"hi");	//both obj x y has same value but obj reference is diff
		Hashing y = new Hashing(2, "hi");
		
		Hashing z = x; //z x point to same obj
		
		System.out.print("val of x is: " ); x.PrintMe();
		System.out.print("val of y is: " ); y.PrintMe();
		System.out.print("val of z is: " ); z.PrintMe();
		
		z.setI(5);
		z.setJ("ddd");
		System.out.print("NEW val of z is: " ); z.PrintMe();
		
    //although val of z has change, hashcode remains same bcos they are same reference
		System.out.println("is z=y?: "+z.equals(x)); 
		
    //but gives diff hashcode as it is created as diff obj, although the values are the same
		System.out.println("\nx is: "+x.hashCode());	
		System.out.println("y is: "+y.hashCode());
    //here z is the same as x as it points to the same obj
		System.out.println("z is: "+z.hashCode()); 		
	}
}
