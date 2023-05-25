#include <stdio.h>

int main(void) {
  float x, a, b;
  printf("digite os coeficiente: \n");
  scanf("%f %f", &a, &b);
  if(a!=0){
    x=-b/a;
    printf("raiz %.2f", x);
  }else{
    printf("equação inválida");
  }
  return 0;
}
