package Advance.FileScanner;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class fruits {

  public static void main(String[] args) throws IOException {

    Path dir = Paths.get("./src/Advance/FileScanner/fruits.txt");

    Files.lines(dir).forEach(i -> System.out.print("\"" + i + "\", "));

  }
}
