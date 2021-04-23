package Java8.MethodReference;
/*
 Method reference is used to refer method of functional interface. It is compact and easy form of lambda expression. Each time when you are using lambda expression to just referring a method, you can replace your lambda expression with method reference.

1. structured approach
2. functional approach - use method (print method in intro1 class) as argument.
3. method reference - since the arg for (2) is class::method, we can simply add the print statement inside it. where class=System.out, method=print.  We dont need to creeate the method in (2). tjis results in shorter code
*/
import java.util.List;
public class intro1 {
  public static void main(String[] args) throws Exception {

    printList(List.of(2, 5, 8, 4, 2, 6, 1));
    printListFunctional(List.of(2, 5, 8, 4, 2, 6, 1));
    printListFunctional2(List.of(2, 5, 8, 4, 2, 6, 1));
  }

  // 1. structured approach
  private static void printList(List<Integer> i) {
    for (int j : i)
      System.out.println(j);
  }

  // 2. functional approach
  private static void printListFunctional(List<Integer> i) {
    i.stream().forEach(intro1::print);
  }

  private static void print(int a) {
    System.out.println(a);
  }

  // 3. method reference
  private static void printListFunctional2(List<Integer> i) {
    i.stream().forEach(System.out::println);
  }
}