package Collections.Generics;

import java.util.ArrayList;

/*
with generics, u can insert any value type, not restrictied to 1 datatype
*/
public class intro2 {
  public static void main(String[] args) {
    // generics with methods
    System.out.println(showme(4));
    System.out.println(showme("dhhrshr"));
    System.out.println(showme('W'));
    System.out.println(showme(false));

    // generics with collection
    CustomListType<String> s = new CustomListType<String>();
    s.add("hello");
    s.add("world");

    CustomListType<Integer> i = new CustomListType<Integer>();
    i.add(44);
    i.add(794);

  }

  // generics with methods
  static <TYPE> TYPE showme(TYPE value) {
    return value;
  }
}

// generics with collection
class CustomListType<T> {
  ArrayList<T> list = new ArrayList<T>();

  public void add(T element) {
    list.add(element);
  }

  public void remove(T element) {
    list.remove(element);
  }

  @Override
  public String toString() {
    return list.toString();
  }

}