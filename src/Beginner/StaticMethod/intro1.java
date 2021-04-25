package Beginner.StaticMethod;
/*
When a member is declared static, it can be accessed before any objects of its class are created, and without reference to any object. For example, in below java program, we are accessing 

1. static method printAdd() & printHello() without creating any object of Calculator class but
2. have to create obj first of Calculator to use printMinus()
*/
public class intro1 {
  public static void main(String args[]) {

    // 1. static method - call this way if within the main class
    printHello();

    // 1. static method - call this way if outside the main class
    Calculator.printAdd(2, 3);

    // 2. instance method - create obj then call its method
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
