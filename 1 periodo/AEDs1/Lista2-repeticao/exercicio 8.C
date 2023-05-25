#include <stdio.h>

int main(void) {
  int a=0, b=1, n, s;
  printf("digite um número para obter a serie de fibonacci:\n");
  scanf("%d", &n);
  printf("\na sequência é:\n");
  printf("%d\n", a);
  s=1;
 while (s<n){ //dá a sequência de números até o número digitado
  printf("%d\n", s);
  s=a+b;
  a=b;
  b=s;
 }
return 0;
}
