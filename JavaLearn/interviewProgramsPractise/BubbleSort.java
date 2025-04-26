package interviewProgramsPractise;

public class BubbleSort {
	public static void main(String args[]) {
		int a[] = {3,60,35,2,45,320,5};


		int array_length = a.length;
		int j,i,temp=0;

		System.out.print("Array before sort:");
		for(i=0;i<array_length;i++) {
			System.out.print(a[i]+" ");
		}


		for (i=0;i<array_length;i++) {
			for(j=1;j<=(array_length-1);j++) {
				if(a[j-1]>a[j]) {
					temp = a[j-1];
					a[j-1]=a[j];
					a[j]=temp;
				}
			}
		}

		System.out.print("\narray after sort is:");
		for(i=0;i<array_length;i++) {
			System.out.print(a[i]+" ");

		}
	}
}
