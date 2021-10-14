package Advance.FileScanner;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

/*
now we will read a file

1. normal approach - read everything in a file

in practice, we dont read all. we read certain content using filter so we remove unnecesssary data, avoid memory overloading

2. stream approach - lowercase all content, get only word contain 'a'
 */
public class write4 {
  @SuppressWarnings({"unused"})

  public static void main(String[] args) throws IOException {

    Path currentDirectory = Paths.get("./src/Advance/FileScanner/readme.txt");
    //  1
    List<String> content = Files.readAllLines(currentDirectory);
    // System.out.println(content);

    // 2 
    Files.lines(currentDirectory)
    .map(String::toLowerCase)
    .filter(s -> s.contains("a"))
    .forEach(System.out::println);
  }
}
