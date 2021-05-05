package Intermediate.ObjectCopy;

import java.util.Arrays;

/*
In object-oriented programming, object copying is creating a copy of an existing object, the resulting object is called an object copy or simply copy of the original object

https://www.geeksforgeeks.org/deep-shallow-lazy-copy-java-examples/#:~:text=In%20shallow%20copy%2C%20only%20fields,as%20well%20as%20objet%20references.

we deep copy using Copy Constructor
*/
public class DeepCopy2 {

  public static void main(String[] args) {
    Complex c1 = new Complex(10, 15);

    // Following involves a copy constructor call
    Complex c2 = new Complex(c1);

    // Note that following doesn't involve a copy constructor call as
    // non-primitive variables are just references.
    Complex c3 = c2;

    System.out.println(c2); // toString() of c2 is called here
  }
}

class Complex {

  private double re, im;

  // A normal parametrized constructor
  public Complex(double re, double im) {
    this.re = re;
    this.im = im;
  }

  // copy constructor
  Complex(Complex c) {
    System.out.println("Copy constructor called");
    re = c.re;
    im = c.im;
  }

  // Overriding the toString of Object class
  @Override
  public String toString() {
    return "(" + re + " + " + im + "i)";
  }
}
