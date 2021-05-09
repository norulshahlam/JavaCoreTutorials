package Advance.Threads;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/*

https://www.udemy.com/course/java-programming-tutorial-for-beginners/learn/lecture/9565852#content

ExecutorService is a JDK API that simplifies running tasks in asynchronous mode. Generally speaking, ExecutorService automatically provides a pool of threads and an API for assigning tasks to it.

Future

Represents the result of an asynchronous computation. Methods are provided to check if the computation is complete, to wait for its completion, and to retrieve the result of the computation. The result can only be retrieved using method get when the computation has completed,

This is similar to javascript Promises

 */
public class Future7 {
  public static void main(String[] args) throws InterruptedException, ExecutionException {
    System.out.println("***********************");

    ExecutorService es = Executors.newFixedThreadPool(1);
    Future<String> f = es.submit(new task5("bob"));

    System.out.println("executed");

    String s= f.get();

    System.out.println(s);
    System.out.println("completed");
    es.shutdown();
  }
}

class task5 implements Callable<String> {

  private String n;

  public task5(String n) {
    this.n = n;
  }

  @Override
  public String call() throws Exception {
    Thread.sleep(2000);
    return "hi " + n;
  }
}