#include <stdio.h>

int m = 5;
int M[5][5];
int sum = 0;

float soma_linha_4(float M[5][5]) {
  sum = 0;
  for (int j = 0; j < m; j++) {
    sum += M[3][j]; //como é 0, 1, 2, 3, 4 ai tem que colocar 3 e nao 4, porque tem q contar o 0 tambem
  }
  return sum;
}

float soma_coluna_2(float M[5][5]) {
  sum = 0;
  for (int i = 0; i < m; i++) {
    sum += M[1][i]; //como é 0, 1, 2, ai tem que colocar 1 e nao 2, porque tem q contar o 0 tambem
  }
  return sum;
}

float soma_diagonal_principal(float M[5][5]) {
  sum = 0;
  for (int i = 0; i < m; i++) {
    for (int j = 0; j < m; j++) {
      if (i == j)
        sum += M[i][j];
    }
  }
  return sum;
}

float soma_diagonal_secundaria(float M[5][5]) {
  sum = 0;
  for (int i = 0; i < m; i++) {
    for (int j = 0; j < m; j++) {
      if (i + j == 4)
        sum += M[i][j];
    }
  }
  return sum;
}

float soma_todos_os_elemenos(float M[5][5]) {
  sum = 0;
  for (int i = 0; i < m; i++) {
    for (int j = 0; j < m; j++) {
      sum += M[i][j];
    }
  }
  return sum;
}

int main(void) {
  float M[m][m];
  float somali, somacol, somadiag, somadiagsec, somatudo;
  for (int i = 0; i < m; i++) {
    for (int j = 0; j < m; j++) {
      M[i][j] = rand() % 10;
      printf("%.0f ", M[i][j]);
    }
    printf("\n");
  }
  float soma = soma_linha_4(M);
  printf("\na soma da linha 4 é: %.0f\n", soma);
  soma = soma_coluna_2(M);
  printf("a soma da coluna 2 é: %.0f\n", soma);
  soma = soma_diagonal_principal(M);
  printf("a soma da diagonal princial é: %.0f\n", soma);
  soma = soma_diagonal_secundaria(M);
  printf("a soma da diagonal secundária é: %.0f\n", soma);
  soma = soma_todos_os_elemenos(M);
  printf("a soma de todos os elementos é: %.0f\n", soma);
  return 0;
}
