#include <stdio.h>

typedef struct Data {
  int dia, mes;
} Data;

typedef struct Pessoa {
  Data dtnasc;
  char nome[20];
} Pessoa;

int main() {
  int n = 4;
  Pessoa p[n];
  for (int i = 0; i < n; i++) {
    printf("\ndigite seu nome: ");
    scanf("%s", p[i].nome);
    printf("digite seu dia de aniversário: ");
    scanf("%d", &p[i].dtnasc.dia);
    printf("digite seu mês de aniversário: ");
    scanf("%d", &p[i].dtnasc.mes);
  }
  for (int m = 1; m <= 12; m++) {
    printf("\naniversariantes do mês %d:\n", m);
    for (int i = 0; i < n; i++) {
      if (m == p[i].dtnasc.mes)
        printf("- %s, no dia %d\n", p[i].nome, p[i].dtnasc.dia);
    }
  }
}
