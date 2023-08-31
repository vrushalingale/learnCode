/* What is Calloc?
    The calloc() and malloc() function is similar. 
    But calloc() allocates memory for zero-initializes. 
    However, malloc() does not.
    Syntx:      calloc()	calloc (number, sizeof(int));
*/

#include<stdio.h>
#include<string.h>
#include<stdlib.h>

void main()
{
    char *mem_alloc;
    //memory allocated dynamically
    mem_alloc = calloc( 15, sizeof(char) );

    if( mem_alloc== NULL )
    {
        printf("Couldn't able to allocate requested memory\n");
    }
    else
    {
        strcpy( mem_alloc,"w3schools.in");
    }

    printf("Dynamically allocated memory content : %s\n", mem_alloc );
    printf("Dynamically allocated memory content's pointer : %p\n", &mem_alloc );
    free(mem_alloc);
}