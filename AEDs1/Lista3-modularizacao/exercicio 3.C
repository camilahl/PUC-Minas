#include <stdio.h>

void crescente (int n1, int n2, int n3) { //variáveis
  if (n1>n2 && n2>n3){
    printf("os números em ordem crescente são: %d %d %d", n3, n2, n1);
  }else if (n1>n3  && n3>n2){
    printf("os números em ordem crescente são: %d %d %d", n2, n3, n1);
  }else if (n2>n1  && n1>n3){
    printf("os números em ordem crescente são: %d %d %d", n3, n1, n2);
  }else if (n2>n3  && n3>n1){
    printf("os números em ordem crescente são: %d %d %d", n1, n3, n2);
  }else if (n3>n1  && n1>n2){
    printf("os números em ordem crescente são: %d %d %d", n2, n1, n3);
  }else if (n3>n2 && n2>n1){
    printf("os números em ordem crescente são: %d %d %d", n1, n2, n3);
  }
}

int main(void){
  int a, b, c, n, rep=1; //a, b, c= variáveis dos conjuntos, n= número de conjuntos rep= repetições
  printf("digite quantos conjuntos você quer:\n"); //quantas vezes serão digitados os 3 números
  scanf("%d", &n);
  do{
    printf("\n\ndigite 3 números:\n");
    scanf("%d %d %d", &a, &b, &c);
    crescente (a, b, c);
    rep++;
  } while (rep <=n);
    printf("\nfim");
  return 0;
}
