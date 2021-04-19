package Beginner.IntegerLiteral;

/*
An integer literal is of type long if it ends with the letter L or l; otherwise it is of type int.

https://docs.oracle.com/javase/tutorial/java/nutsandbolts/datatypes.html
*/
public class intergerLiteral {
  public static void main(String[] args) {

    // error cos it is still int type by default which is above its max value for
    // int

    // long i = 12345678910;
    long j = 12345678910L; //

    // float f = 0.05; // error - for this, its default type is double. u can use
    // literal or casting
    float g = 0.05f;
    float h = (float) 0.05;

    // this doesnt give error cos it is still within range of int

    short s = 23464;
    // how to check the datatype of prmimitive var
    System.out.println(((Object) j).getClass().getName());
    System.out.println(((Object) g).getClass().getName());
    System.out.println(((Object) h).getClass().getName());
    System.out.println(((Object) s).getClass().getName());
  }
}
