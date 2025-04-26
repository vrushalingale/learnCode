package ConstructorExample;

public class one 
{
	int id;
	String name;
	
	void display()
	{
		System.out.println("id "+id +" "+ "name "+name);		
	}
	
	public one()
	{
		System.out.println("Its Default constructor..");
	}
	
	public one(int a, int b)
	{
		System.out.println("\nIts Parameterised Constructor..");
		System.out.println("a"+a +" "+ "b"+b);
	}
	

	public static void main(String[] args) 
	{
		one o = new one();
		o.display();
		
		one o1=	new one(4,5);

	}

}
