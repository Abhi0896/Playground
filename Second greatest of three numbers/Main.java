#include<stdio.h>
int main()
{
  int n1,n2,n3;
  scanf("%d",&n1);
  scanf("%d",&n2);
  scanf("%d",&n3);
  if (n1>n2)
  {
    if(n1<n3)
      printf("second greatest = %d",n1);
  }
  else if(n3<n2)
      printf("second greatest = %d",n3);
   else
      printf("second greatest = %d",n2);
  return 0;
}
      