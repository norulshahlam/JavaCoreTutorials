package Collections.Map;

import java.util.HashMap;
/*
firstly know that hashmap doesnt allow duplicate key. so we cant have 2 keys having the same values. what about object as keys?
Now if key object has same values, HashMap will also replace it because it uses .equals() method to check for equality. to avoid this, we can use IdentityHashMap. it uses '==' which checks for addresss memory, not value. this satisfy our use-case
*/
import java.util.IdentityHashMap;
import java.util.Map;

public class IdentityHashMap1 {

  public static void main(String[] args) {

    // this is considered duplicate key
    Map<Integer, String> map1 = new HashMap<>();
    map1.put(new Integer(2), "shah");
    map1.put(new Integer(1), "rabika");
    map1.put(new Integer(1), "cindi");
    map1.put(new Integer(1), "yayas");
    System.out.println(map1);

    // this is NOT considered duplicate key
    Map<Integer, String> map2 = new IdentityHashMap<>();
    map2.put(new Integer(2), "shah");
    map2.put(new Integer(1), "rabika");
    map2.put(new Integer(1), "cindi");
    map2.put(new Integer(1), "yayas");
    System.out.println(map2);
  }
}
