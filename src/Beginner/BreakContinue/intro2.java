package Beginner.BreakContinue;

/*
The break statement can also be used to jump out of a loop.
This example jumps out of the loop when i is equal to 4:
*/
public class intro2 {
  public static void main(String[] args) {

    for (int i = 0; i < 10; i++) {
      if (i == 4) {
        System.out.println("iteration stops after this");
        break;
      }
      System.out.println(i);
    }
  }
}
