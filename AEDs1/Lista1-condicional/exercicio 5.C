#include <stdio.h>

int main(void) {
  float vd, vp, ta, x, d;
  printf("digite o valor normal da diária\n");
  scanf("%f", &vd);
  vp = vd*0.75;
  printf("valor promocional será de %.2f\n", vp);
  ta = 0.8*75*vp;
  printf("valor total arrecadado e diária promocional será de %.2f\n", ta);
  x = 0.5*75*vd;
  printf("valor total arrecadado e diária normal será de %.2f\n", x);
  d = ta - x;
  printf("diferença entre os valores promocionais e normais %.2f", d);
  return 0;
}
