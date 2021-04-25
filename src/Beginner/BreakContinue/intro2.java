package Beginner.BreakContinue;

package Beginner.BreakContinue;

public class intro2 {
  public static void main(String[] args) {
/*
The continue statement breaks one iteration (in the loop), if a specified condition occurs, and continues with the next iteration in the loop. This example skips the value of 4:

The break statement can also be used to jump out of a loop. unlike Continue, it wont continue with the nezxt iteration.
This example jumps out of the loop when i is equal to 4:
*/
    /***** CONTINUE *******/
    for (int i = 0; i < 10; i++) {
      if (i == 4) {
        System.out.println("Skip this iteration");
        continue;
      }
      System.out.println(i);
    }

    /***** BREAK *******/
    for (int i = 0; i < 10; i++) {
      if (i == 4) {
        System.out.println("iteration stops after this");
        break;
      }
      System.out.println(i);
    }
  }
}
