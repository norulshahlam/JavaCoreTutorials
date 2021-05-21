package Collections.Map;

import java.util.HashMap;
import java.util.Map;

/*
Hashmap
- unsorted, unordered
- hashcode is used
- allow null val key

Hashtable
- thread safe version of hashmap
- unsorted, unordered
- hashcode is used
- not allow null val key

linkedhashmap
- maintain insertion order
- slow insert & del
- faster iteration

treemap
- maintain insertion order
- implements navigableMap

example - basic functions of Map

*/

public class map1 {

  public static void main(String[] args) {

    Map<String, Integer> m = Map.of("A", 3, "C", 1, "B", 9);

    // maintain insertion order (key)
    System.out.println(m);

    System.out.println(m.get("C"));
    System.out.println(m.size());
    System.out.println(m.isEmpty());
    System.out.println(m.containsKey("C"));
    System.out.println(m.containsValue(9));
    // all keys
    System.out.println(m.keySet());
    // all values
    System.out.println(m.values());

  }
}

class eeee {

}
