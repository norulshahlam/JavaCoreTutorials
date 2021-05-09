package Advance.Threads;

/*
https://www.udemy.com/course/java-programming-tutorial-for-beginners/learn/lecture/9565840#content

we can set the priority level of the thread
max - 10, min -1, normal -5
we set t1 to max prioirty and see the result

it is just a request, it might be honoured or might not be but most time it will be honoured.

 */
public class ThreadStates2 {
  public static void main(String[] args) {
    System.out.println("***********************");

    task2 t = new task2();

    task1 t1 = new task1();
    task3 t3 = new task3();
    t1.setPriority(10);
    Thread t2 = new Thread(t);
    //
    t1.start();
    t2.start();
    t3.start();

  }
}

class task3 extends Thread {

  public void run() {
    System.out.print("t3 start\n");
    for (int i = 1; i < 10; i++) {
      System.out.print("u" + i + " ");
    }
    System.out.print("t3 end \n");

  }
}