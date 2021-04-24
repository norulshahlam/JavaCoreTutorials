package Java8.FunctionalInterfaces;
/*
same as previous lesson, we are goingt obreakdown the BinaryOpeator
*/
import java.util.List;
import java.util.function.BinaryOperator;

public class intro2 {

  @SuppressWarnings("unused")
  public static void main(String[] args) {

    List<Integer> numbers = List.of(12, 9, 13, 4, 6, 2, 4, 12, 15);

    // 1. simplified
    int sum = numbers.stream().reduce(0, Integer::sum);
    System.out.println(sum);

    // 2. behaviour parameterization
    BinaryOperator<Integer> sumBinaryOperator2 = Integer::sum;
    int sum2 = numbers.stream().reduce(0, sumBinaryOperator2); 
    System.out.println(sum);

    // 3. behaviour parameterization - more breakdown
    BinaryOperator<Integer> sumBinaryOperator3 = (x, y) -> x + y;
    int sum3 = numbers.stream().reduce(0, sumBinaryOperator3);

    // 4. behaviour parameterization - more breakdown
    BinaryOperator<Integer> sumBinaryOperator4 = new BinaryOperator<Integer>() {
      @Override
      public Integer apply(Integer a, Integer b) {
        return a + b;
      }
    };
    int sum4 = numbers.stream().reduce(0, sumBinaryOperator4);
  }
}
