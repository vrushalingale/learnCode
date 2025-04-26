 package AbstractClass;

public abstract class AbstractClassExample {
	
	//abstract method declared......only declaration
	abstract void seebalance ();  // * It should be 10 * 10
	//abstract void seebalance1 ();
	
	//Method declaration and implementation
	 static void accountstatement ()
	  {
		  System.out.println("method abstract");
	  }

}

/*Hiding internal details and showing functionality is known as abstraction.
 
 *  A class that is declared using “abstract” keyword is known as abstract class. 
   
   It may or may not include abstract methods which means in abstract class you
   can have 
   1. concrete methods (methods with body) as well along with 
   2. abstract methods ( without an implementation, without braces, and followed by a
   semicolon). 
   An abstract class can not be instantiated, i.e 
   (you are not allowed to create object of Abstract class).
   
   Abstract class declaration Specifying abstract keyword before the class 
   during declaration, makes it abstract.*/
 