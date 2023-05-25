#include <stdio.h>
int fatorial(int num) {
  int fat = 1;
  while (num >= 1) {
    fat *= num;
    num--;
  }
  printf("%d\n", fat);
  return (fat);
}

double serie(int n) {
  if (n == 1) {
    return (1);
  } else {
    return ((1.0 / fatorial(n)) + serie(n - 1));
  }
}

int main(void) {
  int N;
  double S;
  printf("Digite o número de termos: ");
  scanf("%d", &N);
  if (N <= 0) {
    printf("Valor inválido\n");
  } else {
    S = serie(N);
    printf("\nO valor da soma é: %.2lf\n", S);
  }
}
