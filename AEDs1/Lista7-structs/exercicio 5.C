#include <stdio.h>

typedef struct Pessoa {
  char nome, endereco;
  int telefone;
} Pessoa;

int main() {
  Pessoa A;
  printf("CADASTRO PESSOA A\n");
  printf("digite seu nome: ");
  scanf("%s", &A.nome);
  printf("digite seu endereço: ");
  scanf("%s", &A.endereco);
  printf("digite seu telefone de 9 dígitos: ");
  scanf("%d", &A.telefone);
  printf("\n");
  Pessoa B;
  printf("\nCADASTRO PESSOA B\n");
  printf("digite seu nome: ");
  scanf("%s", &B.nome);
  printf("digite seu endereço: ");
  scanf("%s", &B.endereco);
  printf("digite seu telefone de 9 dígitos: ");
  scanf("%d", &B.telefone);
  printf("\n");
  printf("cadastro realizado com sucesso!");
  return 0;
}
