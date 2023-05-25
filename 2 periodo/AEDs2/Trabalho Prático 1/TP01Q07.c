/*
Is em C - Refaça em C a questão anterior.
*/

#include <stdbool.h>
#include <stdio.h>
#include <string.h>

bool isFim(char *c) { 
    return (strlen(c) == 3 && c[0] == 'F' && c[1] == 'I' && c[2] == 'M');
}

bool isVogal(char *s) {
    bool resp = false;
    for(int i=0; i < strlen(s); i++) {
        if(s[i] == 'a' || s[i] == 'A' || s[i] == 'e' || s[i] == 'E' || s[i] == 'i' ||
           s[i] == 'I' || s[i] == 'o' || s[i] == 'O' || s[i] == 'u' || s[i] == 'U') {
            resp = true;
        } else {
            return false;
        }
    }
    return resp;
}

bool isConsoante(char *s) {
    bool resp = false;
    for(int i=0; i < strlen(s); i++) {
        if(s[i] == 'b' || s[i] == 'B' || s[i] == 'c' || s[i] == 'C' ||
           s[i] == 'd' || s[i] == 'D' || s[i] == 'f' || s[i] == 'F' ||
           s[i] == 'g' || s[i] == 'G' || s[i] == 'h' || s[i] == 'H' ||
           s[i] == 'j' || s[i] == 'J' || s[i] == 'k' || s[i] == 'K' ||
           s[i] == 'l' || s[i] == 'L' || s[i] == 'm' || s[i] == 'M' ||
           s[i] == 'n' || s[i] == 'N' || s[i] == 'p' || s[i] == 'P' ||
           s[i] == 'q' || s[i] == 'Q' || s[i] == 'r' || s[i] == 'R' ||
           s[i] == 's' || s[i] == 'S' || s[i] == 't' || s[i] == 'T' ||
           s[i] == 'v' || s[i] == 'V' || s[i] == 'w' || s[i] == 'W' ||
           s[i] == 'x' || s[i] == 'X' || s[i] == 'y' || s[i] == 'Y' ||
           s[i] == 'z' || s[i] == 'Z') {
            resp = true;
        } else {
            return false;
        }
    }
    return resp;
}

bool isInt(char *s) {
    bool resp = false;
    for(int i=0; i < strlen(s); i++) {
        if((s[i] == '0' || s[i] == '1' || s[i] == '2' || s[i] == '3' || s[i] == '4' ||
           s[i] == '5' || s[i] == '6' || s[i] == '7' || s[i] == '8' || s[i] == '9') &&
           (s[i] != ',' || s[i] != '.')){
            resp = true;
        } else {
            return false;
        }
    }
    return resp;
}

bool isReal(char *s) {
    bool resp = false;
    int cont = 0;
    for(int i=0; i < strlen(s); i++) {
        if((s[i] == '0' || s[i] == '1' || s[i] == '2' || s[i] == '3' || s[i] == '4' ||
            s[i] == '5' || s[i] == '6' || s[i] == '7' || s[i] == '8' || s[i] == '9' && 
            (s[i] == ',' || s[i] == '.'))) {
                resp = true;

            if(s[i] == ','|| s[i] == '.') {
                cont++;  

                if(cont > 1){
                    return false;
                }
            }

            }else
                return false;
            }
    return resp;
}

int main(){
    char palavra[1000];
    
    do {
        scanf(" %[^\n]s", palavra);

        if(isVogal(palavra) == true){
            printf("SIM ");
        }else if(isVogal(palavra) == false){
            printf("NAO ");
        }
    
        if(isConsoante(palavra) == true){
            printf("SIM ");
        }else if(isConsoante(palavra) == false){
            printf("NAO ");
        }

        if(isInt(palavra) == true){
            printf("SIM ");
        }else if(isInt(palavra) == false){
            printf("NAO ");
        }

        if(isReal(palavra) == true){
            printf("SIM\n");
        }else if(isReal(palavra) == false){
            printf("NAO\n");
        }

    } while (!(isFim(palavra)));
    return 0;
}