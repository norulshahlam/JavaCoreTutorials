package Java8.FunctionalProgramming.HigherOrderFunction;

/*
1. understand that List is immutable, ArrayList is mutable
2. replaceAll
3. removeIf
*/
import java.util.ArrayList;
import java.util.List;

public class replaceRemove {
  public static void main(String[] args) {

    List<String> courses = List.of("Spring", "Spring Boot", "API", "Microservices", "AWS", "PCF", "Azure", "Docker",
        "Kubernetes");
    List<String> modifyableCourses = new ArrayList<String>(courses);
    //1. Error
    // courses.replaceAll( str -> str.toUpperCase()); 
    //
    // 2.
    modifyableCourses.replaceAll(str -> str.toUpperCase());
    System.out.println(modifyableCourses);
    //
    // 3.
    modifyableCourses.removeIf(str -> str.length() < 6);
    System.out.println(modifyableCourses);
  }
}
