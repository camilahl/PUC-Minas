#include <stdio.h>

int main(void) {
  FILE *pont_arq;
  char t;
  int cont = 0;
  pont_arq = fopen("texto.txt", "r");
  while ((t = fgetc(pont_arq)) != EOF) { //le caracter por caracter
    printf("%c", t);
    if (t == 'a') {
      cont ++;
    }
  }
  printf("\nquantidade de A: %d", cont);
  fclose(pont_arq);
  return 0;
}
