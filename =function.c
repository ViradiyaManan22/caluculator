#include <stdio.h>
#include<math.h>
void swap(int , int);
int main()
{
    int a,b,c;
    int p;
    printf("enter one number :\n");
    scanf("%d",&a);
    printf("enter two number : ");
    scanf("%d",&b);
    swap(a,b);
    printf("after value is %d\n%d",a,b);

}
void swap(int a,int b)
{
    int c;
    c = b;
    b=a;
    a=c;
  printf("this swapped value %d\n%d\n",a,b);
}
