#include <stdio.h>

float formula (int x) {
  float soma=0, result=0;
  for (int y=1; y<=x; y++) {
    soma=((y*y)+1.0)/(y+3.0);
    result+=soma;
  }
  return result;
}

int main(void) {
  int x;
  printf("Digite um valor inteiro e positivo para X\n");
  scanf("%d", &x);
  formula(x);
  printf("\nsoma = %.4f", formula(x));
  return 0;
}
