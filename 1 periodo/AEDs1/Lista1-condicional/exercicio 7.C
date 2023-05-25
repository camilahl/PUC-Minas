#include <stdio.h>

int main(void) {
  int x, y;
  printf("digite um valor:\n");
  scanf("%d", &x);
  if(x<=1){
    y = 1;
  } else if (x>1 && x<=3){
    y = 2;
  } else if (x>2 && x<=3){
    y = (x*x);
  } else if (x>3){
    y = (x*x*x);
  }
  printf("%d", y);
  return 0;
}
