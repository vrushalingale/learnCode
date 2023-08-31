#include <stdio.h>
struct myStructure
{
    int myNum;
    char myLetter;
    char myString[30]; // String
};

int main()
{
    struct myStructure s1;
    s1.myNum =1;
    s1.myLetter='V';
    printf("First Num : %d\n",s1.myNum );
    printf("First Letter : %c\n",s1.myLetter );

    // Trying to assign a value to the string
    // s1.myString = "Some text";

    //Solution to Above Problem, Assign a value to the string using the strcpy function
    strcpy(s1.myString, "Vrushal");

    // Trying to print the value
    printf("First String Val: %s\n", s1.myString);

     // Create a structure variable and assign values to it
  struct myStructure s2 = {2, 'O', "Ovi"};

  // Print values
  printf("\n Num: %d Letter: %c Daughter Name: %s", s2.myNum, s2.myLetter, s2.myString);

    return 0;
}