package Collections.HashSetVsHashMap;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/*
HashSet	HashMap
HashSet does’t allow duplicate values.	
HashMap store key, value pairs and it does not allow duplicate keys. If key is duplicate then old key is replaced with new value.

HashSet implements Set interface.	 
HashMap implements Map interface

HashSet requires only one object add(Object o) .	
HashMap requires two objects put(K key, V Value) to add an element to HashMap object

HashSet internally uses HashMap to add elements. 
In HashSet, the argument passed in add(Object) method serves as key K. 

Java internally associates dummy value for each value passed in add(Object) method.	
HashMap no concept of dummy value,

HashSet internally uses HashMap object to store or add the objects.	HashMap internally uses hashing to store or add objects

HashSet slower
HashMap faster	

HashSet use add() method for add or storing data	 
HashMap use put() method for storing data, 
HashSet is a set, e.g. {1, 2, 3, 4, 5, 6, 7},	HashMap is a key -> value pair(key to value) map, e.g. {a -> 1, b -> 2, c -> 2, d -> 1}

*/
public class intro1 {
  public static void main(String[] args) {

    HashSet<String> hs = new HashSet<String>();
    hs.add("geeks");
    hs.add("practice");
    hs.add("contribute");
    hs.add("geeks"); // no duplicates
    hs.add(null); // allow 1 null values
    hs.add(null);
    hs.forEach(i -> System.out.println("HashSet:  " + i));

    HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
    hm.put(2, 33);
    hm.put(1, 33);
    hm.put(3, 33); // allow duplicate value
    hm.put(4, 33);
    hm.put(5, 33);
    hm.put(3, 34); // no duplicate key - replaces earlier value

    for (Map.Entry<Integer, Integer> data : hm.entrySet()) {
      System.out.println("HashMap:  " + data.getKey() + " : " + data.getValue());
    }

  }
}
