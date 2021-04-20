package Intermediate.ReferenceVariable;
/*
we show that an obj can have ref of another obj.
a change of either one of the obj property can effect the ohter as they point to the same memory
we can dereference and obj - point to other obj memory
there is no way to access an obj directly - all is done using reference
*/
public class intro3 {
  
  public static void main(String[] args) {
/*
h2 is a reference of h1 - any change in h2/h1 affects the other
*/
House green = new House("green");
House random = green;

System.out.println(green.getColor());
System.out.println(random.getColor());

//change in 1 affect the other
random.setColor("blue");

System.out.println(green.getColor());
System.out.println(random.getColor());

//now we create another obj
House pink = new House("pink");
//this is dereferencing - pointing to another obj in memory
random = pink;

System.out.println(pink.getColor());
System.out.println(random.getColor());

  }
}


 class House{
   private String color="yellow";

  public House() {
  }

  public House(String color) {
    this.color = color;
  }


  public String getColor() {
    return this.color;
  }

  public void setColor(String color) {
    this.color = color;
  }

 }