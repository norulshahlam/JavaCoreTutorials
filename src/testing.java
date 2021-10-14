import java.util.ArrayList;
import java.util.List;

public class testing {

  public static void main(String[] args) {

    String[] s = { "apple", "banana", "carrot", "donkey" };
    String b = "basdhtdfhnana";
    String c = "";
    List<String> ss = new ArrayList<>();

    for (String s1 : s) {
      ss.add(s1);
    }
    System.out.println(ss);
    for (String st : ss) {
      c += st + ", ";
    }

    System.out.println(c);
    boolean a = ss.remove(b);
    System.out.println(a);

    

    // List<Integer> numbers = new ArrayList<Integer>();
    // numbers.add(12);
    // numbers.add(8);
    // numbers.add(2);
    // numbers.add(23);

    // Iterator<Integer> i = numbers.iterator();
    // while (i.hasNext()) {
    //   System.out.println(i.next());
    // }
  }
}
//
//
//
//
