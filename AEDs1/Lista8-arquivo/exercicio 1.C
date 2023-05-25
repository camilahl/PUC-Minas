#include <stdio.h>

int main(void) {
  FILE *pont_arq;
  pont_arq = fopen("arquivo.txt", "w");
  for (int i=0; i<10; i++){
   fprintf(pont_arq, "%d\n", i+1); 
  }
  printf("Arquivo gerado!");
  fclose(pont_arq);
  return 0;
}
