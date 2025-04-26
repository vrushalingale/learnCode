package Interface;

public class InterfaceExecute 
{

	public static void main(String[] args) 
	{
		Customer c1 = new Customer();
		
		c1.customerDetail("Vrushal");
		c1.seebalance();

	}
}

/*An interface in java is a blueprint of a class. It has static constants and abstract methods only.

The interface in java is a mechanism to achieve fully abstraction. 
There can be only abstract methods in the java interface not method body.
It is used to achieve fully abstraction and multiple inheritance in Java.

Java Interface also represents IS-A relationship.
It cannot be instantiated just like abstract class.*/