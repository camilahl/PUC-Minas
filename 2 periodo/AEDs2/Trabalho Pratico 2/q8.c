#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <stdbool.h>

bool isFim (char ID[20]){
  return (ID[0] == 'F' && ID[1] == 'I' && ID[2] == 'M' && strlen(ID) == 3);
}

int main (void) {
  char ID[20];
  scanf ("%s",ID);
  char linha[1000];
  char *result;
  FILE *vasco;
  while (isFim(ID) == false){
    vasco = fopen ("/tmp/games.csv","r");
    while(!feof(vasco)){
      int verifica = 0;
      result = fgets (linha, 1000, vasco);
      for (int i=0; i<strlen(ID); i++){
        if (result[i] != ID[i]){
          verifica = 1;
        }
      }
      int aspas = 0;
      if(verifica == 0){
        for(int i=0; i<strlen(result); i++){
          if(result[i] == 44){
            result[i] = ' ';
          }
          if(result[i] == 34){
            if(aspas == 2){
              result[i] = 91;
            }
            else if(aspas == 3){
              result[i] = 93;
            }
            aspas++;
          }
        }
        printf("%s",result);
      }
    }
    scanf("%s",ID);
  }
  return 0;
}