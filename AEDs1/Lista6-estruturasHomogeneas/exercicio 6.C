#include <stdio.h>

int main(void) {
  int m = 4;
  int sum = 0;
  int M[4][4];
  for (int i = 0; i < m; i++) {
    for (int j = 0; j < m; j++) {
      M[i][j] = rand() % 100;
      printf("%d ", M[i][j]);
    }
    printf("\n"); // para pular linha e separar
  }
  printf("\n"); // para pular linha e separar
  for (int i = 0; i < m; i++) {
    for (int j = 0; j < m; j++) {
      if (i == j)
        printf("%d", M[i][j]);
      else
        printf(" ");
    }
    printf("\n");
  }
  for (int i = 0; i < m; i++) {
    for (int j = 0; j < m; j++) {
      if (i > j)
        sum += M[i][j];
    }
  }
  printf("\na soma dos elementos abaixo da diagonal pricipal é: %d", sum); //colocar fora do for, porqeu se colocar dentro repete umas mil vezes
}
