package Arrays;

public class arrayMultiD 
{

	public static void main(String[] args) 
	{
		// declaration Multi Dimensional array
		int a[][]=new int [3][3];
		
		// initialization
		a[0][0]=1;
		a[0][1]=2;
		a[0][2]=3;
		a[1][0]=4;
		a[1][1]=5;
		a[1][2]=6;
		a[2][0]=7;
		a[2][1]=8;
		a[2][2]=9;
		
		System.out.println("Multi Dimensional Array-1");
		
		for(int i=0;i<=(a.length-1);i++)
		{
			for(int j=0;j<=(a.length-1);j++)
			{
				System.out.print(a[i][j]+"\t");
			}
			System.out.println();
		
		}
		
		//declaration and initialization Multi Dimensional array
		int b[][]={{11,12,13},{14,15,16},{17,18,19}};
		
		System.out.println("\nMulti Dimensional Array-2");
		
		for(int i=0;i<=(b.length-1);i++)
		{
			for(int j=0;j<=(b.length-1);j++)
			{
				System.out.print(b[i][j]+"\t");
			}
			System.out.println();
		
		}
		
	}

}
