#include <stdio.h>

void main()
{
    int myNumbers[] = {25, 50, 75, 100};
    
    printf("Before Changing Value : %d", myNumbers[0]);
    myNumbers[0] = 33;

    printf("\nAfter Changing Value : %d", myNumbers[0]);

    int i;

    for (i = 0; i < 4; i++)
    {
        printf("\n%d", myNumbers[i]);
    }
}