package Java8.FunctionalProgramming.HigherOrderFunction;

import java.util.stream.LongStream;

/*
making use of parellel streams. we creeate a range of big numbers and count the time taken vs using parellel Streams. One question you might be asking is, why is it easy to parallelize functional code.

Why can't I just parallelize structured code?

The problem with structured code, typically, is that we have a lot of state present. So, over here, what I mean by state? The thing is, the sum has a initial value and as we loop, we keep appending, we keep adding to the sum and therefore, the value of this variable sum keeps changing and that is what is called state. So, the state of the sum variable keeps changing and that's why, you cannot run it in two different cores.

So, what Java does is, it would run the entire method in a single core because you have state in here. You have a variable whose value is changing all the time. Now, how did we do the same thing in a functional approach? The way we did it was we said numbers.stream(),
we created a stream, and then we defined what operation needs to be done on that specific stream. Now, if I add a .parallel() in here, if I had a ,parallel() in here, then we are telling Java that we can execute this stream in a parallel way. What Java can do is, actually split the stream into multiple parts and execute these operations on those multiple parts and finally, combine the results of all those multiple parts.
*/
public class StreamParallelization {
  public static void main(String[] args) {

    long time = System.currentTimeMillis();
    // 0 -100000000000
    System.out.println(LongStream.range(0, 1000000000).sum());
    System.out.println(System.currentTimeMillis() - time);
    long time2 = System.currentTimeMillis();
    // 0 -100000000000
    System.out.println(LongStream.range(0, 1000000000).parallel().sum());
    System.out.println(System.currentTimeMillis() - time2);

  }
}
