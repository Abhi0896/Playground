#include<stdio.h>
int sum_of_digit(int n);
int main()
{
  int num,sum;
  scanf("%d",&num);
  sum = sum_of_digit(num);
  if (sum>10)
    sum = sum_of_digit(sum);

  
  printf("%d",sum);
  return 0;
}

int sum_of_digit(int num)
{
  int sum=0,digit;
  while(num>0)
  {
    digit = num%10;
    num = num /10;
    sum =sum + digit;
  }
  return sum;
}