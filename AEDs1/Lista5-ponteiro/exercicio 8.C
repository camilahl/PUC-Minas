#include <stdio.h>

int ordem (int *valor1,int *valor2,int *valor3) {
  int troca1;
  if(*valor1 == *valor2 && *valor2 == *valor3) {
    return(1);
  } else {
    if ((*valor1 < *valor2 && *valor1 < *valor3)||(*valor1 == *valor2 && *valor1 < *valor3)||(*valor1 == *valor3 && *valor1 < *valor2)||(*valor2 == *valor3 && *valor1 < *valor2 && *valor1 < *valor3)) {
    if (*valor2 < *valor3||*valor2 == *valor3) {
      return(0);
    } else if (*valor3 < *valor2) {
      troca1 = *valor3;
      *valor3 = *valor2;
      *valor2 = troca1;
      return(0);
    }
    } else if((*valor2 < *valor1 && *valor2 < *valor3)||(*valor2 == *valor1 && *valor2 < *valor3)||(*valor2 == *valor3 && *valor2 < *valor1)||(*valor1 == *valor3 && *valor2 < *valor3 && *valor2 < *valor1)) {
    if(*valor1 < *valor3||*valor1 == *valor3) {
      troca1 = *valor1;
      *valor1 = *valor2;
      *valor2 = troca1;   
      return(0);
    } else if(*valor3 < *valor1) {
      troca1 = *valor1;
      *valor1 = *valor2;
      *valor2 = *valor3;
      *valor3 = troca1;
      return(0);
    }
    } else if((*valor3 < *valor1 && *valor3 < *valor2)||(*valor3 == *valor1 && *valor3 < *valor2)||(*valor3 == *valor2 && *valor3 < *valor1)||(*valor2 == *valor1 && *valor3 < *valor1 && *valor3 < *valor2)) {
    if(*valor1 < *valor2||*valor1 == *valor2) {
      troca1 = *valor1;
      *valor1 = *valor3;
      *valor3 = *valor2;
      *valor2 = troca1;
      return(0);
    } else if(*valor2 < *valor1) {
      troca1 = *valor1;
      *valor1 = *valor3;
      *valor3 = troca1;
      return(0);
    }
    }
  }
  return(0);
}

int main(void) {
  int x,y,z;
  printf("digite 3 números:\n");
  scanf("%d %d %d", &x, &y, &z);
  if (ordem(&x, &y, &z) ==1) {
    printf("todos valores são iguais: %d, %d e %d\n", x, y, z);
  } else if (ordem (&x, &y, &z) ==0) {
    printf("a ordem crescente é %d, %d e %d\n", x, y, z);
  }
}
//os printf não podem ficar no int do ponteiro, tem que ficar no do main, porque no exercício pede para "exibir os valores ordenados na tela NO PROGRMA PRINCIPAL", que é o main
//no int do ponteiro, nas coisas da troca, é o seguinte: se ta escrito por exemplo: troca1=*valor1; *valor1=*valor2; *valor2=*valor3; *valor3=troca1; significa que o valor valor2 vai ser escrito no lugar do valor1; que o valor3 vai estar escrito no lugar do valor 2 e que o valor da troca (valor1) vai estar escrito no lugar do valor3
