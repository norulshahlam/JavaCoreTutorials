package Advance.Threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/*

https://www.udemy.com/course/java-programming-tutorial-for-beginners/learn/lecture/9565852#content

ExecutorService is a JDK API that simplifies running tasks in asynchronous mode. Generally speaking, ExecutorService automatically provides a pool of threads and an API for assigning tasks to it.

newFixedThreadPool

At any point, at most nThreads threads will be active processing tasks. If additional tasks are submitted when all threads are active, they will wait in the queue until a thread is available

 */
public class ExecutorService6 {
  public static void main(String[] args) throws InterruptedException {
    System.out.println("***********************");

    ExecutorService es = Executors.newFixedThreadPool(2);

    es.execute(new Thread(new task4(1)));
    es.execute(new Thread(new task4(2)));
    es.execute(new Thread(new task4(3)));
    es.execute(new Thread(new task4(4)));
    es.execute(new Thread(new task4(5)));

    es.shutdown();
  }
}

class task4 extends Thread {

  private int n;

  public task4(int n) {
    this.n = n;
  }

  public void run() {
    System.out.print("t" + n + " start\n");
    for (int i = 1; i < 10; i++) {
      System.out.print("t" + i + " ");
    }
    System.out.print("t" + n + " end \n");

  }
}