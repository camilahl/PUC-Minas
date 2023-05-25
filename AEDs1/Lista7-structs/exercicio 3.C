#include <stdio.h>
#include <string.h>

typedef struct Acesso {
int cod;
//char email;
int horas;
char pg;
float pagar;
} Acesso;

int main(void) {
  int m = 2;
  double extra, valor;
  double vf;
  int s, n;
  double pge;
  Acesso a[m];
  for (int i = 0; i < m; i++) {
    printf("\nCLIENTE %d:\ndigite seu código de cliente: ", i+1);
    scanf("%d", &a[i].cod);
    printf("digite a quantidade de horas de acesso: ");
    scanf("%d", &a[i].horas);
    printf("você quer uma página? digite s- sim ou n-não: ");
    scanf(" %c", &a[i].pg);
  }
  for (int i = 0; i < m; i++) {
    a[i].pagar = 0;
    if (a[i].horas <= 20) {
      a[i].pagar = 35.00;
      printf("\no preço a pagar pelo cliente %d é: R$35.00", i+1);
    } else if (a[i].horas > 20) {
      extra = a[i].horas - 20;
      valor = extra * 2.50;
      a[i].pagar = 35.00 + valor;
      printf("\no preço a pagar pelo cliente %d é: R$%.2lf", i+1, a[i].pagar);
    }
  }
  for (int i = 0; i < m; i++) {
    if (a[i].pg == 's') { 
      pge = a[i].pagar + 40;
    } else {
      pge = a[i].pagar;
    }
    printf("\no NOVO preço a pagar após a adição da página pelo cliente %d é: R$%.2lf", i+1, pge);
  } 
  return 0;
}
