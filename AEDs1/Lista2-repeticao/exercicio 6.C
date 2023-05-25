#include <stdio.h>

int main(void) {
  float i, n, s = 0; //declaração de variáveis
  printf("digite um valor:\n");
  scanf("%f", &n);
  for (float i = 1; i <= n; i++) {
    s += 1 /i;
    printf("1/%.f %.2f \n", i, s);
  }
  printf("resultado: %f", s);
  return 0;
}
