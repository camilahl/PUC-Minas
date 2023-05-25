#include <stdio.h>

int main(void) {
  FILE *arq;
  FILE *alunos;
  int alu, ma, te;
  char l;
  arq = fopen("texto.txt", "w"); //escreve
  alunos = fopen("alunos.txt", "r"); //lê
  
  printf("digite a quantidade de alunos: ");
  scanf("%d", &alu);
  for (int i=0; i<alu; i++) {
    printf("\ndigite sua matrícula: ");
    scanf("%d", &ma);
    printf("digite seu telefone: ");
    scanf("%d", &te);
    fprintf(arq, "%d %d\n", ma, te);
  }
  
  printf("\nvocê quer ler um arquivo já existente que tem dados de alunos armazenados? ");
  scanf(" %c", &l);
  while (fscanf(alunos, "%d %d\n", &ma, &te) != EOF){
    if (l == ('s')) {
      printf ("%d %d\n", ma, te);
    } 
  }
  if (l != 's') {
      printf("erro\n");
  }
  
  fclose(alunos);
  fclose(arq);
  return 0;
}
