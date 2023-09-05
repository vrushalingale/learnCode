#include <stdio.h>

int main()
{
    /* 1-Dimensional Arrays : We can imagine a 1d array as a row, where elements are stored one after another.*/

    int arr[5] = {1, 2, 3, 4, 5};
    char arr[5] = {'O', 'V', 'I'};
    float arr[5] = {1.2, 3.4, 5.5};

    /* 2-Dimensional Arrays : can be considered as an array of arrays or as a matrix consisting of rows and columns.
                data_type array_name[sizeof_1st_dimension][sizeof_2nd_dimension];
    */
    int arr[5][6] = {{1, 2, 3, 4, 5}, {1, 2, 3, 4, 5, 6}};

    /* Multi / 3-Dimensional Arrays :  contains three dimensions, so it can be considered an array of two-dimensional arrays.
                data_type array_name[sizeof_1st_dimension][sizeof_2nd_dimension][sizeof_3rd_dimension];
    */
    int nums[2][3][3];

    return 0;
}
