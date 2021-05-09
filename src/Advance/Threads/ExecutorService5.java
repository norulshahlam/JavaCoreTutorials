package Advance.Threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/*

https://www.udemy.com/course/java-programming-tutorial-for-beginners/learn/lecture/9565852#content

ExecutorService is a JDK API that simplifies running tasks in asynchronous mode. Generally speaking, ExecutorService automatically provides a pool of threads and an API for assigning tasks to it.

newSingleThreadExecutor

This method returns thread pool executor which executes one task at a time.If you have submitted n task to executors, it will execute it one by one.

1. we will create a new thread pool executor FROM DIFF CLASS and will expects the thread to be executed one at a time
 */
public class ExecutorService5 {
  public static void main(String[] args) throws InterruptedException {
    System.out.println("***********************");


    ExecutorService es = Executors.newSingleThreadExecutor();

    es.execute(new Thread(new task1()));
    es.execute(new Thread(new task2()));

    es.shutdown();
  }
}

