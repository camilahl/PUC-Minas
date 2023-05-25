#include <stdio.h>

int main() {
  int x, y;
  printf("digite dois números:\n");
  scanf("%d %d", &x, &y);
  printf("x: %p\n", &x);
  printf("y: %p\n", &y);
  if (&x > &y){
    printf("o maior valor é: %p", &x); //p= qunado quer o endereço, &= para combinar com o endereço
  } else {
    printf("o maior valor é: %p", &y);
  }
  return 0;
}
