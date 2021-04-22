package Collections.Iterator;

import java.util.ArrayList;
import java.util.Iterator;

/*
An Iterator is an object that can be used to loop through collections, like ArrayList and HashSet. It is called an "iterator" because "iterating" is the technical term for looping. It  is an interface which belongs to collection framework. 

The iterator() method can be used to get an Iterator for any collection:

To loop through a collection, use the hasNext() and next() methods of the Iterator

hasNext() - returns true if current iteration has element
next() - contains the elements
*/
public class intro1 {
  public static void main(String[] args) {
    ArrayList<Integer> numbers = new ArrayList<Integer>();
    numbers.add(12);
    numbers.add(8);
    numbers.add(2);
    numbers.add(23);

    Iterator<Integer> it = numbers.iterator();
    while (it.hasNext()) {
      System.out.println(it.next());
    }
  }
}
