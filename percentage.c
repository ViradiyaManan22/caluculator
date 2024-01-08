#include<stdio.h>
#include<conio.h>
int main()
{
    int i,n,num,sum = 0;
    float average ,percentage;
    printf("enter total number of subject :");
    scanf("%d",&n);
    printf("your number of subject is %d \n",n);
    for(i = 0;i<n;i++)
      {
        printf("enter your subject marks %d :",i+1);
        scanf("%d",&num);
        sum += num; 
      }
    
        printf(" total sum your marks is %d \n",sum);
         average = (float)sum/n ;
        printf("average your marks is %f \n",average );
         percentage = average*100/100;
        printf("percentage your marks is %f \n",percentage);
        return 0 ;
        getch();
}