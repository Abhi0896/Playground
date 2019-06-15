#include <stdio.h>
int main()
{
  float radius,circumference;
  scanf("%f",&radius);
  circumference = 3.14 * radius*radius;
  printf("%0.2f",circumference);
  return 0;
}