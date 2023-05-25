#include <stdio.h>

int main(void) {
  int n;
  printf("digite sua nota:\n");
  scanf("%d", &n);
  if (n >= 8 && n <= 10) {
    printf("ótimo");
  } else if (n >= 7 && n < 8) {
    printf("bom");
  } else if (n >= 5 && n < 7) {
   printf("regular"); 
  } else if (n < 5) {
    printf("insatisfatório");
  }
  return 0;
}
