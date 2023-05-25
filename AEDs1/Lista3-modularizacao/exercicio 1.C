#include <stdio.h>

float n1, n2, n3; // n1= nota1, n2= nota2, n3= nota3

float ma(na) { // ma= media aritmetrica
  float ma = 0;
  ma = (n1 + n2 + n3) / 3.0;
  return ma;
}

float mp(na) { // mp= media ponderada
  float mp = 0;
  mp = ((n1 * 5) + (n2 * 3) + (n3 * 2)) / 10.0; // 10= soma dos pesos
  return mp;
}

int main(void) {
  int na;
  char op;
  printf("digite o número de alunos:\n");
  scanf("%d", &na);
  for (int x=1; x<=na; x++) {
  printf("\ndigite suas notas:\n");
  scanf("%f %f %f", &n1, &n2, &n3);
  printf("\ndigite A para saber a média aritmética e P para saber a média  ponderada:\n");
  scanf(" %c", &op);
  switch (op) {
  case 'A':
    printf("a média aritmética das notas é de: %.2f\n", ma(na));
    break;
  case 'P':
    printf("a média ponderada das notas é de: %.2f\n", mp(na));
    break;
    }
  }
  return 0;
}
