#include <stdio.h>

void valor (int num) {
  if (num > 0){
    printf("true: seu número é positivo\n");
  } else if (num < 0){
    printf("false: seu núemro é negativo\n");
  }
}

int main(void) {
  int qntd, n, rep=1; //qntd= quantidade de números, n= número
  printf("digite quantos números você quer testar: \n");
  scanf("%d", &qntd);
  do {
    printf("\ndigite um número: \n");
    scanf("%d", &n);
    valor(n);
  }while (rep<=n);
  printf("\nfim");
  return 0;
}
