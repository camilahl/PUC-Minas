#include <stdio.h>

int main(void) {
  char(op);
  printf("digite um símbolo:\n");
  scanf(" %c", &op);
  switch (op) {
  case '>':
    printf("sinal de maior\n");
    break;
  case '<':
    printf("sinal de menor\n");
    break;
  case '=':
    printf("sinal de igual\n");
    break;
  default: printf("outro sinal");
  }
  return 0;
}
