package HelloWorld;

//Annonymous simply means nameless.An object that have no reference is known as annonymous object.

public class calAnnonymous 
{
	void fact(int  n)
	{  
		  int fact=1;  
		  for(int i=1;i<=n;i++)
		  {  
		   fact=fact*i;  
		  }  
		 System.out.println("factorial is "+fact);  
	}  
		  
		public static void main(String args[])
		{  
		 new calAnnonymous().fact(5);
		 //calling method with annonymous object  
		}  

}
