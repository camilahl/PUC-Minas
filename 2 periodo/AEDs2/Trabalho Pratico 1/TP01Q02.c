/*
Refaça em C a questão anterior.
*/

#include <stdio.h>
#include <stdlib.h>
#include <stdbool.h>
#include <string.h>

bool isFim(char *c) { 
    return (strlen(c) == 3 && c[0] == 'F' && c[1] == 'I' && c[2] == 'M');
}

bool isPal(char *s){ //metodo pra calcular o palindromo
    int cont = 0;
    int tam = strlen(s)-1;
    bool resp = false; //NAO
    for(int i = 0; i < strlen(s); i++){ //percorre a string
        if(s[i] == s[tam - i]){  //se o caracter for = ao tamanho menos o i que ta, aumenta o contador
            cont ++;
        }
    }
    if(cont == strlen(s)){ //se o contador for = ao  tamanho da palavra retorna true pq ai eh igual
        resp = true; //SIM
    }
    return resp;
}

void veriPa(char c[]) { //metodo pra verificar o palindromo
    if (isPal(c) == true) {
        printf("SIM\n");
    } else {
        printf("NAO\n");
    }
} 

int main() {
    char palavra[1000];
    scanf(" %[^\n]", palavra); //%[^\n] -> scaneia a string digitada

    do{
        veriPa(palavra); //chamada do metodo de verificacao retornando SIM ou NAO
        scanf(" %[^\n]", palavra); 

    } while (!(isFim(palavra)));

    return 0;
}