#include <stdio.h>

float fatorial(float n) {
  float fat = 1;
  for (int x = 1; x <= n; x++) {
    fat *= x;
  }
  return fat;
}
int main(void) {
  float n, s = 0;  
  printf("digite um valor:\n");
  scanf("%f", &n);
  for (float i = 0; i <= n; i++) {
    s += 1 / fatorial(i);
  }
  printf("resultado: %f", s);
  return 0;
}
