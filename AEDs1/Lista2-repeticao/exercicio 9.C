#include <stdio.h>

int main(void) {
  float m, pc = 1, pv, l, vtc = 0, vtv = 0, lt = 0, perl;
  /*m= mercadoria, pc= preço de compra, pv= preço de venda, l= lucro, vtc= valor total de compra, vtv= valor total de venda, lt= lucro total, perl= percentual de lucro*/
  while (pc != 0) {
    printf("digite o preço de compra da mercadoria: \n");
    scanf("%f", &pc);
    if (pc != 0) {
      printf("digite o preço de venda da mercadoria: \n");
      scanf("%f", &pv);
      vtc += pc;
      vtv += pv;
      l = pv - pc;
      lt += l;
      perl = l / 100;
      if (l < 0.1) {
        printf("haverá um lucro menor que 10%%\n", l);
      } else if (0.1 <= l && l <= 0.2) {
        printf("haverá um lucro ente 10% e 20%%\n", l);
      } else if (l > 0.2) {
        printf("haverá um lucro maior do que 20%%\n", l);
      }
    }
  }
  printf("o valor total de venda é de:%.2f \n", vtv);
  printf("o valor total de compra é de:%.2f \n", vtc);
  printf("o valor total do lucro é de:%.2f \n", lt);
  return 0;
}
