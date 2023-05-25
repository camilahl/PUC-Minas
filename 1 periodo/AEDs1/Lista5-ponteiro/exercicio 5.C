#include <stdio.h>

int main(void) {
  int x = 1, *px = &x;    //ponteiro de x é igual ao endereço do x
  double y = 5, *py = &y; //ponteiro de y é igual ao endereço do y
  char c = 'f', *pc = &c;   //ponteiro de c é igual ao endereço do c

  printf("o valor inteiro de X é %d e seu endereço é: %p\n", x, &x); //%p é para mostrar o endereço e não o  valor em si do que ta lá dentro
  printf("o valor do ponteiro do inteiro é %d e seu endereço é: %p\n", *px, &px);
  printf("\no valor inteiro de Y é %.2lf e seu endereço é: %p\n", y, &y);
  printf("o valor do ponteiro do real é %.2lf e seu endereço é: %p\n", *py, &py);
  printf("\no valor inteiro de C é %c e seu endereço é: %p\n", c, &c);
  printf("o valor do ponteiro do caracter é %c e seu endereço é: %p\n", *pc, &pc);

  printf("\ndigite um novo valor de x:\n");
  scanf("%d", px); //px = vai mudar pelo próprio ponteiro, porque o que acontecer com ele, também acontece com o X
  printf("digite um novo valor de y:\n");
  scanf("%lf", py);
  printf("digite um novo valor de c:\n");
  scanf(" %c", pc);

  printf("\nNOVOS VALORES\n");
  printf("o novo valor inteiro de X é %d e seu novo endereço é: %p\n", x, &x); 
  printf("o novo valor do ponteiro do inteiro é %d e seu novo endereço é: %p\n", *px, &px);
  printf("\no novo valor inteiro de Y é %.2lf e seu novo endereço é: %p\n", y, &y);
  printf("o novo valor do ponteiro do real é %.2lf e seu novo endereço é: %p\n", *py, &py);
  printf("\no novo valor inteiro de C é %c e seu novo endereço é: %p\n", c, &c);
  printf("o novo valor do ponteiro do caracter é %c e seu novo endereço é: %p\n", *pc, &pc);
}
