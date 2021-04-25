package Collections.LoopingCollections;

/*
3 ways to loop thru a collections:

1. for loop
2. iterator, 
3. enhanced forloop
4. Stream API
5. forEach


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

    System.out.println("\n1... ");
    for(int i=0; i<values.size(); i++){
      System.out.println(values.get(i));
    }

    System.out.println("\n2... ");
    Iterator<Integer> i = values.iterator();
    while (i.hasNext())
      System.out.println(i.next());

    System.out.println("\n3... ");
    for (Object j : values)
      System.out.println(j);
   
    System.out.println("\n4... ");
    values.forEach(System.out::println);

    System.out.println("\n5... ");
    values.forEach(k->System.out.println(k));
  }
}
