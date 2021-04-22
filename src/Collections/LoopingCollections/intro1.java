package Collections.LoopingCollections;

/*
3 ways to loop thru a collections:

1. iterator, 
2. enhanced forloop
3. Stream API


‘Iterator’ is an interface which belongs to collection framework. It allows us to traverse the collection, 
access the data element and remove the data elements of the collection 
 */

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class intro1 {

  public static void main(String[] args) {

    List<Integer> values = new ArrayList<Integer>();
    values.add(88);
    values.add(44);
    values.add(3);
    values.add(3254);

    System.out.println("1... ");
    Iterator<Integer> i = values.iterator();
    while (i.hasNext())
      System.out.println(i.next());

    System.out.println("2... ");
    for (Object j : values)
      System.out.println(j);

    System.out.println("3... ");
    values.forEach(System.out::println);
  }
}
