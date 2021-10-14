package Advance.FileScanner;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.function.BiPredicate;
import java.util.function.Predicate;
  /*
now we know how to get file, let's filter!

1. find filename with .java extension

with method 2, u can use the attribute() to search diff criteria like

2a - size more than 1000 bytes 
2b - if it is a directory
   */
public class filter2 {

  @SuppressWarnings({"unused"})

  public static void main(String[] args) throws IOException {

    Path currentDirectory = Paths.get(".");
    //
    /*** method 1 ****/
    Predicate<? super Path> p = path -> String.valueOf(path).contains(".txt");
    // 1.
    Files.walk(currentDirectory, 4).filter(p).forEach(System.out::println);

    //
    BiPredicate<Path, BasicFileAttributes> matcher = (path, attributes) -> String.valueOf(path).contains(".java");

    /*** method 2 - using find() ****/

    BiPredicate<Path, BasicFileAttributes> bySize = (path, attributes) -> attributes.size() > 10000;

    BiPredicate<Path, BasicFileAttributes> ifFolder = (path, attributes) -> attributes.isDirectory();

    // 1.
    // Files.find(currentDirectory, 4, matcher).forEach(System.out::println);
    // 2a
    // Files.find(currentDirectory, 3, bySize).forEach(System.out::println);
    // 2b
    Files.find(currentDirectory, 3, ifFolder).forEach(System.out::println);
  }
}
