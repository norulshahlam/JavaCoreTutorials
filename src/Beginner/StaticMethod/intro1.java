package Beginner.StaticMethod;
/*
When a member is declared static, it can be accessed before any objects of its class are created, and without reference to any object. For example, in below java program, we are accessing static method printAdd() without creating any object of Calculator class.
*/
public class intro1 {
  public static void main(String args[]) {

    // static method - call this way if within the main class
    printHello();

    // static method - call this way if outside the main class
    Calculator.printAdd(2, 3);

    // instance method - ,ust create obj then call its method
    Calculator c = new Calculator();
    c.printMinus(2, 1);

  }
  //static method
  public static void printHello() {
    System.out.println("Hello World");
  }
}

class Calculator {
  // static method
  public static void printAdd(int a, int b) {
    System.out.println("Sum = " + (a + b));
  }

  // this is not static methos - must create instance first
  public void printMinus(int a, int b) {
    System.out.println("Subtraction = " + (a - b));
  }
}
