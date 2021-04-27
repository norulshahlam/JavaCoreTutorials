package Java8.FunctionalProgramming.HigherOrderFunction;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.List;

/*
understand a very important functional concept called Higher Order Functions.

What is a higher order function? A higher order function is a function which returns a function.
 */
public class intro1 {
  public static void main(String[] args) {
    List<Course> courses = List.of(
        new Course("Spring", "Framework", 98, 20000),
        new Course("Spring Boot", "Framework", 95, 18000), 
        new Course("API", "Microservices", 97, 22000),
        new Course("Microservices", "Microservices", 96, 25000), 
        new Course("FullStack", "FullStack", 91, 14000),
        new Course("AWS", "Cloud", 92, 21000), 
        new Course("Azure", "Cloud", 99, 21000),
        new Course("Docker", "Cloud", 92, 20000), 
        new Course("Kubernetes", "Cloud", 91, 20000));
   
        // 1st layer 
        System.out.println(courses.stream().allMatch(course -> course.getReviewScore() > 95)); // 1.
        System.out.println(courses.stream().allMatch(course -> course.getReviewScore() > 90)); // 1.

        System.out.println("\n************************\n");

        //2nd layer
        Predicate<Course> reviewScoreGreaterThan95Predicate = course -> course.getReviewScore() > 95;
        Predicate<Course> reviewScoreGreaterThan90Predicate = course -> course.getReviewScore() > 90;

        // System.out.println(courses.stream().allMatch(reviewScoreGreaterThan95Predicate)); // 1.
        // System.out.println(courses.stream().noneMatch(reviewScoreLessThan90Predicate)); // 2.
        // System.out.println(courses.stream().anyMatch(reviewScoreLessThan90Predicate)); // 3.
      
        //higher order function
        //
        // 2 - Predicate returns a function
        Predicate<Course> reviewScoreGreaterThan95Predicate2 
                = createPredicateWithCutoffReviewScore(95);

        Predicate<Course> reviewScoreGreaterThan90Predicate2
                = createPredicateWithCutoffReviewScore(90);

                // 1 - calls the predicate of allMatch()
                System.out.println(courses.stream().allMatch(reviewScoreGreaterThan95Predicate2));
                System.out.println(courses.stream().allMatch(reviewScoreGreaterThan90Predicate2));
  }
  // 3 - calls this function
  private static Predicate<Course> createPredicateWithCutoffReviewScore(int cutoffReviewScore) {
		return course -> course.getReviewScore() > cutoffReviewScore;
	}
}