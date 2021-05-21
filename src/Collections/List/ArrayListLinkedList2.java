package Collections.List;

import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
/*
LIST
a. we will see the implementation of list 
- arraylist, linkedlist, vector

b. when to use arraylist & linkedlist?

ArrayList	

1. ArrayList internally uses a dynamic array to store the elements hence, 
2. Accessing is fast and cheap cos we access by index, but adding / deleting is slow & costly cos it require all the memory bits to shift
3) An ArrayList class can act as a list only because it implements List only.	
4) ArrayList is better for storing and accessing data.	

LinkedList

1. LinkedList internally uses a doubly linked list to store the elements hence,
2. Accessing is slow and costly cos we need to start from beginning of index and count upwards. but adding / deleting is fast cos no bit shifting is required in memory - It uses a doubly linked list ie we just need to change the link .
3. LinkedList class can act as a list and queue both because it implements List and Deque interfaces.
4. LinkedList is better for manipulating data.
*/
import java.util.Vector;

public class ArrayListLinkedList2 {

  public static void main(String[] args) throws IOException {

    List<String> fruits = List.of("Abiu", "Açaí", "Acerola", "Ackee", "African cucumber", "Apple", "Apricot", "Avocado",
        "Banana", "Bilberry", "Blackberry", "Blackcurrant", "Black sapote", "Cherry", "Chico fruit", "Cloudberry",
        "Coco De Mer", "Coconut", "Crab apple", "Cranberry", "Currant", "Damson", "Date", "Dragonfruit (or Pitaya)",
        "Durian", "Egg Fruit", "Elderberry", "Feijoa", "Fig", "Goji berry", "Gooseberry", "Grape", "Raisin",
        "Grapefruit", "Grewia asiatica (phalsa or falsa)", "Eggplant", "Pumpkin", "Squash", "Tomato", "Zucchini");

    List<String> arrayList1 = new ArrayList<String>(fruits);
    List<String> linkedList1 = new LinkedList<String>(fruits);
    List<String> vector1 = new Vector<String>(fruits);

  }
}
