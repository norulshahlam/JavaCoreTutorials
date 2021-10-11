import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Test2 {

  static boolean check(String s1, String s2) {

    // return Arrays.asList(s1.split("")).stream().map(i ->  s2.indexOf(i)).anyMatch(i -> i != -1);
    return Arrays.asList(s1.split("")).stream().anyMatch(i ->  s2.contains(i));
  }

  public static void main(String[] args) {
    String s1 = "rat";
    String s2 = "nda";
    System.out.println(check(s1, s2));
  }
}
