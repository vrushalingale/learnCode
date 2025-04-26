package superKeyword;

/*
 * The super keyword in java is a reference variable that is used to refer immediate parent class object.
   Whenever you create the instance of subclass, an instance of parent class is created implicitly i.e. 
   referred by super reference variable.

Usage of java super Keyword:
	1. super is used to refer immediate parent class instance variable.
	2. super() is used to invoke immediate parent class constructor.
	3. super is used to invoke immediate parent class method.*/


public class Vehicle 
{
	int speed=50;  
	
	{
		System.out.println("Parent class constructor created by super");
	}
	
	void message()
	{
		System.out.println("Parent class method");
	}  
}  
	
