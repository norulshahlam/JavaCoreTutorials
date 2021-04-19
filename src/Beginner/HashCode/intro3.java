package Beginner.HashCode;
/*
The hashCode() method is a Java Integer class method which returns the hash code for the given inputs. There are two different types of Java hashCode() method which can be differentiated depending on its parameter.

These are:

1. Java Integer hashCode() Method
2. Java Integer hashCode(int value) Method

hashCode() Method
The hashCode() is a method of Java Integer Class which determines the hash code for a given Integer. It overrides hashCode in class Object. By default, this method returns a random integer that is unique for each instance.

hashCode(int value) Method
The hashCode(int value) is an inbuilt Java Integer Class method which determines a hash code for a given int value. This method is compatible with Integer.hashCode().
*/
public class intro3 {
  public static void main(String[] args)  
    {  
        //Create integer object  
        Integer i = new Integer("155");  
        //Returns hash code value determined from int val   
      System.out.println(i.hashCode());

      String a="123";
      // returns random number
      System.out.println(a.hashCode());
    }  
}
