#include <stdio.h>

int main(void) {
  int A, B, X;
  printf("digite dois valores:\n");
  scanf("%d %d", &A, &B);
  X = A + B;
  if (X >= 10)
    X = X + 5;
  else
    X = X + 7;
  printf("resultado: %d", X);
  return 0;
}
