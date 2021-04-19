package Beginner.Unicode;

/*
Unicode is a universal international standard character encoding that is capable of representing most of the world's written languages.

In unicode, character holds 2 byte, so java also uses 2 byte for characters.
lowest value:\u0000
highest value:\uFFFF

https://unicode-table.com/en/

*/
public class UniCode {
  public static void main(String[] args) {

    char c1 = 'D';
    char c2 = '\u0044'; // same
    char c3 = '\u00A9'; // some symbol

    System.out.println(c1);
    System.out.println(c2);
    System.out.println(c3);
  }

}
