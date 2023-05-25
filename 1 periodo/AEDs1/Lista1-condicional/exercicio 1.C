#include <stdio.h>

int main(void) {
  int A, B;
  printf("digite dois valores diferentes:\n");
  scanf("%d %d", &A, &B);
  if (A > B) {
    printf("o maior valor é: %d", A);
  } else if (A < B) {
    printf("o maior valor é: %d", B);
  }
  return 0;
}
