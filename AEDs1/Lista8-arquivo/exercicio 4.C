#include <stdio.h>

int main(void) {
  FILE *pont_arq;
  char t;
  int cont = 0;
  pont_arq = fopen("texto.txt", "r");
  while ((t = fgetc(pont_arq)) != EOF) { //le caracter por caracter
    printf("%c", t);
    if (t == '\n'){ //ta contando os espaços tipo, pq qnd da espaço tem uma nova linha
      cont++;
    }
  }
  printf("\nquantidade de linhas é: %d", cont);
  fclose(pont_arq);
  return 0;
  }
