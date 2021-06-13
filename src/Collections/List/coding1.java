package Collections.List;

import java.util.LinkedList;

public class coding1 {
	public static void main(String[] args) {

		LinkedList<Integer> l = new LinkedList<>();
		for (int i = 1; i <= 10; i++) {
			l.add(i);
		}
		System.out.println(l);

		int b = (int) Math.floor(l.size() / 2);
		System.out.println(b);

		System.out.println(l.get(b));

	int findMiddleElement(ListNode<Integer> l) {
		
	}
		/*
		 * int findMiddleElement(ListNode<Integer> l) {
		 * 
		 * int b = (int) Math.floor(l.size() / 2); return (l.get(b)); }
		 * 
		 */
	}
}
