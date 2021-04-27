package Intermediate.Aggregation;

public class intro2 {
	public static void main(String[] args) {

		School s = new School("Oxford", "London");
		Student a = new Student("shah", s);
		System.out.println(a);
	}
}
//
//
//
//



class School {
	String SchName;
	String SchCountry;

	public School(String schName, String schCountry) {
		SchName = schName;
		SchCountry = schCountry;
	}

	@Override
	public String toString() {
		return "School [SchName=" + SchName + ", SchCountry=" + SchCountry + "]";
	}
}

class Student {
	String name;
	// Student has-a relationship with School
	School school;

	public Student(String name, School school) {
		super();
		this.name = name;
		this.school = school;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", school=" + school + "]";
	}
}