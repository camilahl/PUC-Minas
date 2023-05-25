#include <stdio.h>

int main(void) {
  int n, neg = 0, pos = 0, z = 0, total, pn, pp, pz; //neg= negativo, pos= positivo, z=zero, pn= percentual dos valores negativos, pp= percentual dos valores positivos, pz= percentual dos valores zeros
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
  } while (n != 123);
  total = pos + neg + z;
  pn= (float)(neg*100)/total;
  pp= (float)(pos*100)/total;
  pz= (float)(z*100)/total;
  printf("percentual de números zeros: %d\n", pz);
  printf("percentual de números positivos: %d\n", pp);
  printf("percentual de números negativos: %d\n", pn);
  return 0;
}
