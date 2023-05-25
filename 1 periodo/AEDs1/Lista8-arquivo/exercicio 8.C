#include <stdio.h>
#include <stdlib.h>

int main(void) {
  FILE *relatorio;
  int carros;
  double ta=0;
  
  relatorio = fopen("resultado.txt","w");

  printf("digite o total de carros da locadora: ");
  scanf("%d", &carros);
  double aluguel[carros];
  for (int i=0; i<carros; i++){
    printf("digite o valor do aluguel do %d carro: ", i+1);
    scanf("%lf", &aluguel[i]);
    ta += aluguel[i];
  }
  
  double tc=carros;
    
  printf("\no faturamento anual da locadora é R$ %.2lf\n", (((tc/3)*ta)*12));
  fprintf(relatorio,"o faturamento anual da locadora é R$ %.2lf\n", (((tc/3)*ta)*12));

  printf("\no valor ganho com multas no mês é R$ %.2lf\n", (tc/30)*(0.2*ta));
  fprintf(relatorio,"o valor ganho com multas no mês é R$ %.2lf\n", (tc/30)*(0.2*ta));
  
  printf("\no valor gasto com manutenção de veículos é R$ %.2lf\n", (0.02*tc)*(600));
  fprintf(relatorio, "o valor gasto com manutenção de veículos é R$ %.2lf", (0.02*tc)*(600));

  fclose(relatorio);
  }
