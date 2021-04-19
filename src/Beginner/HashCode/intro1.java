package Beginner.HashCode;
/*
A hash code is an integer value that is associated with each object in Java. Its main purpose is to facilitate hashing in hash tables, which are used by data structures like HashMap.
*/
public class intro1{
  public static void main(String[] args){
      String a = "200";
      String b = "200";

      /*  String having same value has the same hashcode. strings a and b have the same hash code because, for strings, the hash codes are derived from their contents.
			 */
      if(a.equals(b)){
          System.out.println("Equal variables:");
          System.out.println(a.hashCode() + "\n" + b.hashCode());
      }

      String c = "10";
      String d = "50";
      /*  String having diff value usually has diff hashcode  */
      if(!c.equals(d)){
          System.out.println("\nUn-equal variables:");
          System.out.println(c.hashCode() + "\n" + d.hashCode());
      }
  }
}