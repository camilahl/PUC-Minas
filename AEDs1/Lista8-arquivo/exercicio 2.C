#include <stdio.h>

int main(void) {
  FILE *pont_arq;
  char t[100];
  pont_arq = fopen("arquivo.txt", "w");
  printf("digite um texto: ");
  scanf("%s", t);
  fprintf(pont_arq, "%s", t);
  fclose(pont_arq);
  return 0;
}
