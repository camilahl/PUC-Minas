#include <stdio.h>

int main(void) {
  int temp[31] = {20, 24, 15, 17, 18, 19, 20, 25, 28, 29, 25, 34, 32, 39, 38, 34, 36, 17, 18, 34, 32, 40, 30, 35, 37, 23, 22, 21, 20, 31, 38};
  int tmin=40, tmax=0, soma=0, inf = 0;
  float media;
    for (int i=0; i < 31; i++) {
      if (temp[i] < tmin){
        tmin = temp[i];
      }  
      if (temp[i] > tmax){
        tmax = temp[i];
      }
      soma += temp[i];
    }
    media = soma/31;
    for (int i=0; i < 31; i++) {
      if (temp[i] < media){
        inf++;
      }
    }
  printf("a maior temperatura foi de: %d\n", tmax);
  printf("a menor temperatura foi de: %d\n", tmin);
  printf("a media das temperaturas foi de: %.1f\n", media);
  printf("número de dias que a temperatura foi menor que a média: %d\n", inf);



  return 0;
}
