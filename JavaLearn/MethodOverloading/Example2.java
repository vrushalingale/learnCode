package MethodOverloading;

public class Example2 
{
	void sum(int a,int b)
	{
		System.out.println(a+b);
	}  
	
	void sum(double a,double b)
	{
		System.out.println(a+b);
	}

	public static void main(String[] args) 
	{
		Example2 a = new Example2();
		a.sum(10, 10);
		a.sum(10.50, 20.25);
	}

}
