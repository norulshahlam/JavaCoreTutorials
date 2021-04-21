package Beginner.Constructors;
/*
alternative way to assign values in default constructor if you dont  value in the global variable.
*/
class Test {
  int a;  // 2. u dont assign any value here so,
  int b;

  // Default constructor
  Test() {
    this(10, 20); // 3. this is how u assign. note: it will also call constr with 2 params
    System.out.println("Inside default constructor"+a+b+" \n");
  }

  Test(int a) {
    this.a = a;
    System.out.println("Inside 1 parameterized constructor"+a+b);
  }

  Test(int a, int b) {
    this.a = a;
    this.b = b;
    System.out.println("Inside 2 parameterized constructor"+a+b);
  }

  @Override
  public String toString() {
    return "Test [a=" + a + ", b=" + b + "]";
  }
}

public class intro3 {
  public static void main(String[] args) {

    // 1.using default constructor
    Test object = new Test();
    System.out.println(object);
  }
}
