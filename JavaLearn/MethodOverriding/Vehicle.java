package MethodOverriding;

public class Vehicle 
{
	void run()
	{
		System.out.println("Vehicle is running");
	}

}


/*When one task is performed by different ways i.e. known as polymorphism. 
 * For example: to convense the customer differently, to draw something e.g. shape or rectangle etc.
In java, we use method overloading and method overriding to achieve polymorphism.*/

/*If subclass (child class) has the same method as declared in the parent class, 
 * it is known as method overriding in java.
 
 In other words, If subclass provides the specific implementation of the method 
 that has been provided by one of its parent class, it is known as method overriding.

Usage of Java Method Overriding::

1.Method overriding is used to provide specific implementation of a method that is 
2.already provided by its super class.
3.Method overriding is used for runtime polymorphism

Rules for Java Method Overriding::

1.method must have same name as in the parent class
2.method must have same parameter as in the parent class.
3.must be IS-A relationship (inheritance).*/