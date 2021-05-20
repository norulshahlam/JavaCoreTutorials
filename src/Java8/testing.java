package Java8;

public class testing {

  public static void main(String[] args) {
    int a = 9;
    try {
      if (a > 0) {
        throw new ArithmeticException();
      }
    } catch (ArithmeticException e) {
      System.out.println(e);
      System.out.println("is more than 0!");
    }

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
