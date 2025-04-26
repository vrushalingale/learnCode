package Arrays;

public class arraySingleD 
{
	public static void main(String args[])
	{
		//declaration Single Dimensional Array 
		int a[] = new int[5];
	
		//initialization
		a[0]=1;  
		a[1]=2;  
		a[2]=3;  
		a[3]=4;  
		a[4]=5;
		
		System.out.println("Single Dimensional Array-1");
		
		//printing Array
				for (int i=0;i<=4;i++)
				{
					System.out.println(a[i]);
				}
		
		//Declaration and initialization Single D Arrays
		int b[] = {11,12,13,14,15};
		
		System.out.println("\nSingle Dimensional Array-2");
		
		//Printing using length function
		for (int i=0;i<=b.length-1;i++)
		{
			System.out.println(b[i]);
		}

				
	}
}
