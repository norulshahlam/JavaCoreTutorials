package Java8.FunctionalProgramming3;

import java.util.stream.IntStream;

/*
1. thread using structured approach
2. thread using functional approach

  You can see that we can get rid of all the ceremony round creating a runnable interface, defining a method, and all that stuff. All that we need to do is, to create runnable is equal to, just define a simple lambda expression. What would happen is, this would create a implementation of the runnable interface. Why is it creating the implementation of the runnable interface?

  Because runnable is also a functional interface. There is just one abstract method which is present in here: run()
*/
public class Threads1 {
  @SuppressWarnings("unused")
  public static void main(String[] args) {
    // 1.
    Runnable r = new Runnable() {

      @Override
      public void run() {

        for (int i = 0; i < 100; i++) {
          System.out.println(Thread.currentThread().getId() + " : " + i);
        }
      }
    };

    Thread t1 = new Thread(r);
    Thread t2 = new Thread(r);
    Thread t3 = new Thread(r);
    // t1.start();
    // t2.start();
    // t3.start();

    // 2. functional appraoch
    Runnable r2 = () -> {

      for (int i = 0; i < 10000; i++) {
        System.out.println(Thread.currentThread().getId() + " : " + i);
      }
    };

    Thread t4 = new Thread(r2);
    Thread t5 = new Thread(r2);
    Thread t6 = new Thread(r2);
    // t4.start();
    // t5.start();
    // t6.start();

    Runnable r3 = () -> IntStream.range(0, 10000)
        .forEach(i -> System.out.println(Thread.currentThread().getId() + ":" + i));

    Thread t7 = new Thread(r3);
    Thread t8 = new Thread(r3);
    Thread t9 = new Thread(r3);
    t7.start();
    t8.start();
    t9.start();

  }
}
