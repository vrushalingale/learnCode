package interviewProgramsPractise;

import java.util.Scanner;

public class PalindromExample {
	
	public void checkPalindromString(String str) {
		String rev="";
		
		int length = str.length();
		 
	      for ( int i = length - 1; i >= 0; i-- )
	         rev = rev + str.charAt(i);
	 
	      if (str.equals(rev))
	         System.out.println(str+" is a palindrome");
	      else
	         System.out.println(str+" is not a palindrome");
	}

	public void checkPalindromInteger(int a) {
		 int r,sum=0,temp;    
		  int n=a;//It is the number variable to be checked for palindrome  
		  
		  temp=n;    
		  while(n>0){    
		   r=n%10;  //getting remainder  
		   sum=(sum*10)+r;    
		   n=n/10;    
		  }    
		  if(temp==sum)    
		   System.out.println("palindrome number ");    
		  else    
		   System.out.println("not palindrome");    
	}
	
	 public static void main(String args[])
	   {
		 PalindromExample p = new PalindromExample();
		 
	      String str, rev = "";
	      int a;
	      
//	      Scanner sc = new Scanner(System.in);
//	 
//	      System.out.println("Enter a string:");
//	      str = sc.nextLine();
	     
	      p.checkPalindromString("MADAM");
	      p.checkPalindromInteger(454); 
	      
//	      System.out.println("Enter a integer nmber:");
//	      a = sc.nextInt();
	     
	      
	     
	 
	   }
	
}
