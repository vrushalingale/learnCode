package interviewProgramsPractise;

public class PatternPrintPascalLeft {
	/*

	 *
	 **
	 ***
	 ****
	 *****
	 ****
	 ***
	 **
	 *

	 * */
	public static void main(String[] args) {

		int rows =4;        
		for (int i= 1; i<= rows ; i++)
		{
			for (int j=i; j <rows ;j++)            
			{
				System.out.print(" ");
			}
			for (int k=1; k<=i;k++) { 
				System.out.print("*"); 
			} System.out.println(""); 
		} 
		for (int i=rows; i>=1; i--)
		{
			for(int j=i; j<=rows;j++)
			{
				System.out.print(" ");
			}
			for(int k=1; k<i ;k++) 
			{
				System.out.print("*");
			}
			System.out.println("");

		}

	}

}
