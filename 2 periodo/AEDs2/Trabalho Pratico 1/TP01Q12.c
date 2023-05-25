/*
RECURSIVO - Pal ́ındromo em C - Refa ̧ca a quest ̃ao anterior na linguagem C
*/

#include <stdio.h>
#include <stdlib.h>
#include <stdbool.h>
#include <string.h>

bool isFim(char *c) { 
    return (strlen(c) == 3 && c[0] == 'F' && c[1] == 'I' && c[2] == 'M');
}

bool isPal(char *s, int i) {
    bool resp;
    if (i == strlen(s)) { //se a posição inicial for igual ao tamanho a string é um palindromo
        resp = true;
    } else if (s[i] != s[strlen(s) - i - 1]) { //se a letra da posição 'i' for diferente da sua correspondente a partir do final do vetor a string nao é um palindromo
        resp = false;
    } else {
        resp = isPal(s, i+1); //chama recursao pra proxima posicao 
    }
    return resp;
}

int main(){
    char pal[100000];
    scanf(" %[^\n]", pal);

    do{
        if (isPal(pal, 0) == true){ //o 0 eh pra setar o i na funcao isPal
            printf("SIM ");
            printf("\n");
        } else {
            printf("NAO ");
            printf("\n");
        }
        scanf(" %[^\n]", pal);
    } while (!(isFim(pal)));
    return 0;
}