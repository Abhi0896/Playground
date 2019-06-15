#include <stdio.h>
#include<math.h>
int main() {
  int n;
  int r, sum = 0, count = 0, num;
    scanf("%d",&n);
  num = n;
  while(n>0)
  {
    r = n%10;
    n = n/10;
    count++;
  }
  n = num;
  while(num>0)
  {
    r = num%10;
    sum = sum + pow(r,count);
    num = num/10;
  }
  if(sum == n)
    printf("Armstrong Number");
  else
    printf("Not an Armstrong Number");
	//Type your code
	return 0;
}