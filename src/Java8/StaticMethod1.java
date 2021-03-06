package Java8;

/* 
The static keyword is used to create methods that will exist independently of 
any instances created for the class. Static methods do not use any instance 
variables of any object of the class they are defined in.

this is to show that static method in interface can be called right away in
main method
 */
interface i {

  static void show() { // here is the static method, implemented.
    System.out.println("interface i");
  }
  static void show2() { // here is the static method, implemented.
    System.out.println("interface i");
  }
}

public class StaticMethod1 implements i {

  public static void main(String[] args) {

    // here u can straight away call a method in interface i if it is declared as
    // static.
    i.show();
  }
}
