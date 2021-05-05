package Intermediate.ObjectCopy;

import java.util.Arrays;

/*
In object-oriented programming, object copying is creating a copy of an existing object, the resulting object is called an object copy or simply copy of the original object

https://www.geeksforgeeks.org/deep-shallow-lazy-copy-java-examples/#:~:text=In%20shallow%20copy%2C%20only%20fields,as%20well%20as%20objet%20references.

we deep copy using Copy Constructor
*/
public class DeepCopy {
  public static void main(String[] args)  {
    int[] vals = {3, 7, 9};
    Ex e = new Ex(vals);
    e.showData(); // prints out [3, 7, 9]
    vals[0] = 13;
    e.showData(); // prints out [3, 7, 9]

   // changes in array values will not be 
   // shown in data values. 
  }
}
// Code explaining deep copy
class Ex {
      
  private int[] data;

  // altered to make a deep copy of values
  public Ex(int[] values) {
      data = new int[values.length];
      for (int i = 0; i < data.length; i++) {
          data[i] = values[i];
      }
  }

  public void showData() {
      System.out.println(Arrays.toString(data));
  }
}