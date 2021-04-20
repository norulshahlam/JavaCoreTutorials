package Intermediate.Aggregation;


/*
Association is relation between two separate classes which establishes through their Objects. Association can be one-to-one, one-to-many, many-to-one, many-to-many.

In Object-Oriented programming, an Object communicates to other Object to use functionality and services provided by that object. Composition and Aggregation are the two forms of association.

Aggregation is a term which is used to refer one way relationship between two objects. For example, Student class can have reference of Address class but vice versa does not make sense.

In Java, aggregation represents HAS-A relationship, which means when a class contains reference of another class known to have aggregation.

The HAS-A relationship is based on usage, rather than inheritance. In other words, class A has-a relationship with class B, if class A has a reference to an instance of class B.

here we created two classes Author and Book. Book class has relation with Author class by having its reference. Now we are able to get all the properties of both class.
*/

public class Book {
	String name;
	int price;
	// book has-a relationship with author
	Author auther;

	Book(String n, int p, Author auther) {
		this.name = n;
		this.price = p;
		this.auther = auther;
	}

	public static void main(String[] args) {
		Author auther = new Author("John", 42, "USA");
		Book b = new Book("Java for Begginer", 800, auther);
		System.out.println("Book Name: " + b.name);
		System.out.println("Book Price: " + b.price);
		System.out.println("------------Auther Details----------");
		System.out.println("Auther Name: " + b.auther.authorName);
		System.out.println("Auther Age: " + b.auther.age);
		System.out.println("Auther place: " + b.auther.place);
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
}

