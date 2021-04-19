package Intermediate.Encapsulation;

/*
Encapsulation is one of the four fundamental OOP concepts. The other three are inheritance, polymorphism, and abstraction.

Encapsulation in Java is a mechanism of wrapping the data (variables) and code acting on the data (methods) together as a single unit. In encapsulation, the variables of a class will be hidden from other classes, and can be accessed only through the methods of their current class. Therefore, it is also known as data hiding.

To achieve encapsulation in Java −

a) Declare the variables of a class as private.
b) Provide public setter and getter methods to modify and view the variables values.
*/
public class intro1 {
  public static void main(String args[]) {
Student A = new Student();
A.setAge(21);
A.setName("bob");

System.out.println("Student A details: Name: "+A.getName()+", age: "+A.getAge());
  }
}

class Student {

  // a) Declare the variables of a class as private.
  private String name;
  private int age;

  // b) Provide public setter and getter methods to modify and view the variables values.

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getAge() {
    return this.age;
  }

  public void setAge(int age) {
    this.age = age;
  }
  
}