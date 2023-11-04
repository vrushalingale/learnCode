#include <stdio.h>

void Function1()
{
    printf("\nIn Function 1");
}

void Function2(int a)
{
    printf("\nIn Function 2 :  %d", a);
}
void main()
{
    int b = 7;
    Function1();
    Function2(b);
}