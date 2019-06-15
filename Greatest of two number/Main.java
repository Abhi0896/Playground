#include<stdio.h>
int main()
{
  //Type your code here
  int num1,num2;
  scanf("%d",&num1);
  scanf("%d",&num2);
  if (num1 > num2)
    printf("num1 is the greatest");
  else if(num2 > num1)
    printf("num2 is the greatest");
  else
    printf("Both number equal");
  return 0;
}