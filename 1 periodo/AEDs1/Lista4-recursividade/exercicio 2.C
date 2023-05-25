#include <stdio.h>

int calculo(int num) {
  if (num / 10 == 0) {
    return (num);
  } else {
    return (num % 10 + calculo(num / 10));
  }
}

int main(void) {
  int N;
  printf("Digite um número: ");
  scanf("%d", &N);
  printf("\nA soma dos dígitos de %d é: %d\n", N, calculo(N));
}
