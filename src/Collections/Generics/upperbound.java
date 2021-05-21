package Collections.Generics;

import java.util.List;

/*
Upper Bounded Wildcards

You can use an upper bounded wildcard to relax the restrictions on a variable. For example, say you want to write a method that works on List<Integer>, List<Double>, and List<Float>; you can achieve this by using an upper bounded wildcard.

https://docs.oracle.com/javase/tutorial/java/generics/upperBounded.html

*/
public class upperbound {
  public static void main(String[] args) {
    total(List.of(1, 2, 3, 4, 5));
    total(List.of(1.5, 2.6, 3.1, 4.9, 5.2));
    total(List.of(14654l, 46842l, 49893l, 79844l, 46455l));

    // b. enter into the datatype and u will c it all extends Numbers
    Integer a = 0;
    Float b = 0.0f;
    Long c = 35456445l;
  }

  // a. here, anything that can extend Numbers can be used eg int,float,long
  static void total(List<? extends Number> n) {

    double sum = 0.00;

    for (Number nn : n) {
      sum += nn.doubleValue();
    }
    System.out.println(sum);

  }
}