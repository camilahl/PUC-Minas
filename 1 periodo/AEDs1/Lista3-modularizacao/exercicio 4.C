#include <stdio.h>

void triangulo (int n1, int n2, int n3) { //n1= lado 1 do triangulo,  n2= lado 2 do triangulo, n3= lado 3 do triangulo
  if ((n1 < (n2+n3)) && (n2 < (n1+n3)) && (n3 < (n1+n2))){
    if (n1==n2 && n2==n3){
      printf("isso é um triângulo equilátero");
    } else if (n1==n2 && n1!=n3){
      printf("isso é um triângulo isósceles");
    } else if (n1==n3 && n3!=n2){
      printf("isso é um triângulo isósceles");
    } else if (n2==n3 && n3!=n1){
      printf("isso é um triângulo isósceles");
    } else if (n1!=n2 && n1!=n3 && n2!=n3){
      printf("isso é um triângulo escaleno");
    } else{
      printf("isso é um triângulo inválido");
    }
  }
}

int main (void) {
  int l1, l2, l3, n, rep=1; //t1= lado 1, t2= lado 2, t3= lado 3, n= números de triângulos que vai testar
  printf("quantos triângulos você gostaria de testar:\n");
  scanf("%d", &n);
  do{
    printf("\n\ndigite os valores dos lados do triângulo:\n");
    scanf("%d %d %d", &l1, &l2, &l3);
    triangulo (l1, l2, l3);
    rep++;
  }while (rep<=n);
    printf("\n\nfim");
  return 0;
}
