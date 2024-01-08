#include<stdio.h>
#include<math.h>
#include<conio.h>

 
  int main()
  {
    // displays local variable op;
     int n1,n2,n3,n4,i,n;  // i for intial condition
     float b,r,average,sum = 0.0,num;   // average number , sum of all number
    char opt;

    printf("choose operator(+,*,/,-,c,t,a ) your require function\n");
    scanf("%c",&opt);

    if(opt == '+')
        {
        printf("you have selected is addition :\n "); 
        }
    else if( opt == '*' )
        {
        printf(" you have selected is multiplication : \n");
        }
    else if( opt == '/')
        {
        printf("you have selected is division : \n");
        }
    else if( opt == '-')
        {
        printf("you have selected is subtraction : \n");
        }
    else if(opt == 'c')
        {
        printf("you have selected is area of circle : \n");
        }
    else if(opt == 't')
        {
        printf("you have selected is ara of tri angle : \n");
        }
    else if(opt == 'a')
        {
        printf("you have selected is find average number : \n");
        }
    switch(opt)
  {

    case  '+':
       printf(" enter your first number :\n"); // this first number 
     scanf("%d",&n1);
       printf(" enter your second number :\n"); // this second number
     scanf("%d",&n2);
       n3 = n1+ n2 ;
       printf("addition is %d",n3);          //  +
       break;

    case  '*':
        printf(" enter your first number :\n"); // this first number 
     scanf("%d",&n1);
        printf(" enter your second number :\n"); // this second number
     scanf("%d",&n2);
       n3 = n1* n2 ;
        printf("mutiplication is %d",n3);      //*
       break;

    case  '/':
       printf(" enter your first number :\n"); // this first number 
     scanf("%d",&n1);
       printf(" enter your second number :\n"); // this second number
     scanf("%d",&n2);
     if(n2 == 0)
    {
      printf("\n division cannot possible be by zero. please enter another number");       // /
      scanf("%d",&n2);
    }
       n3 = n1/ n2 ;
       printf("division is %d",n3);  
       break;

    case  '-':
       printf(" enter your first number :\n"); // this first number 
     scanf("%d",&n1);
       printf(" enter your second number :\n"); // this second number
     scanf("%d",&n2);
     if(n2 == n1<n2)
      
    {
        printf("please enter valid number ");       //  -
        scanf("%d",&n2);
    }
       n3 = n1-n2 ;
     printf("subtraction is %d",n3);  
       break;

    case 'c':
           printf("enter your radious of circle :");
           scanf("%f",&r); 
        b = 3.14*r*r;
            printf("circle area is : %f",b);  
       break;
    
    case 't':
          printf(" enter your first number :\n"); // this first number 
       scanf("%d",&n1);
          printf(" enter your second number :\n"); // this second number
       scanf("%d",&n2);
       n3 = 0.5*n1*n2;
           printf(" area of tri angle is %d",n3 );
       break;
    
    case  'a':
         printf("enter the number of elements :\n");
       scanf("%d",&n);
         printf("enter %d number:\n ",n);
      
    for(i=1; i<=n;i++)
       {
         scanf("%f",&num);
         sum += num;
       }
           average = sum /n; // average number , sum of all number 
     printf("the average of the number is %.2f\n+",average);
     break;
    
    default:
     printf("something is wrong!! please check the option");
  }
   getch();
  
 }