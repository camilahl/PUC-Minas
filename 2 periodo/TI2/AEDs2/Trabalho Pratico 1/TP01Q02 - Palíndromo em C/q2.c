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

bool calPa(char c[]) { //metodo pra calcular o palindromo
    int i ,j; 
    int tam = strlen(c)-1; //pra ser o ultimo indice valido da string, ou seja, seu inverso
    for (i = 0; j = tam, i < tam; i++, j--) {   //for (i=0; i<tam; i++) //pra frente
                                                //for (j=0; j=tam; j--) //pra tras
            if (c[i] == c[j]) {                 //e a mesma coisa mas junta pq j nao pode ser =0 e =tam
                return true; //SIM 
            }
    }
    return false; //NAO
}

void veriPa(char c[]) { //metodo pra verificar o palindromo
    if (calPa(c) == true) {
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