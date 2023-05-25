#include <stdio.h>

int main(void) {
  FILE *pont_arq;
  FILE *soma;
  int n;
  char l;
  int cont = 0;
  pont_arq = fopen("texto.txt", "w");
 
  printf("digite quantas letras você quer: ");
  scanf("%d", &n);
    
  for (int i=0; i<n; i++){
    printf("digite suas letras: ");
    scanf(" %c", &l);
    fprintf(pont_arq, "%c", l); //ja printa no arquivo
  }
  fclose(pont_arq); //fecha
  
  //abre dnv em modo leitura
  soma = fopen("texto.txt", "r");
  while (fscanf (soma, "%c", &l) != EOF) {
    if ((l == 'a') || (l == 'e') || (l == 'i') || (l == 'o') || (l == 'u') || (l == 'A') || (l == 'E') || (l == 'I') || (l == 'O') || (l == 'U')) {
      cont++;
    }
  }
  printf("\nquantidade de vogais é: %d", cont);
  fclose(soma);
  return 0;
}
