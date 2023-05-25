#include <stdio.h>

float media (int me) {
  int n=0, s=0, c=0; //n= nota, s= som, c= cont
  float media=0;
  for (int y=1; y<=me; y++) {
    printf("\ndigite sua nota: \n");
    scanf("%d", &n);
    if (n >=6) {
      s+=n;
      c++;
    }
  }
  me = s/c;
  return me;
}

int main(void) {
  int no=0; //no= número de alunos
  printf("quantos alunos são?\n");
  scanf("%d", &no);
  printf("\na média é: %.2f", media(no));
  return 0;
}
