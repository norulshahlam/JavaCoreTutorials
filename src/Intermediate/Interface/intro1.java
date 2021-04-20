package Intermediate.Interface;

/*
Interfaces specify what a class must do and not how. It is the blueprint of the class.

Why do we use interface ?

It is used to achieve total abstraction.
Since java does not support multiple inheritance in case of class, but by using interface it can achieve multiple inheritance .
It is also used to achieve loose coupling.
Interfaces are used to implement abstraction. 

So the question arises why use interfaces when we have abstract classes?

The reason is, abstract classes may contain non-final variables, whereas variables in interface are final, public and static.

https://www.geeksforgeeks.org/interfaces-in-java/
*/

// A class that implements the interface.
public class intro1 implements In1
{
    // Implementing the capabilities of
    // interface.
    public void display()
    {
        System.out.println("Geek");
    }
  
    // Driver Code
    public static void main (String[] args)
    {
        intro1 t = new intro1();
        t.display();
        System.out.println(a);
    }
}

// A simple interface
interface In1
{
    // public, static and final
     int a = 10;
  
    // public and abstract 
    void display();
}