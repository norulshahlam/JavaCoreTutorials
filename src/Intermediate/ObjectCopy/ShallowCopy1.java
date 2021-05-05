package Intermediate.ObjectCopy;

import java.util.Objects;
/*
here we have our plain POJO. here we just create a new obj using exisiting obj so by default it is shallow copy

1. create instance of the new obj based on old obj
2. try to change one of the field
3. print to see if it affect the other
*/
public class ShallowCopy1 {
  public static void main(String[] args) {

    /**** shallow copy *****/
    Employee a = new Employee("shah", 35, "singapore");

    // we cant use this method - constr for this not created
    // Employee b = new Employee(a);
    //  1.
    Employee b = a;

    System.out.println(a);
    System.out.println(b);

    /* 2. change one of the field will reesult in changing the other */
    b.setAge(10);
    System.out.println("************");
    // 3.
    System.out.println(a);
    System.out.println(b);
    
  }
}

class Employee {

  private String name;
  private int age;
  private String country;

  public Employee() {
  }

  public Employee(String name, int age, String country) {
    this.name = name;
    this.age = age;
    this.country = country;
  }

  public Employee(String name, int age) {
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

  public Employee name(String name) {
    setName(name);
    return this;
  }

  public Employee age(int age) {
    setAge(age);
    return this;
  }

  public Employee country(String country) {
    setCountry(country);
    return this;
  }

  @Override
  public boolean equals(Object o) {
    if (o == this)
      return true;
    if (!(o instanceof Employee)) {
      return false;
    }
    Employee employee = (Employee) o;
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