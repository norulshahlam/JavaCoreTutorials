package Advance.ExceptionHandler;

/*
Some resources requires you to use try-catch because they have a potential to cause exceptions. resources like FileReader, BufferedReader, SQLConnections etc.
You can avoid handling this by suppressing them by adding 'throws Exception' in your main method. this will ignore ALL resources. if u only 1 2 suppress certain resource, use that specific handler eg 'throws IOException'. NOTE: use this if u r certain theres no error
*/
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLException;

public class SuppressedExceptions4 {
  // remove the thorws statement n c what happens
  public static void main(String[] args) throws IOException, SQLException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    System.out.println("Enter something");
    String str = br.readLine();
    System.out.println("You typed: " + str);

  }
}
