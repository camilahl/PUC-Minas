#include <stdio.h>

typedef struct Venda {
char nome[20];
int tel;
double preco;
} Venda;

int main(void) {
  int n = 4;
  double sum = 0, media = 0;
  Venda v[n];
  for (int i = 0; i < n; i++) {
    printf("\ndigite o nome da loja %d: ", i+1);
    scanf("%s", v[i].nome);
    printf("digite o telefone da loja: ");
    scanf("%d", &v[i].tel);
    printf("digite o preço de um eletrodoméstico: ");
    scanf("%lf", &v[i].preco);
    sum += v[i].preco;
  }
  media = sum/n;
  printf("\na média dos preços é: %.2lf\n", media);
  printf("\nlojas com preços abaixo da média:\n");
  for (int i = 0; i < n; i++) {
    if (v[i].preco < media) {
      printf("- %s, de telefone %d\n", v[i].nome, v[i].tel);
    }
  }
  return 0;
}
