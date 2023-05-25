/*
Is em C - Refaça em C a questão anterior.
*/

#include <stdbool.h>
#include <stdio.h>
#include <string.h>

char toUpper(char c) {
  if (c >= 'a' && c <= 'z') { // c >= 97 && c <= 122
    return c - 32; // ai  retorna c -32 pra cair na letra maiuscula do numero
  }
}

bool isFim(char *s) { //ponteiro e pra acessar a string nas funcoes
  return strcmp(s, "FIM") == 0; // strcmp = comparacao -> compara a string com fim e se for fim retorna true
}

bool isCharVogal(char c) {
  char up = toUpper(c);
  return (up == 'A' || up == 'E' || up == 'I' || up == 'O' || up == 'U');
}

bool isCharConsoante(char c) {
  char up = toUpper(c);
  return (up >= 'B' && up <= 'D' || up >= 'F' && up <= 'H' ||
          up >= 'J' && up <= 'N' || up >= 'P' && up <= 'T' ||
          up >= 'V' && up <= 'Z');
}

bool isCharInteiro(char c) {
  return ((c == '0' || c == '1' || c == '2' || c == '3' || c == '4' ||
           c == '5' || c == '6' || c == '7' || c == '8' || c == '9') &&
          (c != ',' || c != '.'));
}

bool isCharReal(char c) {
  return ((c == '0' || c == '1' || c == '2' || c == '3' || c == '4' ||
           c == '5' || c == '6' || c == '7' || c == '8' || c == '9') &&
          (c == ',' || c == '.'));
}

bool isStringVogal(char *s) {
  for (int i = 0; i < strlen(s); i++) {
    if (!isCharVogal(s[i])) { // se nao for vogal
      return false;           // retorna false
    }
  }
  return true;
}

bool isStringConsoante(char *s) {
  for (int i = 0; i < strlen(s); i++) {
    if (!isCharConsoante(s[i])) { // se nao for consoante
      return false;               // retorna false
    }
  }
  return true;
}

bool isStringInteiro(char *s) {
  for (int i = 0; i < strlen(s); i++) {
    if ((s[i] < '0' || s[i] > '9') && (s[i] == ',' || s[i] == '.')) {
      return false;
    }

    if (!isCharInteiro(s[i])) { // se nao for inteiro
      return false;             // retorna false
    }
  }
  return true;
}

bool isStringReal(char *s) {
  int cont = 0;
  for (int i = 0; i < strlen(s); i++) {
    if ((s[i] < '0' || s[i] > '9') && (s[i] != ',' || s[i] != '.')) {
      return false;
    }

    if (s[i] == '.' || s[i] == ','){
      cont++;
      if (cont > 1) {
        return false;
      }
    }

    if (!isCharReal(s[i])) { // se nao for real
      return false;          // retorna false
    }
  }
  return true;
}

int main() {
  int i = 0;
  char string[1000];

  do {
    scanf(" %s", &string[i]);
    if (isStringVogal(string)) {
      printf("SIM ");
    } else {
      printf("NAO ");
    }

    if (isStringConsoante(string)) {
      printf("SIM ");
    } else {
      printf("NAO ");
    }

    if (isStringInteiro(string)) {
      printf("SIM ");
    } else {
      printf("NAO ");
    }

    if (isStringReal(string)) {
      printf("SIM ");
      printf("\n");
    } else {
      printf("NAO ");
      printf("\n");
    }

  } while (!(isFim(string)));
  i--;

  return 0;
}