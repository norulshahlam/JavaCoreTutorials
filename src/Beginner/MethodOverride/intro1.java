package Beginner.MethodOverride;

/*
The word polymorphism means having many forms. In simple words, we can define polymorphism as the ability of a message to be displayed in more than one form.
we show here that method Overloading allows different methods to have the same name, but different 
signatures where the signature can differ by the number of input parameters or 
type of input parameters or both. Overloading is related to compile-time (or static) polymorphism. 
 POLYMORPHISM - same method name diff behaviour  
overloading - compiletime polymorphism - same method name, diff behaviour, same class
overriding - runtime polymorphism - same method name, same behaviour, diff class


  method overriding happens when there is same method name from child and parent class so compiler will override parent's method in favour of child method. 
*/
class chair {
  public void sit() {
    System.out.println("sit on chair");
  }
}

class sofa extends chair {

  public void sit() {
    System.out.println("sit on sofa");
  }
}

public class intro1 {
  public static void main(String[] args) {

    sofa s = new sofa();
    s.sit();
  }
}
