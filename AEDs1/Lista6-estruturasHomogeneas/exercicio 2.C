#include <stdio.h>
#include <stdlib.h>//biblioteca para o rand dar certo

void notas(int v[10]) {
  for(int i=0; i < 10; i++) {
    v[i] = -1 * rand();
  }
}

int *vetor(int v[]){
  int x = 0;
  int v2[10];
  
  for(int i = 0; i < 10; i++){
    v2[i] = 0;
  }
  
  for(int i=0; i < 10; i++) {
    if (v[i] < 0){      
      v2[x] = v[i];
      printf("numero %d\n", v2[x]);
      x++;
    }
  }
  return v2;
}

void printaVetor(int* vet, int size){
  for(int i = 0; i < size; i++){
    printf("%d\n", vet[i]);
  }
}

int main(void) {
  int vetor_notas[10] = {1,2,-5,2,-1,0,-7,2,5,-9};
  int* vetorNotasNeg;
  //notas(vetor_notas);
  vetorNotasNeg = vetor(vetor_notas);
  printaVetor(vetorNotasNeg, 10);
  return 0;
}
