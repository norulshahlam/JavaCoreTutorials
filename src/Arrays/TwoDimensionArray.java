package Arrays;

//this demonstrates the use of 2d array
public class TwoDimensionArray 
{
	public static void main(String[] args) 
	{
    //how to define 2d array - 3 by 4
		int firstArray[][]={{1,2,3,4}, {2,2,3,4},{3,2,3,4}};
    //4 by 4
		int secondArray[][]={{10,20,30,40}, {100}, {3,6,9,12}, {99}};
		display(firstArray);
		System.out.println("second array");
		display(secondArray);
	}
	
	public static void display(int x[][])
	{
		for(int row=0; row<x.length; row++)
		{
			for(int column=0; column<x[row].length; column++)
			{
				System.out.print(x[row][column]+"\t");
			}
			System.out.println();
		}
	}
}
