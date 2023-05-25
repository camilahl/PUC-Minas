#include <stdio.h>

void calcCircunferencia (float R, float *compr, float *area) {
  float PI = 3.14;
  *compr = 2 * PI * R;
  *area = PI * (R*R);
}

int main(void) {
  float r, c, a; //r= raio, c= comprimento, a= area
  printf("digite o valor do raio: ");
  scanf("%f", &r);
  calcCircunferencia (r, &c, &a);
  printf("o valor do comprimento é: %.2f\n", c);
  printf("o valor da área é: %.2f\n", a);
  return 0;
}
