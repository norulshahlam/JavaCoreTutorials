package Collections.StackVsQueue;

import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

/*
queue maintains insertion order. but we can use comparator to sort to our preference
*/
public class Queue2 {

  public static void main(String[] args) {

    Queue<String> q = new PriorityQueue<String>(new SortByLength());

    q.addAll(List.of("Cempedak", "Cherimoya", "Cherry", "Chico fruit", "Cloudberry", "Coco De Mer", "Coconut",
        "Crab apple", "Cranberry", "Currant", "Damson", "Date", "Dragonfruit", "Durian", "Grewia asiatica", "Guava",
        "Hala Fruit", "Honeyberry"));

    System.out.println(q);
  }
}

class SortByLength implements Comparator<String> {

  @Override
  public int compare(String o1, String o2) {
    return Integer.compare(o1.length(), o2.length());
  }

}