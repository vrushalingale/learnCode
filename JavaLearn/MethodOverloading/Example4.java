package MethodOverloading;

public class Example4 
{
	void sum(int a,int b)
	{
		System.out.println("int arg method invoked");
	}  
	  void sum(long a,long b)
	  {
		  System.out.println("long arg method invoked");
	  }

	public static void main(String[] args) 
	{
		Example4 a =new Example4();
		a.sum(10, 10);
		
	}

}
