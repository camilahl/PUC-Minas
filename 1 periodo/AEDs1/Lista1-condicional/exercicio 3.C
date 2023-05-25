#include <stdio.h>

int main(void) {
  int a, id;
  char op;
  printf("digite o ano do seu nascimento:\n");
  scanf("%d", &a);
  printf("você já fez aniversário?:\n");
  scanf(" %c ", &op);
  switch (op) {
    case 'S': id = 2022 - a;
              break;
    case 'N':  id = 2021 - a;
              break;
  }
  if (id >=18) {
    printf ("você já pode tirar carteira");
  }else {
    printf("você não pode tirar carteira");
  }
  return 0;
}
