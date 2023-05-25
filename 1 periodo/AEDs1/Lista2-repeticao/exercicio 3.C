#include <stdio.h>

int main(void) {
  int n, ten=0, d=0, c=0;
  do {
    printf("digite um número:\n");
    scanf("%d", &n);
    if ((n % 3 == 0) && (n % 9 == 0)) {
      ten++;
    } else if (n % 2 == 0) {
      d++;
    } else if (n % 5 == 0) {
      c++;
    } else {
      printf("número não divisível pelos valores: %d\n", n);
    }
  } while ((ten+d+c) < 10); //programa recebe só até 10 números
  printf("quantidade de números divisíveis por 3 e 9: %d\n", ten);
  printf("quantidade de números divisíveis por 2: %d\n", d);
  printf("quantidade de números divisíveis por 5: %d\n", c);
  return 0;
}
