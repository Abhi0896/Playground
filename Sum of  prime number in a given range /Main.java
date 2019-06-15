#include<stdio.h>
int main()
{
  //Type youe code here
  int n,i,j,sum=0,is_prime=0;
  scanf("%d",&n);
  for(i=2;i<=n;i++)
  {
    is_prime=0;
    for(j=2;j<=i/2;j++)
    {
      if(i%j==0)
      {
        is_prime = 1;
        break;
      }
    }
      if (is_prime == 0)
        sum+=i;
      else continue;
    
  }
  printf("%d",sum);
      return 0;
}