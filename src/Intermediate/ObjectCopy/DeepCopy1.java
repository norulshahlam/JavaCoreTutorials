package Intermediate.ObjectCopy;
import java.util.Objects;
/*
this is how u deep copy - using copy constructor
1. create constructor
2. create instance of the new obj based on old obj
3. try to change one of the field
4. print to see if it affect the other
*/
public class DeepCopy1 {
  public static void main(String[] args) {

   
    /**** deep copy *****/
    Employee2 a2 = new Employee2("shah", 35);
    /*** 2. IMPORTANT! *****/
    Employee2 b2 = new Employee2(a2);
    System.out.println(a2);
    System.out.println(b2);
    
    /* 3. change one of the field will WONT reesult in changing the other */
    b2.setAge(21);
    System.out.println("************");
    // 4.
    System.out.println(a2);
    System.out.println(b2);

  }

}

class Employee2 {

  private String name;
  private int age;
  private String country;

  public Employee2() {
  }

  public Employee2(String name, int age, String country) {
    this.name = name;
    this.age = age;
    this.country = country;
  }

  //  1.
  public Employee2(Employee2 e) {
    System.out.println("Copy constructor called");
    name = e.name;
    age = e.age;

  }

  public Employee2(String name, int age) {
    this.name = name;
    this.age = age;
  }

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

  public String getCountry() {
    return this.country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  public Employee2 name(String name) {
    setName(name);
    return this;
  }

  public Employee2 age(int age) {
    setAge(age);
    return this;
  }

  public Employee2 country(String country) {
    setCountry(country);
    return this;
  }

  @Override
  public boolean equals(Object o) {
    if (o == this)
      return true;
    if (!(o instanceof Employee2)) {
      return false;
    }
    Employee2 employee = (Employee2) o;
    return Objects.equals(name, employee.name) && age == employee.age && Objects.equals(country, employee.country);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, age, country);
  }

  @Override
  public String toString() {
    return "{" + " name='" + getName() + "'" + ", age='" + getAge() + "'" + ", country='" + getCountry() + "'" + "}";
  }

}