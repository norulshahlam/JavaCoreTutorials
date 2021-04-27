package Intermediate.InstanceLocalVariable;
/*
local vs instance varaibles

https://www.tutorialspoint.com/java/java_variable_types.htm
*/
public class intro1 {

  public static void main(String[] args) {

    Student A = new Student();
    System.out.println(A.name);
   A.printName();
	}
}
@SuppressWarnings("unused")
class Student{
  // this instance variable (or global variable) is visible for any child class.
  String name = "defaultname";

  public void printName(){
  // Here, age is a local variable. This is defined inside tis method and its scope is limited to only this method.
    int age= 21;
    System.out.println("student name is: "+name);
  }
}