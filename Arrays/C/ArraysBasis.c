#include <stdio.h>

void main()
{
    int myNumbers[] = {25, 50, 75, 100};

    printf("Array Before Changing Value :");
    for (int i = 0; i < 4; i++)
    {
        printf("\n%d", myNumbers[i]);
    }

    myNumbers[0] = 33;

    printf("\nArray After Changing Value : %d", myNumbers[0]);

    int i;

    for (i = 0; i < 4; i++)
    {
        printf("\n%d", myNumbers[i]);
    }
}