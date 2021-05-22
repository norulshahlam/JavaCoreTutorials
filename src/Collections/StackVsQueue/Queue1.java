package Collections.StackVsQueue;

import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class Queue1 {

  public static void main(String[] args) {

    Queue<String> q = new PriorityQueue<String>();

    // return while removes the head of this queue, or returns null if this queue
    // is empty.
    System.out.println(q.poll());

    q.addAll(List.of("Cempedak", "Cherimoya (Custard Apple)", "Cherry", "Chico fruit", "Cloudberry", "Coco De Mer",
        "Coconut", "Crab apple", "Cranberry", "Currant", "Damson", "Date", "Dragonfruit (or Pitaya)", "Durian",
        "Grewia asiatica (phalsa or falsa)", "Guava", "Hala Fruit", "Honeyberry"));

    System.out.println(q);
    q.poll();
    System.out.println(q.poll());
    System.out.println(q);
    System.out.println(q.poll());
    System.out.println(q);
    System.out.println(q.poll());
    System.out.println(q);
  }
}
