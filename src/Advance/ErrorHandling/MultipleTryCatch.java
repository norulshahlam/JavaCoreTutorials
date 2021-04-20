package Advance.ErrorHandling;


/*
1. u can use multiplr try/catch to print out different types of error
2. with multiple catch, we can use diff catch to handle diff types of error when triggered. or use a generic method - (Exception e) 
*/
public class MultipleTryCatch {

	public static void main(String[] args) {

		try {
			int a = 1;
      // this gives arithmetic error
			int b = a / 0; 
		}

    // if it is arithmetic error, run this
		catch (ArithmeticException e) { 
			System.out.println(e+" - arithmetic error");
		}
      
    // this will run if no other specified error is available
     catch (Exception e) { 
			System.out.println(e+" - other type of exception");
		}
		finally{
      System.out.println(1);
    }
		try {
      // array is created of size 1
			int c[] = { 22 }; 
      // but here, an attempt to insert another value to array index size 44. so it gives out of bound error
			c[1] = 44; 
		
		}
      // if it is arrayoutofbound error, run this
		 catch (ArrayIndexOutOfBoundsException e) { 
				System.out.println(e+" - reached array size limit");
			} 
      // this will run if no other specified error is available
      catch (Exception e) { 
				System.out.println(e+" - other type of exception");
			}
      finally{
        System.out.println(2);
      }
		

		try {
      // length is 38
			String a = "the quick brown fox jumps over the box"; 
      // accessing at index 99 when length is only until 38 hence this gives error.
			char b = a.charAt(99); 
		
			System.out.println(a.length());
		}

    // we know what kind of exception it is so we will indicate in the catch
		catch (StringIndexOutOfBoundsException e) { 
			System.out.println(e+" - brown fox is only 38 char");
		}
    finally{
      System.out.println(3);
    }
	}
}
