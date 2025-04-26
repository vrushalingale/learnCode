package Aggregation;

/*If a class have an entity reference, it is known as Aggregation. Aggregation represents HAS-A relationship.
Consider a situation, Employee object contains many informations such as id, name, emailId etc. 
It contains one more object named address, which contains its own informations such as city,
state, country, zipcode etc. as given below.*/


public class Address 
{
	String city,state,country;  
	  
	public Address(String city, String state, String country)
	{  
	    this.city = city;  
	    this.state = state;  
	    this.country = country;  
	}  

}


