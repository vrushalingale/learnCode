package exceptionHandling;

/*Syntax of java try-catch

try{  
//code that may throw exception  
}catch(Exception_class_Name ref){} */

public class programTryCatch 
{
	  	  public static void main(String args[])
	  	  {  
	  		  try
	  		  {  
	  			  int data=50/0;  
	  		  }
	  		  catch(ArithmeticException e)
	  		  {
	  			  System.out.println(e);
	  		  }  
		   
	  		  System.out.println("rest of the code...");  
	  	  }  
}