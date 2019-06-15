#include<stdio.h>
int main()
{
  //Type your code here
  int n,t1=1,t2=2,sum;
  scanf("%d",&n);
  while(n-2 > 0)
  {
    sum = t1+t2;
    t1 = t2;
    t2 = sum;
    n--;
  }
  printf("%d",sum);
  return 0;
}