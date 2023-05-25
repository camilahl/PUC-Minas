#include <stdio.h>

int main(void) {
  int vmax, vmot;
  printf("digite a velocidade máxima permitida e a velocidade que o motorista estava:\n");
  scanf ("%d %d", &vmax, &vmot);
  if (vmot == vmax) {
    printf ("motorista respeitu a lei");
  } else if (vmot <= vmax+10) {
    printf ("multa de 50 reais");
  } else if ((vmot >= vmax+11) && (vmot <= vmax+30)) {
    printf ("multa de 100 reais");
  } else if (vmot > vmax+30) {
    printf ("multa de 200 reais");
  }
  return 0;
}
