/*Program to input values into an array and display them*/

#include<stdio.h>

int main(){
    int n;
    int arr[n], i;

    printf("Enter the size of Array: ");
    scanf("\n%d", n);

    for(int i =0;i<=n;i++){
        printf("\n Enter Values of array [%d]:", arr[i]);
        scanf("\n%d", &arr[i]);
    }
    printf("The array elements are : \n");
	for(int i=0; i<n; i++)
		printf("%d\t", arr[i]);
	printf("\n");
    return 0;
}