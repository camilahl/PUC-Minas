#include <stdio.h>

float categoria (x){
  int categoria=0;
  if (x >= 5 && x <= 7){
    categoria=1;
  } else if (x >= 8 && x <= 10){
    categoria=2;
  } else if (x >= 11 && x <= 13){
    categoria=3;
  } else if (x >= 14 && x <= 15){
    categoria=4;
  } else if (x >= 16 && x <= 17){
    categoria=5;
  } else if (x >= 18){
    categoria=6;
  }
  return categoria;
}

int main(void) {
  int id;
  printf("digite sua idade\n");
  scanf("%d", &id);
  if (categoria(id) == 1) {
    printf("\nvocê está na categoria F");
  } else if (categoria(id) == 2) {
    printf("\nvocê está na categoria E");
  } else if (categoria(id) == 3) {
    printf("\nvocê está na categoria D");
  } else if (categoria(id) == 4) {
    printf("\nvocê está na categoria C");
  } else if (categoria(id) == 5) {
    printf("\nvocê está na categoria B");
  } else if (categoria(id) == 6) {
    printf("\nvocê está na categoria A");
  }
  return 0;
}
