package Advance.Threads;

/*
https://www.udemy.com/course/java-programming-tutorial-for-beginners/learn/lecture/9565840#content

states of threads

1. new - creation of thread
2. runnable - started, but waiting
3. running - started, on-going
4. blocked/waiting
5. terminated/dead - thread has finished execution

when t1 is running, i1 is in runnable state
when i1 is running, t1 is in runnable state

run this to see who / show they start off
 */
public class ThreadPriority3 {
  public static void main(String[] args) {
    System.out.println("***********************");

    task2 t = new task2();

    // 1.
    task1 t1 = new task1();
    Thread t2 = new Thread(t);
    t1.start();
    t2.start();

  }
}
