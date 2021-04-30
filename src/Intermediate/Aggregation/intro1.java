package Intermediate.Aggregation;

/*
Association is relation between two separate classes which establishes through their Objects. Association can be one-to-one, one-to-many, many-to-one, many-to-many.

In Object-Oriented programming, an Object communicates to other Object to use functionality and services provided by that object. Composition and Aggregation are the two forms of association. we will be discussing only on Aggregation.

Aggregation is a term which is used to refer one way (HAS-A) relationship between two objects. For example, Student class can have reference of Address class but vice versa does not make sense.

The HAS-A relationship is based on usage, rather than inheritance. For example, take two classes Author and Book. Book class has relation with Author class by having its reference. Now we are able to get all the properties of both class.
*/

public class intro1{
	public static void main(String[] args) {
		Author auther = new Author("John", 42, "USA");
		Book b = new Book("Java for Begginer", 800, auther);
System.out.println(b);
	}
}
//
//
//
//
//
//
//

class Book {
	String name;
	int price;
	// book has-a relationship with author
	Author auther;

	Book(String n, int p, Author auther) {
		this.name = n;
		this.price = p;
		this.auther = auther;
	}

	@Override
	public String toString() {
		return "{" +
			" name='" + name + "'" +
			", price='" + price + "'" +
			", auther='" +auther + "'" +
			"}";
	}

}
class Author {
	String authorName;
	int age;
	String place;

	// Author class constructor
	Author(String name, int age, String place) {
		this.authorName = name;
		this.age = age;
		this.place = place;
	}


	@Override
	public String toString() {
		return "{" +
			" authorName='" + authorName + "'" +
			", age='" + age + "'" +
			", place='" + place + "'" +
			"}";
	}

}

