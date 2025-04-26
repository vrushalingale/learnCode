package finalKeyword;

public class case2 
{
	final void run()
	{
		System.out.println("running");
	}  
}  
	     
	class Honda extends case2
	{ 
		//If you make any method as final, you cannot override it.
		//Uncomment it and check the error
	 //  void run()
	   {
		   System.out.println("running safely with 100kmph");
	   }  
	     
	   public static void main(String args[])
	   {  
		   Honda honda= new Honda();  
		   honda.run();  
	   }  

}
	
	/*Java final method

If you make any method as final, you cannot override it.

Yes, final method is inherited but you cannot override it.
*/
