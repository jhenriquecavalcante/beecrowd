#include <stdio.h>

int main(){

  int number, hours;
  double paid, salary;

  scanf("%d", &number);
  scanf("%d", &hours);
  scanf("%lf", &paid);

  salary = hours * paid;

  printf("NUMBER = %d\n", number);
  printf("SALARY = U$ %.2lf\n", salary);

  return 0;
}
