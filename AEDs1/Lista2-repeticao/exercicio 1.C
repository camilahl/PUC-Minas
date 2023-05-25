#include <stdio.h>

int main(void) {
  int n, neg = 0, pos = 0, z = 0;
  do {
    printf("digite um número:\n");
    scanf("%d", &n);
    if (n < 0) {
      neg++;
    } else if (n > 0) {
      pos++;
    } else if (n == 0) {
      z++;
    }
  } while (n != 123); //se escrever 123 o código para de contar os números e vai para os printf com a resposta
  printf("quantidade de valores zeros: %d\n", z);
  printf("quantidade de valores positivos: %d\n", pos);
  printf("quantidade de valores negativos: %d\n", neg);
  return 0;
}
