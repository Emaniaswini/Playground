#include<stdio.h>
int main()
{
  int num1=6,num2=8;
  scanf("%d%d",&num1,&num2);
  if(num1>num2)
    printf("num1 is the greatest");
  else if(num2>num1)
    printf("num2 is the greatest");
  else
    printf("both are equal");//Type your code here
  return 0;
}