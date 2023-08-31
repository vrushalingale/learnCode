/*What is malloc function ?:
-   malloc function allocates space in memory during the program's execution.
-   malloc function does not initialize the space in memory allocated during execution. It carries garbage value.
-   malloc function returns a null pointer if it couldn't allocate the requested amount of memory.
-   Syntax: 	malloc (number *sizeof(int));
*/
#include<stdio.h>
#include<string.h>
#include<stdlib.h>

void main()
{
    char *mem_alloc;
    //memory allocated dynamically
    mem_alloc = malloc( 15 * sizeof(char) );

    if(mem_alloc== NULL )
    {
        printf("Couldn't able to allocate requested memory\n");
    }
    else
    {
        strcpy( mem_alloc,"w3schools.in");
    }

    printf("Dynamically allocated memory content : %s\n", mem_alloc );
    printf("Dynamically allocated memory content's Memory Location : %p\n", &mem_alloc );
    free(mem_alloc);
}