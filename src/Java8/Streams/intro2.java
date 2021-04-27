package Java8.Streams;
import java.util.Comparator;
import java.util.List;
/*
1. sort array. by default:
  -for int, sort from smallest to biggest
  -for String, sort from A to Z
also we can sort by reverse default,
also sort by string length using custom sort

2. remove duplicates using distinct()
*/
public class intro2 {
  public static void main(String[] args) {
    List<Integer> numbers = List.of(12, 9, 13, 4, 6, 2, 4, 12, 15);
    List<String> courses = List.of("Spring", "Spring Boot", "API" , "Microservices","AWS", "PCF","Azure", "Docker", "Kubernetes");
   
 distinctNumbers(numbers);
 System.out.println("***************");
 sortNumbers(numbers);
 System.out.println("***************");
 distinctSortNumbers(numbers);
 System.out.println("***************");
 sortReverseNumbers(numbers);
 System.out.println("***************");
 sortByLength(courses);
  }
  
  //only distinct numbers
  private static void distinctNumbers(List<Integer> numbers) {
    numbers.stream()
    .distinct()
    .forEach(System.out::println);
  }

  //sort numbers in asc
  private static void sortNumbers(List<Integer> numbers) {
    numbers.stream()
    .sorted()
    .forEach(System.out::println);
  }
  
  //or both!
  private static void distinctSortNumbers(List<Integer> numbers) {
    numbers.stream()
    .distinct()
    .sorted()
    .forEach(System.out::println);
  }
  
  //sort numbers in asc - custom sort
  private static void sortReverseNumbers(List<Integer> numbers) {
    numbers.stream()
    .sorted(Comparator.reverseOrder())
    .forEach(System.out::println);
  }

   //sort numbers in asc - custom sort
   private static void sortByLength(List<String> courses) {
    courses.stream()
    .sorted(Comparator.comparing(s->s.length()))
    .forEach(System.out::println);
  }
}
