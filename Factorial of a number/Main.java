#include <stdio.h>
int main() {
  int n , fact;
  scanf("%d", &n);
  fact = n;
  while(n!=1)
  {
    --n;
    fact = fact * n;
  }
  printf("%d",fact);
	//Type your code
	return 0;
}