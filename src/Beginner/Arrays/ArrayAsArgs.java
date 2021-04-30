package Beginner.Arrays;
/*
How you manipulate the elements in array. here we try to add 5 to every element dynamically
 */
public class ArrayAsArgs 
{
	public static void main(String[] args) 
	{
		int age[]={10, 20, 30, 40, 50};
		for(int y : age)
		System.out.println("Value before change: " +y);
		
		change(age); //add 5 to every element
		
		for(int y : age)
		System.out.println("Value after change: " +y);
	}
	
	public static void change(int x[])
	{
		for(int i=0; i<x.length; i++)
		{
			x[i]+=5;
		}
	}
}
