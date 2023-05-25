#include <stdio.h>

void media (int me) { //me= média, c= conceito
  if (me <= 39){
    printf("seu conceito é F\n");
  } else if (me >= 40 && me <= 59){
    printf("seu conceito é E\n");
  } else if (me >= 60 && me <= 69){
    printf("seu conceito é D\n");
  } else if (me >= 70 && me <= 79){
    printf("seu conceito é C\n");
  } else if (me >= 80 && me <= 89){
    printf("seu conceito é B\n");
  } else if (me >= 90){
    printf("seu conceito é A\n");
  }
}

int main(void) {
  int na, m, rep=1; //na= número de alunos, m= média
  printf("digite o número de alunos:\n");
  scanf("%d", &na);
  do{
    printf("\ndigite sua média:\n");
    scanf("%d", &m);
    media(m);
    rep++;
  } while (rep<=na);
  printf("\nfim");
  return 0;
}
