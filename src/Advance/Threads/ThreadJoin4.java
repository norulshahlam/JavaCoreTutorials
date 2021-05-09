package Advance.Threads;
         
/*
https://www.udemy.com/course/java-programming-tutorial-for-beginners/learn/lecture/9565846#content

thread join()

The join method allows one thread to wait for the completion of another.
here t1 & t2 must finish first then t3 can start

 */
public class ThreadJoin4 {
  public static void main(String[] args) throws InterruptedException {
    System.out.println("***********************");

    task2 t = new task2();

    // 1.
    task1 t1 = new task1();
    Thread t2 = new Thread(t);
    task3 t3 = new task3();

    t1.start();
    t2.start();
    t1.join();
    t2.join();
    t3.start();

  }
}
