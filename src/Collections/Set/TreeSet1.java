package Collections.Set;

import java.util.Set;
import java.util.TreeSet;

/*
we will look at some methods of treeset
*/
public class TreeSet1 {

  public static void main(String[] args) {

    TreeSet<Integer> t = new TreeSet<>(Set.of(84, 94, 3, 65, 4684, 64, 4, 8, 1, 77));

    // sort by default, no duplicate
    System.out.println(t);

    // returns element less than or equal to the given element
    System.out.println(t.floor(65));
    // returns element LESS THAN the given element
    System.out.println(t.lower(65));

    // sasme as above, but for higher number
    System.out.println(t.ceiling(65));
    System.out.println(t.higher(65));

    // get range of values in between - including start value
    System.out.println(t.subSet(4, 64));
    // get range of values in between - including start & end value
    System.out.println(t.subSet(4, true, 64, true));
    // get range of values in between ONLY
    System.out.println(t.subSet(4, false, 64, false));
  }
}
