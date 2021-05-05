package Advance.FileScanner;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

/*
now we will write to a file

 */
public class readfile3 {

  public static void main(String[] args) throws IOException {

    Path currentDirectory = Paths.get("./src/Advance/FileScanner/writeme4.txt");

    List<String> list =
    List.of("Apple","banana","carrot","donkey","elephant");

    Files.write(currentDirectory, list);
  }
}
