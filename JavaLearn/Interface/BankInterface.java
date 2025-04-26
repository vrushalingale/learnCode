package Interface;

public interface BankInterface 
{

	//methods declared (only method signature, no body)

	void seebalance();
	
	//method with return type.
	
	public String customerDetail(String naam);
	
}



/*What is an interface?
Interface looks like class but it is not a class. 
An interface can have methods and variables just like the class but the methods 
declared in interface are by-default abstract (only method signature, no body). 
Also, the variables declared in an interface are public, static & final by default. 
We will discuss these points in detail, later in this post.

Why use Java interface?

There are mainly three reasons to use interface. They are given below.
	1.It is used to achieve fully abstraction.
	2.By interface, we can support the functionality of multiple inheritance.
	3.It can be used to achieve loose coupling

What is the use of interfaces?
As mentioned above they are used for abstraction. 
Since methods in interfaces do not have body, they have to be implemented by the 
class before you can access them. The class that implements interface must implement
all the methods of that interface. Also, java programming language does not support 
multiple inheritance, using interfaces we can achieve this as a class can implement 
more than one interfaces, however it cannot extend more than one classes.

Declaration
Interfaces are declared by specifying a keyword “interface”. */