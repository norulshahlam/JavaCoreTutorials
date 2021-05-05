package Intermediate.ObjectCopy;

import java.util.Arrays;

public class ShallowCopy {
  public static void main(String[] args) {
    int[] vals = { 3, 7, 9 };
    Ex2 e = new Ex2(vals);
    e.showData(); // prints out [3, 7, 9]
    /* changing 1 of this obj will change the other */
    vals[0] = 13;
    e.showData(); // prints out [13, 7, 9]
  }
}

//
//
class Ex2 {

  private int[] data;

  // makes a shallow copy of values
  public Ex2(int[] values) {
    data = values;
  }

  public void showData() {
    System.out.println(Arrays.toString(data));
  }
}