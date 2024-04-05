/*
Linier Search : In an unsorted array, the search operation can be performed by linear traversal 
                from the first element to the last element, i.e. Linier Search.
*/
#include<stdio.h>
int findElement(int arr[], int num, int key){
    int i;
    for(i=0; i< num; i++){
        if(arr[i]==key){
            return i;
        }
    }
    return -1;
}
int main(){

    int arr[10] = {4,2,1,5,3,9,8,7};
    int capacity = sizeof(arr)/sizeof(arr[0]);
    int keyToFind = 7;

    int position = findElement(arr,capacity,keyToFind);

    if(position == -1){
        printf("Element Not Found.");
    }
    else{
        printf("Element found at %d", position+1);
    }
    return 0;
}