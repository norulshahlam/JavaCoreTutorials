package Java8.Streams;
import java.util.List;
/*
reduce operation applies a binary operator to each element in the stream where the first argument to the operator is the return value of the previous application and second argument is the current stream element.

sum(), min(), max(), count() etc. are some examples of reduce operations. reduce() explicitly asks you to specify how to reduce the data that made it through the stream.

we will show the structured method first before going to functional 

1. Structured approach
2. functional approach
3. lambda approach
 4. method reference - similar to method ref used for System.out.println()) - class=System.out, method=println. so for this case, Integer is a class having a sum method
*/
public class Reduce {
  public static void main(String[] args) {

    List<Integer> numbers = List.of(12, 9, 13, 4, 6, 2, 4, 12, 15);

    System.out.println(getTotal1(numbers));
    System.out.println(getTotal2(numbers));
    System.out.println(getTotal3(numbers));
    System.out.println(getTotal4(numbers));
  }
  // 1. Structured approach
  private static int getTotal1(List<Integer> numbers) {
    int sum = 0;
    for (int number : numbers) {
      sum += number;
    }
    return sum;
  }
  // 2. functional approach
  private static int getTotal2(List<Integer> numbers) {
		return numbers.stream()
		  .reduce(0, Reduce::sum);		
	}
  private static int sum(int a, int b) {
		return a + b;
	}

  // 3. lambda approach
  private static int getTotal3(List<Integer> numbers) {
    return numbers.stream()
    .reduce(0, (x,y)->x+y);
  }

  // 4. method reference
  private static int getTotal4(List<Integer> numbers) {
    return numbers.stream()
    .reduce(0, Integer::sum);
  }

}
