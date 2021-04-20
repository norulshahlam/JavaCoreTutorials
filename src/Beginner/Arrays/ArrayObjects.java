package Beginner.Arrays;

// Array can also store objects. 

public class ArrayObjects {

	public static void main(String[] args) {

		Student[] arr = new Student[2];
		arr[0] = new Student(01, "shah", 99);
		arr[1] = new Student(02, "farid", 30);

		for (int i = 0; i < arr.length; i++) {
			System.out.println("element at " + i + " is " + arr[i].Name + ", " + arr[i].RollNo + ", " + arr[i].Marks);
		}
	}
}
//another class 
class Student {
	int RollNo;
	String Name;
	int Marks;

	public Student(int rollNo, String name, int marks) {
		super();
		RollNo = rollNo;
		Name = name;
		Marks = marks;
	}
}