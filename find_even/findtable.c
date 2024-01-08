#include<stdio.h>
#include<conio.h>
int main()
{
    int i,n;
    printf("enter your find choice table number : ");
    scanf("%d",&n);
    printf("your table  \n");
    for(i = 1 ; i<=10; i++)
      {
        
        printf("%d * %d =  %d\n",n, i,n*i);
      }
 getch();
}