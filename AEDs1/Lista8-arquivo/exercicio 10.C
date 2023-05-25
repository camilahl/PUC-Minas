#include <stdio.h>

int main(void) {
  FILE *arq;
  int n, vmax, vmin;
  int sum = 0;
  float a=0, me = 0; //a=0 é o contator, faz ficar passando de numero em numero

  arq = fopen("texto.txt", "r");
  while (fscanf(arq, "%d", &n) != EOF){
    if (a == 0){ //faz isso pra nao ter lixo eletronico, se colocasse la no int q vmin=1 e tivesse o numero 2 no arquivo (como sendo o menor) ia ler 1 e nao 2
      vmax=n;
      vmin=n;
    } else if (n > vmax){
      vmax=n;
    } else if (n < vmin){
      vmin=n;
    } 
    a++;
    sum += n;
  }
  me = sum/a;
  //printf("\n%f\n\n", a);
  printf("o valor máximo é: %d", vmax);
  printf("\no valor mínimo é: %d", vmin);
  printf("\na média de todos os valores, de soma %d, é: %.2f", sum, me);
  fclose(arq);
  return 0;
}
