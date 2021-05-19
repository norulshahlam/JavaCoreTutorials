package Java8;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.IntStream;

public class ggg {

  public static void main(String[] args) {
    List<String> courses = List.of("Spgg", "Spring Boot", "API", "Microservices", "AWS", "PCF", "Azure", "Docker",
        "Kubernetes");

    Optional<String> q = courses.stream().peek(System.out::println).filter(c -> c.length() > 12)
        .map(String::toUpperCase).peek(System.out::println).findFirst();

    System.out.println(q);

  }

}
//
//
//
//
//
//
//
//
//
//
//
//
//

class Course {
  private String name;
  private String category;
  private int reviewScore;
  private int noOfStudents;

  public Course(String name, String category, int reviewScore, int noOfStudents) {
    super();
    this.name = name;
    this.category = category;
    this.reviewScore = reviewScore;
    this.noOfStudents = noOfStudents;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getCategory() {
    return category;
  }

  public void setCategory(String category) {
    this.category = category;
  }

  public int getReviewScore() {
    return reviewScore;
  }

  public void setReviewScore(int reviewScore) {
    this.reviewScore = reviewScore;
  }

  public int getNoOfStudents() {
    return noOfStudents;
  }

  public void setNoOfStudents(int noOfStudents) {
    this.noOfStudents = noOfStudents;
  }

  public String toString() {
    return name + ":" + noOfStudents + ":" + reviewScore;
  }

  public int length() {
    return 0;
  }

}
