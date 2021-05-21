package Collections.Set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/*
we will look at the insertion order of the 3 diff implementation of set
*/
public class SetInterface1 {

  public static void main(String[] args) {

    List<Character> c = List.of('S', 'Q', 'Z', 'R', 'Y', 'P', 'A', 'D', 'U');

    // sort by default
    Set<Character> treeset = new TreeSet<Character>(c);
    System.out.println(treeset);

    // maintains insertion order
    Set<Character> linkedhashset = new LinkedHashSet<Character>(c);
    System.out.println(linkedhashset);

    // random insertion
    Set<Character> hashset = new HashSet<Character>(c);
    System.out.println(hashset);
  }
}
