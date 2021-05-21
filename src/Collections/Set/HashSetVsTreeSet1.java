package Collections.Set;

/*
demonstrates the use of HashSet & TreeSet & LinkedHashSet on its sorting & null values
 */
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class HashSetVsTreeSet1 {

	public static void main(String[] args) {

		Set<Integer> ts = new TreeSet<Integer>();
		ts.add(11); // auto sort by asc
		ts.add(4);
		ts.add(2);
		ts.add(9);
		ts.add(5);
		ts.add(2); // error - no duplicate
		// ts.add(null); error - no null

		Set<Integer> hs = new HashSet<Integer>();
		hs.add(11); // auto sort by asc
		hs.add(4);
		hs.add(2);
		hs.add(9);
		hs.add(5);
		hs.add(null);
		hs.add(null); // allow one null
		hs.add(2); // no duplicate

		Set<Integer> lhs = new LinkedHashSet<Integer>();
		lhs.add(11); // maintain insertion order
		lhs.add(4);
		lhs.add(2);
		lhs.add(2);
		lhs.add(9);
		lhs.add(5);
		lhs.add(null);
		lhs.add(null); // allow one null
		lhs.add(2); // no duplicate

		ts.forEach(i -> System.out.println("TreeSet:  " + i));
		hs.forEach(i -> System.out.println("HashSet:  " + i));
		lhs.forEach(i -> System.out.println("LinkedHashSet:  " + i));
	}

}
