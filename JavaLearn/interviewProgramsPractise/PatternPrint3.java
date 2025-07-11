package interviewProgramsPractise;

public class PatternPrint3 {

	/*
	 * 			*
	 * 		   **
	 * 		  ***
	 * 		 ****
	 * 		*****
	 * 	   ******
	 * 
	 * */

	public static void main(String[] args) {

		int n=8;
		
		int i, j;
		
		for(i=0; i<n; i++) //outer loop for number of rows(n) 
		{ 
			for(j=2*(n-i); j>=0; j--) // inner loop for spaces 
			{           
				System.out.print(" "); // printing space
			} 
			for(j=0; j<=i; j++) //  inner loop for columns
			{       
				System.out.print("* "); // print star
			}           
			System.out.println(); // ending line after each row
		} 
	} 


} 




