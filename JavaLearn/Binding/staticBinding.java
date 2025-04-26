package Binding;

/*When type of the object is determined at compiled time(by the compiler), it is known as static binding.

If there is any private, final or static method in a class, there is static binding.*/

public class staticBinding 
{
	 private void eat()
	 {
		 System.out.println("dog is eating...");
	 }
	 
	  
	 public static void main(String args[])
	 {  
		 staticBinding d1=new staticBinding();  
		 d1.eat();  
	 }  

}

/*Binding : Connecting a method call to the method body is known as binding.
 * 1) variables have a type : Each variable has a type, it may be primitive and non-primitive.
		int data=30;  
		Here data variable is a type of int.

   2) References have a type

		class Dog{  
 		public static void main(String args[]){  
  		Dog d1;//Here d1 is a type of Dog  
 		}  
		}
		  
3) Objects have a type : An object is an instance of particular java class,but it is also an instance of its superclass.
		class Animal{}  
  
		class Dog extends Animal{  
 		public static void main(String args[]){  
  		Dog d1=new Dog();  
 		}  
		}  
		Here d1 is an instance of Dog class, but it is also an instance of Animal.

 * */


