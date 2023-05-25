#include <stdio.h>

int valores (int *valor1, int *valor2) {
  int troca;
  if (*valor1 > *valor2) {
    printf("\na primeira variável é: %d e a segunda variável é: %d\n", *valor1, *valor2);
  } else {
    printf("\na primeira variável é: %d e a segunda variável é: %d\n", *valor2, *valor1);
    troca = *valor1;
    *valor1 = *valor2;
    *valor2 = troca;
  }
}

int main(void) {
  int v1, v2;
  printf("digite dois valores: \n");
  scanf("%d\n %d", &v1, &v2);
  valores (&v1, &v2); //& = tá enviando o endereço da variável 1 e da 2, aí tudo que fizer com elas vai acontecer na variável do main
  printf("\nconteúdo da primeira variável: %d\n", v1);
  printf("conteúdo da segunda variável: %d\n", v2);
  return 0;
}
