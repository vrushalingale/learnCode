package MethodOverloading;

public class MethodOverloadingExample 
{
	void sum(int a,int b)
	{
		System.out.println(a+b);
	}
	
	void sum(int a, int b, int c)
	{
		System.out.println(a+b+c);
	}
	
	
	//If you overload static method in java, it is the example of compile time polymorphism.
	 public static void minus(int a, int b)
	{
		System.out.println(a-b);
	}
	
	public static void main(String[] args)
	{
		MethodOverloadingExample a = new MethodOverloadingExample();
		a.sum(10, 20);
		a.sum(10, 20,30);
		
		//If you overload static method in java, it is the example of compile time polymorphism.
		a.minus(10, 20);
	}
	
	
}


/*When one task is performed by different ways i.e. known as polymorphism. 
 * For example: to convense the customer differently, to draw something e.g. shape or rectangle etc.
In java, we use method overloading and method overriding to achieve polymorphism.*/

/*If a class have multiple methods by same name but different parameters, it is known as Method Overloading.

If we have to perform only one operation, having same name of the methods increases the readability of the program.

Suppose you have to perform addition of the given numbers but there can be any number of arguments, 
if you write the method such as a(int,int) for two parameters, and b(int,int,int) for three parameters then 
it may be difficult for you as well as other programmers to understand the behaviour of the method because 
its name differs. So, we perform method overloading to figure out the program quickly.

java method overloading
Advantage of method overloading?

Method overloading increases the readability of the program.

Different ways to overload the method

There are two ways to overload the method in java
By changing number of arguments
By changing the data type*/




