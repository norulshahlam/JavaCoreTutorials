package Advance.Threads;

/**
 * how to use thread.
 * 
 * 1. extend threads 2. implements runnable
 * 
 * both has diff way to implement.
 * 
 * t / t1 - thread using extends threads i / t2 - threads using impemennd
 * methods n - not thread
 * 
 * run this to see who / show they start off
 */
public class intro1 {
  @SuppressWarnings({"unused"})

  public static void main(String[] args) {
    System.out.println("***********************");

    task1 t1 = new task1();
    task2 t = new task2();
    Thread t2 = new Thread(t);
    // t1.start();
    // t2.start();
    t2.run();
    System.out.print("n1 start\n");
    for (int i = 1; i < 100; i++) {
      System.out.print("n" + i + " ");
    }
    System.out.print("n1 end \n");

  }
}

class task1 extends Thread {

  public void run() {
    System.out.print("t1 start\n");
    for (int i = 1; i < 10; i++) {
      System.out.print("t" + i + " ");
    }
    System.out.print("t1 end \n");

  }
}

class task2 implements Runnable {

  public void run() {
    System.out.print("t2 start\n");
    for (int i = 1; i < 10; i++) {
      System.out.print("i" + i + " ");
    }
    System.out.print("t2 end \n");
  }
}