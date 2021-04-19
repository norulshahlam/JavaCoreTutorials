/*
Wrapper classes provide a way to use primitive data types (int, boolean, etc..) as objects.
Java uses the concept of Wrapper class for all 8 primitive types - in the case of an int, we can use Integer - and by
 doing that it gives us ways to perform operations on an int
*/

package Beginner.WrapperClass;

public class WrapperClass {
  public static void main(String[] args) {
    int maxVal = Integer.MAX_VALUE;
    int minVal = Integer.MIN_VALUE;

    System.out.println("Max value is " + maxVal + ", min val is " + minVal);
  }
}
