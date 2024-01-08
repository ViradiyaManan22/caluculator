#include<stdio.h>
#include<conio.h>
int main()
{
    int a,b,c;
     printf("enter three value :");
     scanf("%d %d %d",&a,&b,&c);
    if(a<b && a<c)
     {
        printf("a is small %d",a);
     }
     else if(b<a && b<c)
      {
        printf("b is small %d",b);
      }
            else
        {
        printf("c is small %d",c);
        }
      getch();
}