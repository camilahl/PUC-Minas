#include <locale.h>
#include <stdio.h>
#include <stdlib.h>
#define tam 3

struct obras_biblioteca {
  int codigo;
  char titulo[30], autor[30], editora[10], doacao, area;
} area_exatas[tam], area_humanas[tam], area_biologia[tam];

int main() {
  int i, resp = 1, codigo, codigo_livro;
  char area, op;
  printf("MENU\n");
  printf("1 - para cadastrar livros\n");
  printf("2 - para pesquisar livros\n");
  printf("\ndigite a opção desejada: ");
  scanf("%c", &op);
  if (op == '1') {
    for (i = 0; i < tam; i++) {
      if (resp == 1) {
        printf("\ninforme a área do livro [H - A - B]: ");
        scanf(" %c", &area);
        if ((area == 'H') || (area == 'h')) {
          printf("\ninforme o código do livro: ");
          scanf("%d", &area_humanas[i].codigo);

          printf("informe o título do livro: ");
          scanf("%s", area_humanas[i].titulo);

          printf("informe o nome do autor do livro: ");
          scanf("%s", area_humanas[i].autor);

          printf("informe a editora do livro: ");
          scanf("%s", area_humanas[i].editora);

          printf("o livro está sendo doado?[s-n]: ");
          scanf(" %c", &area_humanas[i].doacao);
        }
        else if ((area == 'E') || (area == 'e')) {
          printf("\ninforme o código do livro: ");
          scanf("%d", &area_exatas[i].codigo);

          printf("informe o título do livro: ");
          scanf("%s", area_exatas[i].titulo);

          printf("informe o nome do autor do livro: ");
          scanf("%s", area_exatas[i].autor);

          printf("informe a editora do livro: ");
          scanf("%s", area_exatas[i].editora);

          printf("o livro está sendo doado?[s-n]: ");
          scanf(" %c", &area_exatas[i].doacao);
        }
        else {
          printf("\ninforme o código do livro: ");
          scanf("%d", &area_biologia[i].codigo);

          printf("informe o título do livro: ");
          scanf("%s", area_humanas[i].titulo);

          printf("informe o nome do autor do livro: ");
          scanf("%s", area_humanas[i].autor);

          printf("informe a editora do livro: ");
          scanf("%s", area_humanas[i].editora);

          printf("o livro está sendo doado?[s-n]: ");
          scanf(" %c", &area_humanas[i].doacao);
        }
        printf("\ndeseja cadastrar mais livro? [sim = 1; nao = 0]: ");
        scanf("%d", &resp);
      }
    }
  }
  else if (op == '2') {
    printf("\ninforme o código do livro: ");
    scanf("%d", &codigo_livro);

    printf("informe a área do livro [H - E - B]: ");
    scanf(" %c", &area);
    if ((area == 'E') || (area == 'e')) {
      for (i = 0; i < tam; i++) {
        if (codigo_livro == area_exatas[i].codigo) {
          printf("título do livro: %s", area_exatas[i].titulo);
          printf("autor do livro: %s", area_exatas[i].autor);
          printf("editora do livro: %s", area_exatas[i].editora);
          printf("livro doado: %c", area_exatas[i].doacao);
        }
      }
    }
    else if ((area == 'B') || (area == 'b')) {
      for (i = 0; i < tam; i++) {
        if (codigo_livro == area_biologia[i].codigo) {
          printf("título do livro: %s", area_biologia[i].titulo);
          printf("autor do livro: %s", area_biologia[i].autor);
          printf("editora do livro: %s", area_biologia[i].editora);
          printf("livro doado: %c", area_biologia[i].doacao);
        }
      }
    }
    else {
      for (i = 0; i < tam; i++) {
        if (codigo_livro == area_humanas[i].codigo) {
          printf("título do livro: %s", area_humanas[i].titulo);
          printf("autor do livro: %s", area_humanas[i].autor);
          printf("editora do livro: %s", area_humanas[i].editora);
          printf("livro doado: %c", area_humanas[i].doacao);
        }
      }
    }
  }
  printf("FIM");
}
