#include<stdio.h>
#include<conio.h>
int main()
{
    float percentage,rate,time ,simple_interst;
    printf("enter percentage :");
    scanf("%f",&percentage);
    printf("enter rate :");
    scanf("%f",&rate);
    printf("enter time :");
    scanf("%f",&time);
    printf("your simple interst is %f :",simple_interst = percentage*rate*time/100);
    getch();
}