#include<stdio.h>
#include<conio.h>
int main()
{
    int a,b,c;
    printf("enter your three number :");
    scanf("%d %d %d",&a,&b,&c);
    if(a>b)
      {
        if(a>c)
       {
        printf("number  %d is grater than %d ",a,c);    
       }
      else
       {
        printf("number %d is greater than %d",c,a);
       }
      }
    else if(b>c)
      {
        printf("number  %d is grater than %d",b,c);
      }
      else
      {
        printf("number  %d is grater than %d",c,b);
      }
   getch();
}