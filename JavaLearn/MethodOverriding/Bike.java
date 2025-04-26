package MethodOverriding;

public class Bike extends Vehicle 
{

	void run()
	{
		System.out.println("Bike is running safely");
	}
	
	public static void main(String[] args) 
	{
		Bike b = new Bike();
		b.run();
		
		Vehicle v= new Vehicle();
		v.run();
		
		Vehicle v1= new Bike();
		v1.run();
		
		
		/* Type mismatch: cannot convert from Vehicle to Bike
		 * 
		Bike b1= new Vehicle();
		
		*/
		

	}
/*we have defined the run method in the subclass as defined in the parent class but 
  it has some specific implementation. The name and parameter of the method is same 
  and there is IS-A relationship between the classes, so there is method overriding.
 */
}


/*When one task is performed by different ways i.e. known as polymorphism. 
 * For example: to convense the customer differently, to draw something e.g. shape or rectangle etc.
In java, we use method overloading and method overriding to achieve polymorphism.*/