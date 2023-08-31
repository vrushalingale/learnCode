/*
What is realloc ?
-   The realloc() function modifies the allocated memory size to a new size by the 
    malloc() and calloc() functions.
-   If enough space doesn't exist in the current block's memory to expand, a new block 
    is allocated for the total size of the reallocation, then copies the existing data 
    to the new block and frees the old block.
- Syntax:       realloc (pointer_name, number * sizeof(int));

What is free ?
-   The free() function releases the memory allocated by the malloc(), calloc(), realloc() functions.
-Syntax:        free (pointer_name);
*/

#include<stdio.h>
#include<string.h>
#include<stdlib.h>

void main()
{
    char *mem_alloc;
    //memory allocated dynamically
    mem_alloc = malloc( 20 * sizeof(char) );

    if( mem_alloc == NULL )
    {
        printf("Couldn't able to allocate requested memory\n");
    }
    else
    {
        strcpy( mem_alloc,"w3schools.in");
    }

    printf("Dynamically allocated memory content  : " \ "%s\n", mem_alloc );
    mem_alloc=realloc(mem_alloc,100*sizeof(char));

    if( mem_alloc == NULL )
    {
        printf("Couldn't able to allocate requested memory\n");
    }
    else
    {
        strcpy( mem_alloc,"space is extended upto 100 characters");
    }

    printf("Resized memory : %s\n", mem_alloc );
    free(mem_alloc);
}