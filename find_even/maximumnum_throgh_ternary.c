#include <stdio.h>

int main() {
    // Write C code here
    
     int x = 41,z=15,y=44;
     z = x > y && x>z ? printf("x is greater"):y>x&&y>z? printf("y is greater"):z;
     printf("%d",z);

    return 0;
}