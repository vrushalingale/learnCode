#include<stdio.h>

void main(){

    int i=0;

    do{
        printf("Before Increment : %d \n",i);
        i=i+1;
        printf("\t\t\t After Increment : %d \n",i);
    }while (i<10);
}