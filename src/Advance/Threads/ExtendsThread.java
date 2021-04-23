package Advance.Threads;

/*
Threads allows a program to operate more efficiently by doing multiple things at the same time.

Threads can be used to perform complicated tasks in the background without interrupting the main program.

There are two ways to create a thread.
1st - extending the Thread class and overriding its run() method:
2nd - implements the Runnable interface. the thread can be run by passing an instance of the class to a Thread object's constructor and then calling the thread's start() method.
*******************************************
we are using 2 thread and each thread is to go into for loop 10 times
we will print the id of the thread for every iteration and its count value.
we will see the diff result using sleep timer 
when sleep is set, it is synchronised as shown in the console and is thread-safe
when sleep is not set, the thread dont synchronise and thus is not thread-safe

*/
public class ExtendsThread {
  public static void main(String[] args) {
    test1 thread1 = new test1();
    test1 thread2 = new test1();
    thread1.start();
    thread2.start();
    System.out.println("This code is outside of the thread");
  }
}
class test1 extends Thread {
  public void run() {
    for (int i = 0; i < 10; i++) {
      // get id of thread during instance of execution
      System.out.println("Thread ID: " + Thread.currentThread().getId() + ", Value: " + i);
    }
    try {
      Thread.sleep(1000); // adjust here to ensure they are in concurrent, not sequential
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  }
}
