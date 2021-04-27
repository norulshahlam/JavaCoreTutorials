package Advance.Comparator;
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
    al.add(new Student(105, "Jai", 21));
    for (Student st : al)
      System.out.println("Before sort: " + st.rollno + " " + st.name + " " + st.age);
    System.out.println("Sorting by Name");
    Collections.sort(al, new sortByName());
    for (Student st : al)
      System.out.println("after sort by name: " + st.rollno + " " + st.name + " " + st.age);

    System.out.println("sorting by Age");
    Collections.sort(al, new sortByAge());
    for (Student st : al)
      System.out.println("after sort by age: " + st.rollno + " " + st.name + " " + st.age);
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

class sortByAge implements Comparator<Student> {
  public int compare(Student s1, Student s2) {
    System.out.println(s1.age + " " + s2.age);
    if (s1.age == s2.age)
      return 0;
    else if (s1.age > s2.age)
      return 1;
    else
      return -1;
  }
}

class sortByName implements Comparator<Student> {
  public int compare(Student s1, Student s2) {
    return s1.name.compareTo(s2.name);
  }
}