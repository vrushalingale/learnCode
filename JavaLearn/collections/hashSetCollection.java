package collections;

import java.util.*;

public class hashSetCollection 
{
	public static void main(String args[])
	{  
		   
		  HashSet<String> al=new HashSet<String>();  
		  al.add("Ravi");  
		  al.add("Vijay");  
		  al.add("Ravi");  
		  al.add("Ajay");  
		  
		  Iterator<String> itr=al.iterator();  
	
		  while(itr.hasNext())
		  {  
			  System.out.println(itr.next());  
		  }  
		 } 

}
