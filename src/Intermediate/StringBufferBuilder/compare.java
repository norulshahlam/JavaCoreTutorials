package Intermediate.StringBufferBuilder;

/*
The String class is an immutable class whereas StringBuffer and StringBuilder classes are mutable.

Only different btwn builder and buffer

StringBuffer
-- synchronized i.e. thread safe. It means two threads can't call the methods of StringBuffer simultaneously.
-- Hence is less efficient than StringBuilder.	

StringBuilder 
-- non-synchronized i.e. not thread safe. It means two threads can call the methods of StringBuilder simultaneously.
-- Hence is more efficient than StringBuffer.

******************************************

We  run test on which one is faster and why
 */

public class compare {
	public static void main(String[] args) {

		long N = 77777771;

		{
			StringBuffer sb = new StringBuffer();
			long t = System.currentTimeMillis();
			for (long i = N; i-- > 0;) {
				sb.append("");
			}
			System.out.println("StringBuffer: " + (System.currentTimeMillis() - t));
      System.out.println(sb);
		}

		{
			StringBuilder sb = new StringBuilder();
			long t = System.currentTimeMillis();
			for (long i = N; i > 0; i--) {
				sb.append("");
			}
			System.out.println("StringBuilder: " + (System.currentTimeMillis() - t));
		}
	}	//builder is faster due to non-synchronised

}
