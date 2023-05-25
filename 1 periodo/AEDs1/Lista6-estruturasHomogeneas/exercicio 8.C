#include <stdio.h>

int i;
int j;
int m = 10;

void matriz_princ(int M[10][10]) {
  for (i = 0; i < m; i++) {
    for (j = 0; j < m; j++) {
      M[i][j] = rand() % 10;
      printf("%d ", M[i][j]);
    }
    printf("\n");
  }
}

// linha 2 com a linha 8
void troca_1(int M[10][10]) {
  int troca;
  for (j = 0; j < m; j++) { 
    troca = M[1][j];
    M[1][j] = M[7][j];
    M[7][j] = troca;
  }
}

// coluna 4 com a coluna 10
void troca_2(int M[10][10]) {
  int troca;
  for (i = 0; i < m; i++) { 
    troca = M[i][3];
    M[i][3] = M[i][9];
    M[i][9] = troca;
  }
}

// a diagonal principal com a diagonal secundária
void troca_3(int M[10][10]) {
  int troca;
  for (i = 0; i < m; i++) {   // linha
    for (j = 0; j < m; j++) { // coluna
      troca = M[i][i];
      M[i][i] = M[i][j + 1 - i]; 
      M[i][j + 1 - i] = troca;
    }
  }
}

// a linha 5 com a coluna 10
void troca_4(int M[10][10]) {
  int troca;
  for (i = 0; i < m; i++) {   // linha
    for (j = 0; j < m; j++) { // coluna
      troca = M[4][j];
      M[4][j] = M[i][9];
      M[i][9] = troca;
    }
  }
}

void imprimir(int M[10][10]) {
  printf("\n");
  for (int i = 0; i < m; i++) {
    for (int j = 0; j < m; j++) {
      printf("%d ", M[i][j]);
    }
    printf("\n");
  }
}

int main(void) {
  int mp[10][10];
  printf("\nMATRIZ PRINCIPAL\n");
  matriz_princ(mp);
  printf("\nPRIMEIRA TROCA");
  troca_1(mp);
  imprimir(mp);
  printf("\nSEGUNDA TROCA");
  troca_2(mp);
  imprimir(mp);
  printf("\nTERCEIRA TROCA");
  troca_3(mp);
  imprimir(mp);
  printf("\nQUARTA TROCA");
  troca_4(mp);
  imprimir(mp);
  return 0;
}
