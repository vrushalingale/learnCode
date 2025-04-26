package collections;

import java.util.*;



public class arrayListCollection 
{
	 public static void main(String args[]){  
		   
		//creating arraylist
		  ArrayList<String> al=new ArrayList<String>();
		  
		//adding object in arraylist
		  al.add("Ravi");  
		  al.add("Vijay");  
		  al.add("Ravi");  
		  al.add("Ajay");  
		  
		//getting Iterator from arraylist to traverse elements
		  Iterator itr=al.iterator();  
		  
		  while(itr.hasNext())
		  {  
			  System.out.println(itr.next());  
		  }  
		 }  

}
