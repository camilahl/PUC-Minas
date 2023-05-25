#include <stdio.h>

int main(void) {
  FILE *arq;
  int n;
  int sum=0;
  arq = fopen("texto.txt", "w");
  printf("digite um número: ");
  scanf("%d", &n);
  for (int i=1; i<=n; i++) {
    if (n%i == 0) { //n%i >>> se o resto da divisao de n por i for = a 0 ai faz o if
      printf("divisor de %d: %d\n", n, i);
      sum += i;
    }
  }
  fprintf(arq, "%d", sum);
  fclose(arq);
  return 0;
}
