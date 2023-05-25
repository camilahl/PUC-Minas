#include <stdio.h>

int calcula_digito (int n){
  if(n<0){ //se o nùmero for negativo irà multiplicar por -1
    n*=-1;
  }
  if((n/10)<1){ //verificar se possiu mais de 1 digito
    return (1); //caso possua 1 digito apenas
  }
  else{
    return (1 + calcula_digito(n/10)); //caso tenha mais que 1 digito, retorna 1 + o valor que sera retornado ao chamar a função novamente
  }
}

int main() {
  double num;
  printf("digite um número:\n");
  scanf("%lf", &num);
  printf("\no número de digitos de %1.lf é %d\n", num, calcula_digito(num)); //chama a função e imprime na tela o número digitado e a quantidade de digitos donúmero
  return 0;
}
