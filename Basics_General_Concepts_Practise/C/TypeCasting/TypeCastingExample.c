#include <stdio.h>
int main()
{
    int a = 7;
    float b = 54.097;
    printf("WithOut Type Casting : %d \n", a);
    printf("After Type Casting : %f \n", (float)a);
    printf("WithOut Type Casting : %f \n", b);
    printf("After Type Casting : %d \n", (int)b);
    return 0;
}
