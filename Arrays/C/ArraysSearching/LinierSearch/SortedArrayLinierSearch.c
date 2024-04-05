#include <stdio.h>
 
// Function to implement search operation
int findElement(int arr[], int n, int key)
{
    int i;
    for (i = 0; i < n; i++)
        if (arr[i] == key)
            return i;
 
    // If the key is not found
    return -1;
}
 
// Driver's Code
int main()
{
    int arr[] = { 5, 6, 7, 8, 9, 10 };
    int n = sizeof(arr) / sizeof(arr[0]);
 
    // Using a last element as search element
    int key = 7;
 
    // Function call
    int position = findElement(arr, n, key);
 
    if (position == -1)
        printf("Element not found");
    else
        printf("Element Found at Position: %d",
               position + 1);
 
    return 0;
}