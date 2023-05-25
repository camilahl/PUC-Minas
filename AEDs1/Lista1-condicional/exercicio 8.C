#include <stdio.h>

int main(void) {
  char(op);
  float sa, ns;
  printf("digite o seu salário atual:\n");
  scanf("%f", &sa);
  scanf(" %c", &op);
  switch (op) {
  case 'A':
    sa = sa * 1.08;
    break;
  case 'B':
    sa = sa * 1.11;
    break;
  case 'C':
    if (sa <= 1000)
      sa = sa + 350;
    else
      sa = sa + 200;
    break;
  }
  printf("o seu slário atal será de %f", sa);
    return 0;
}
