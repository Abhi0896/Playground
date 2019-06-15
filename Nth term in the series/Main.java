#include<stdio.h>
int nth_term(int n);
int main()
{
  // Type your code here
  int n,n_term;
  scanf("%d",&n);
  if(n%2==1)
  {
    n_term = nth_term(n/2);
  }
  else
  {
    n_term = nth_term(n/2-1);
    n_term = n_term/2;
  }
  printf("%d",n_term);
}

int nth_term(int n)
{
  return n*2;
}
