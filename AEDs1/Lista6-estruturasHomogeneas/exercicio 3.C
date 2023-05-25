#include <stdio.h>
#include <stdlib.h>

void vetor_x_y(int vx[10], int vy[10]) {
  for (int i=0; i<10; i++) {
    vx[i]=rand()%10;
    vy[i]=rand()%10;
  }
}

void novo_veto(int v1[10], int v2[10], int v3[10]) {
  for (int i=0; i<10; i++) {
    if (v3[i]%2!=0) {
      v3[i]=v1[i];
    } else {
      v3[i]=v2[i];
    }
  }
}

void imprimir_vetor (int vet[10]) {
  for (int i=0; i<10; i++) {
    printf("%d\n", vet[i]);
  }
}

int main(void) {
  int vetor1[10];
  int vetor2[10];
  int vetor3[10];
  vetor_x_y(vetor1, vetor2);
  novo_veto(vetor1, vetor2, vetor3);
  imprimir_vetor(vetor3);
  return 0;
}
