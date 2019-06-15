#include <stdio.h>
int main() {
	int n, sum = 0;
    int fact, r, num;
    scanf("%d",&n);
    num = n;
    while(n>0){
       r = n%10;
      fact = r;
      while(r!=1)
      {
        --r;
        fact = fact * r;
      }
      sum = sum + fact;
      n = n/10;
    }
  if(sum == num)
    printf("Yes");
  else
    printf("No");
return 0;
}