#include <stdio.h>

int main(void) {
  int a=0, b=1, n=1, s, x; //declaração de variáveis
  printf("digite um número para obter a serie de fibonacci:\n");
  scanf("%d", &x);
  printf("\na sequência é:\n");
  printf("%d\n", a);
  s=1;
 while (n <= x){ //dá a sequência de números determinada pela quantidade do número digitado
  printf("%d\n", s);
  s=a+b;
  a=b;
  b=s;
   n++;
 }
return 0;
}
