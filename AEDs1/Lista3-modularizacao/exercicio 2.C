#include <stdio.h>

void media (int x) {
  int s=0, sa=0, nf; //s= soma, sa= salário, nf= número de filhos
  float media=0;
  for (int y=1; y<=x; y++) {
    printf("\nqual o salário do habitante %d?\n", y);
    scanf("%d", &sa);
    printf("\nqual o número de filhos do habitante? %d?\n", y);
    scanf("%d", &nf);
    s+=sa;
    media=(float)s/(float)y;
  }
  printf("\nA média dos salários é: %.2f\n", media);

}

int main(void) {
  int np; //np= número de pessoas
  printf("Digite o número de pessoas:\n");
  scanf("%d", &np);
  media(np);
  return 0;

  return 0;
}
