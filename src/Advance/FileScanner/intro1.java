package Advance.FileScanner;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/*

how read file directory

*/
public class intro1 {

  public static void main(String[] args) throws IOException {


    System.out.println("\n\nget the items in MAIN directory\n");
    Files.list(Paths.get(".")).forEach(System.out::println);
  
    System.out.println("\n\nget the items in SOURCE directory\n");
    Files.list(Paths.get("./src")).forEach(System.out::println);

    /**** get files recursively ******/

    // alternative: u can store the path var and u it as arg
    Path currentDirectory = Paths.get(".");
    
    
    
   
    System.out.println("\n\nu can also get file recursively - 1 level deep\n");
    Files.walk(currentDirectory, 1).forEach(System.out::println);

    System.out.println("\n\nu can also get file recursively - 2 level deep\n");
    Files.walk(currentDirectory, 2).forEach(System.out::println);
  }
}
