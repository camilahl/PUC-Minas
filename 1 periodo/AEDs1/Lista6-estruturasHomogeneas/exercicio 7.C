#include <stdio.h>

int m = 4;
int n = 6;
int M[4][6];
int sum = 0;
int dif = 0;


void matriz_a(int M[4][6]) {
  printf("MATRIZ A\n");
  for (int i = 0; i < m; i++) {
    for (int j = 0; j < n; j++) {
      M[i][j] = rand() % 100;
      printf("%d ", M[i][j]);
    }
    printf("\n");
  }
}

void matriz_b(int M[4][6]) {
  printf("MATRIZ B\n");
  for (int i = 0; i < m; i++) {
    for (int j = 0; j < n; j++) {
      M[i][j] = rand() % 100;
      printf("%d ", M[i][j]);
    }
    printf("\n");
  }
}

void matriz_s(int M1[4][6], int M2[4][6], int M3[4][6]) {
  for (int i = 0; i < m; i++) {
    for (int j = 0; j < n; j++) {
      M3[i][j] = M1[i][j] + M2[i][j];
    }
  }
}

void matriz_d(int M1[4][6], int M2[4][6], int M3[4][6]) {
  dif = 0;
  for (int i = 0; i < m; i++) {
    for (int j = 0; j < n; j++) {
      M3[i][j] = M1[i][j] - M2[i][j];
    }
  }
}

int main(void) {
  int matrizA[4][6], matrizB[4][6], matrizS[4][6], matrizD[4][6];
  matriz_a(matrizA);
  printf("\n");
  matriz_b(matrizB);
  //soma
  matriz_s(matrizA, matrizB, matrizS);
  printf("\na soma das matrizes A e B é:\n");
  for (int i = 0; i < m; i++) {
    for (int j = 0; j < n; j++) {
      printf("%d ", matrizS[i][j]);
    }
    printf("\n");
  }

  //diferença
  matriz_d(matrizA, matrizB, matrizD);
  printf("\na diferença das matrizes A e B é:\n");
  for (int i = 0; i < m; i++) {
    for (int j = 0; j < n; j++) {
      printf("%d ", matrizD[i][j]);
    }
    printf("\n");
  }
  return 0;
}
