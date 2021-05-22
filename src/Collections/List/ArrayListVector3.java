package Collections.List;

import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
/*
LIST
a. we will see the implementation of list 
-  ArrayList, vector

b. when to use ArrayList & vector?	

Synchronization
ArrayList is non-synchronized, Vector is.

Size
ArrayList increments 50% of its current size if element added exceeds its capacity.
Vector increments 100% 

Legacy
ArrayList is not legacy, Vector is.

Speed
ArrayList is faster being non-syncronized.
Vector is slower being syncronized.

Iteration
ArrayList uses iterator interface to traverse through elements.
Vector can use both iterator or enumerator interface to traverse through elements.

example: we create vecotr and ArrayList and see:
- generate random number n add 
- the size inc capacity whe nit exceeds
- the time taken
*/
import java.util.Vector;

public class ArrayListVector3 {

  public static void main(String[] args) throws IOException {

    // create
    Vector<String> vec = new Vector<String>();
    LinkedList<String> linked = new LinkedList<String>();

    // 1st check
    System.out.println("vec size: " + vec.size() + ", capacity: " + vec.capacity() + " <- default capacity");
    System.out.println("linked size: " + linked.size() + ", capacity: no capacity");

    // add
    for (int i = 0; i < 500; i++) {
      vec.add(createRandomWord(200));
      linked.add(createRandomWord(200));
    }

    // 2nd check
    System.out.println("vec size: " + vec.size() + ", capacity: " + vec.capacity());
    System.out.println("linked size: " + linked.size() + ", capacity: no capacity");

    // access time for vector
    long time1 = System.nanoTime();
    vec.forEach(i -> System.out.println());
    long vecTime = System.nanoTime() - time1;

    // access time for linked
    long time3 = System.nanoTime();
    linked.forEach(i -> System.out.println());
    long linkedTime = System.nanoTime() - time3;

    // time taken results
    System.out.println(vecTime + " <-- vector ");
    System.out.println(linkedTime + " <-- linked list ");

  }

  public static String createRandomWord(int len) {
    String name = "";
    for (int i = 0; i < len; i++) {
      int v = 1 + (int) (Math.random() * 26);
      char c = (char) (v + (i == 0 ? 'A' : 'a') - 1);
      name += c;
    }
    return name;
  }
}
