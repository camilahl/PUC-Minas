/*
Is em C - Refaça em C a questão anterior.
*/

#include <stdio.h>
#include <stdbool.h>
#include <string.h>

char toUpper(char c) {
    if(c >= 'a' && c <= 'z') { //c >= 97 && c <= 122
        return c - 32; //ai  retorna c -32 pra cair na letra maiuscula do numero
    }
}

bool isFim(char* s) {
    return strcmp(s, "FIM") == 0; //strcmp = comparacao -> compara a string com fim e se for fim retorna true
}  

bool isCharVogal(char c) {
    char up = toUpper(c);
    return (up == 'A' || up == 'E' || up == 'I' || up == 'O' || up == 'U');
}

bool isCharConsoante(char c) {
    char up = toUpper(c);
    return (up >= 'B' && up <= 'D' || up >= 'F' && up <= 'H' || up >= 'J' && up <= 'N' || 
    up >= 'P' && up <= 'T' || up >= 'V' && up <= 'Z');
}

bool isStringVogal(char *s) {
    for(int i = 0; i < strlen(s); i++) {
        if(!isCharVogal(s[i])) { //se nao for vogal
            return false; //retorna false
        }    
    }
    return true;
}

bool isStringConsoante(char *s) {
    for(int i = 0; i < strlen(s); i++) {
        if(!isCharConsoante(s[i])) { //se nao for vogal
            return false; //retorna false
        } 
    }
    return true;
}

int main() {
    
    char *string = "jkytw";

    printf("%s", isStringConsoante(string) ? "SIM" : "NÃO");
    return 0;
}