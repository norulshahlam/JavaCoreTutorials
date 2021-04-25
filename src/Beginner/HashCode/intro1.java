package Beginner.HashCode;

/*
A hash code is an integer value that is associated with each object in Java. Its main purpose is to facilitate hashing in hash tables, which are used by data structures like HashMap.
*/
public class intro1 {
    public static void main(String[] args) {
        String a = "200";
        String b = "200";

        /*
         * String having same value has the same hashcode. strings a and b have the same
         * hash code because, for strings, the hash codes are derived from their
         * contents.
         */
        System.out.println(a.equals(b));
        System.out.println(a.hashCode());
        System.out.println(b.hashCode());

        String c = "49";
        String d = "50";

        /* String having diff value usually has diff hashcode */
        System.out.println(c.equals(d));
        System.out.println(c.hashCode());
        System.out.println(d.hashCode());
    }
}