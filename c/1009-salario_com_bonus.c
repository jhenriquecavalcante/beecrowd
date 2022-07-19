#include <stdio.h>

int main(){

  char nome[256];
  double salario, vendas, total;

  scanf("%s", &nome);
  scanf("%lf", &salario);
  scanf("%lf", &vendas);

  total = salario + (vendas * .15);

  printf("TOTAL = R$ %.2lf\n", total);

  return 0;
}
