package exceptionHandling;

public class finallyBlockExample 
{
	public static void main(String[] agrs)
	{
		try{
			int i=30/0;
			System.out.println(i);
		}
		catch(NullPointerException e)
		{
			System.out.println(e);
		}
		
//		catch(ArithmeticException e)
//		{
//			System.out.println(e);
//		}
		finally
		{
			System.out.println("Finally Block always executed");
		}
		System.out.println("Success");
	}

}
