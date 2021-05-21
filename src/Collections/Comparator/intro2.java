package Collections.Comparator;

/*
this is the same as previous demo.
comparator can be used to sort multiple elements so we will create 1 to sort by name, another 1 by age.
steps are similar to comparable:

 a) create a class that implement comparator
 b) override compareTo() inside this class to define your sorting logic
 c) ctreate obj of this class in main()
 d) use this overridden method by Collections.sort(itemToBeSorted, yourCustomSort);
*/
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class intro2 {
  public static void main(String args[]) {
    ArrayList<Student> al = new ArrayList<Student>();
    al.add(new Student(101, "Vijay", 23));
    al.add(new Student(106, "Ajay", 27));
    al.add(new Student(109, "ashish", 18));
    al.add(new Student(105, "Jai", 21));

    al.forEach(s -> System.out.println(s.rollno + " " + s.name + " " + s.age));
    System.out.println("\nSorting by Name\n");

    Collections.sort(al, new sortByName());
    al.forEach(s -> System.out.println(s.rollno + " " + s.name + " " + s.age));

    System.out.println("\nsorting by Age Asc\n");
    Collections.sort(al, new sortByAgeAsc());
    al.forEach(s -> System.out.println(s.rollno + " " + s.name + " " + s.age));

    System.out.println("\nsorting by Age Desc\n");
    Collections.sort(al, new sortByAgeDesc());
    al.forEach(s -> System.out.println(s.rollno + " " + s.name + " " + s.age));
  }
}

class sortByAgeAsc implements Comparator<Student> {
  public int compare(Student s1, Student s2) {
    return Integer.compare(s1.age, s2.age);
  }
}

class sortByAgeDesc implements Comparator<Student> {
  public int compare(Student s1, Student s2) {
    return Integer.compare(s2.age, s1.age);
  }
}

class sortByName implements Comparator<Student> {
  public int compare(Student s1, Student s2) {
    return s1.name.compareTo(s2.name);
  }
}

class Student {
  int rollno;
  String name;
  int age;

  Student(int rollno, String name, int age) {
    this.rollno = rollno;
    this.name = name;
    this.age = age;
  }
}