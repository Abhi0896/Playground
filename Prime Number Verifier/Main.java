// INCLUDE HEADER FILES NEEDED BY YOUR PROGRAM
// SOME LIBRARY FUNCTIONALITY MAY BE RESTRICTED
// DEFINE ANY FUNCTION NEEDED
// FUNCTION SIGNATURE BEGINS, THIS FUNCTION IS REQUIRED
#include <stdio.h>
// Main function
int main()
{
  int n,i,is_prime=0;
  scanf("%d",&n);
  for(i=2;i<=n/2;i++)
  {
    if(n%i == 0)
    {
      is_prime = 1;
      break;
    }
  }
  if(n==0)
    printf("neither");
  else if(is_prime == 1)
    printf("composite");
  else 
    printf("prime");
  
  
   return 0;
}