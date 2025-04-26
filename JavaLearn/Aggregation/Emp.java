package Aggregation;

//In such case, Employee has an entity reference address, so relationship is Employee HAS-A address.
//Here, Employee has an object of Address, address object contains its own informations such as city, state, country etc.

public class Emp 
{
	int id;  
	String name;  
	Address address;  
	  
	public Emp(int id, String name,Address address) {  
	    this.id = id;  
	    this.name = name;  
	    this.address=address;  
	}  
	  
	void display(){  
	System.out.println(id+" "+name);  
	System.out.println(address.city+" "+address.state+" "+address.country);  
	}  
	  
	public static void main(String[] args) 
	{  
		Address address1=new Address("gzb","UP","india");  
		Address address2=new Address("gno","UP","india");  
	  
		
		Emp e=new Emp(111,"varun",address1);  
		Emp e2=new Emp(112,"arun",address2);  
	      
		e.display();  
		e2.display();  
	      
	}  

}

/*If a class have an entity reference, it is known as Aggregation. Aggregation represents HAS-A relationship.
 * For Code Reusability use Aggregation
 * When use Aggregation?
 */

/*Code reuse is also best achieved by aggregation when there is no is-a relationship.
Inheritance should be used only if the relationship is-a is maintained throughout the lifetime of the objects involved;
otherwise, aggregation is the best choice.*/