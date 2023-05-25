#include <stdio.h>

void func(int *px, int *py) {   
  px = py;   
  *py = (*py) * (*px);   
  *px = *px + 2;  
}  
//nessa parte px = py entao aonde ta escrito px tambem pode let py, que o codigo da o mesmo resultado

int main () {  
  int x, y;  
  scanf("%d", &x);      
  scanf("%d", &y);   
  func(&x,&y);  
  printf("x = %d, y = %d", x, y); 
  return 0; 
}  
