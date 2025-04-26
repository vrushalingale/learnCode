package Arrays;

public class arrayADD 
{

	public static void main(String[] args) 
	{
		int a[][]={{1,2,3},{4,5,6},{7,8,9}};
		int b[][]={{1,2,3},{4,5,6},{7,8,9}};
		int c[][] = new int[3][3];
		
		System.out.println("\nMulti Dimensional Array ADD");
		
		for(int i=0;i<=(a.length-1);i++)
		{
			for(int j=0;j<=(b.length-1);j++)
			{
				c[i][j]=a[i][j]+b[i][j];
				System.out.print(c[i][j]+"\t");
			}
			System.out.println();
		}
	}

}
