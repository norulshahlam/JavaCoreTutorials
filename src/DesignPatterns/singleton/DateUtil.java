package DesignPatterns.singleton;

/*
## Steps

1. decalre contructor of the class as private
2. declare a static method
3. declare a static member of the same class type in the class
*/
public class DateUtil {

  // 3.
  private static DateUtil instance;
  static {
    instance = new DateUtil();
  }

  // 1.
  private DateUtil() {
  }

  // 2.
  public static DateUtil getInstance() {

    if (instance == null) {
      instance = new DateUtil();
    }
    return instance;
  }
}
