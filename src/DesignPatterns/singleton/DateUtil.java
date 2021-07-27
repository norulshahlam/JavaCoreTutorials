package DesignPatterns.singleton;

public class DateUtil {
  private static DateUtil instance;
  static {
    instance = new DateUtil();
  }

  private DateUtil() {}

  public static DateUtil getInstance() {
  
    return instance;
  }
}
