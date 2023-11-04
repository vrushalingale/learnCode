#include <stdio.h>
#include <stdlib.h>

int main() {
    int *ptr;  // Declare a pointer to hold the memory address

    // Allocate memory for one integer (4 bytes on most systems)
    ptr = (int *)malloc(sizeof(int));

    // Check if memory allocation was successful
    if (ptr == NULL) {
        printf("Memory allocation failed!\n");
        return 1;  // Exit the program with an error code
    }

    // Now, you can use the allocated memory to store an integer value
    *ptr = 42;
    printf("The value stored in the allocated memory: %d\n", *ptr);

    // Don't forget to free the allocated memory when you're done using it
    free(ptr);

    return 0;  // Exit the program successfully
}
