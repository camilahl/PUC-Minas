#include <stdio.h>

int main() {
  int valor=5, *valorPtr = &valor;
  printf("valor: %p\n", &valor);
  printf("&valorPtr: %p\n", &valorPtr);
  printf("*valorPtr: %d\n", *valorPtr);
  return 0;
}
//letra B esta certa porque o valor do ponteiro apota para o valor da variável
//letra C esta certa porque O valorPtr aponta para o endereço de valor da variável valor
