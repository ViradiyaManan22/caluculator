#include<stdio.h>
#include<conio.h>
int main()
{
    int dividend,divisor,remainder,quotient;
    printf("enter the your dividend number :");
    scanf("%d",&dividend);
    printf("enter your divisor :");
    scanf("%d",&divisor);
    quotient = dividend/divisor;
    printf("your quotient answer is %d \n",quotient);
    remainder = dividend - divisor*quotient;
    printf("your remainder is %d",remainder);
    getch();

}












