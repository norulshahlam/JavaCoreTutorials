package Collections.StackVsQueue;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

/*
Key Differences Between Stack and Queue

Stack 
follows LIFO mechanism to add and remove elements.
same end is used to insert and delete the elements. 
have only one open end that is the reason for using only one pointer to refer to the top of the stack. 
performs two operations known as push and pop 
easier implementation
stack does not have variants.
 

Queue 
follows FIFO mechanism to add and remove elements.
two different ends are used to insert and delete the elements.
uses two pointers to refer front and the rear end of the queue.
enqueue and dequeue.
implementation is tricky.
has variants like circular queue, priority queue, doubly ended queue
 */
public class intro1 {
	public static void main(String[] args) {

		Stack<Integer> st = new Stack<Integer>();
		st.add(4);
		st.add(9);
		st.add(2);
		st.add(1);
    st.forEach(i->System.out.println("Stack:  "+i));

		Queue<Integer> q = new ArrayDeque<Integer>();
		q.add(4);
		q.add(9);
		q.add(2);
		q.add(1);
    q.forEach(i->System.out.println("ArrayDeque:  "+i));
	
	}
}