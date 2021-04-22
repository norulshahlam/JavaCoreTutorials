package Advance.Threads;
/*
Threads allows a program to operate more efficiently by doing multiple things at the same time.

Threads can be used to perform complicated tasks in the background without interrupting the main program.

There are two ways to create a thread.
1st - extending the Thread class and overriding its run() method:
2nd - implements the Runnable interface. the thread can be run by passing an instance of the class to a Thread object's constructor and then calling the thread's start() method:
*/
public class ImplementsRunnable {
  public static void main(String[] args) {
    test2 obj = new test2();
    Thread thread = new Thread(obj);
    thread.start();
    System.out.println("This code is outside of the thread");
  }
}
class test2 implements Runnable {

  public void run() {
    System.out.println("This code is running in a thread");
  }
}
