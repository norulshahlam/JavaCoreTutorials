package Beginner.Methods;

/*
another example of method with inpur but using scanner. we can input our own during run time n use a method (void) to print our input
*/
import java.util.Scanner;

// this method takes in parameters and process it accordingly
class orange {
  public void printSomething(String name) {
    System.out.println("Hello " + name);
  }
}

public class intro3 {

  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    // initialize scanner
    orange orange1 = new orange();

    System.out.println("Enter your name: ");
    // user input
    String name = input.nextLine();

    /*
     * this takes 1 parameter and pass it to the method printSomething() in class
     * orange
     */
    orange1.printSomething(name);
  }
}
