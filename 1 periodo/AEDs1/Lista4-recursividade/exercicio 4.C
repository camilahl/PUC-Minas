#include <stdio.h>

int resto_divisao(int num, int deno) {
  if (num / deno == 0) {
    return (num);
  } else {
    return (resto_divisao(num - deno, deno));
  }
}

int main(void) {
  int n, d;
  printf("digite o numerador e o denominador: \n");
  scanf("%d %d", &n, &d);
  printf("o resto da divisão é: %d", resto_divisao(n, d));
  return 0;
}
