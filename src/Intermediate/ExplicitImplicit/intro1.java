package Intermediate.ExplicitImplicit;

/*
Explicit means somthing is done by the programmer
Implicit means that its done by the complier.
for example if you dont explicitly create a constructor for your class the compiler will implicitly create default one for you.

For Example:
Java will provide us default constructor implicitly.Even if the programmer didn't write code for constructor.

Explicit is opposite to this , ie. programmer has to write .
*/
public class intro1  
{        int age;
	public intro1(int age)  
	{    	this.age=age;
		System.out.println("I am const with 1 int arg");    	 
	}           
	public static void main(String[] args)  
	{ 
    /* when obj is created, jvm implicitly call the constructor at runtime */        
		intro1 d = new intro1(33);    
    /* when we call the obj ourself, we are explicitly calling it */
    System.out.println(d.age);
	} 
} 
/*
Explicit – that is passed by specifying the parameter in the parenthesis of a method call
Implicit – that is passed by specifying an object variable (object reference) before the name of a method.
 */