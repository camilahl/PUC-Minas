#include <stdio.h>

float salario = 0, maiorSalario = 0;
int ate100 = 0, acima100 = 0, porcentAcima, porcentAte, total = 0;
float mediaSalario(int n) { // lê o número do salário
  float media = 0, soma = 0;
  for (int x = 1; x <= n; x++) {
    printf("Digite o valor do seu salário: \n");
    scanf("%f", &salario);
    soma += salario;
    if (salario > maiorSalario) {
      maiorSalario = salario;
    }
    if (salario <= 100) {
      ate100++;
    } else {
      acima100++;
    }
    total = acima100 + ate100;
    porcentAcima = acima100 * 100 / total;
    porcentAte = ate100 * 100 / total;
  }
  media = soma / n;
  return media;
}
int mediaFilhos(int n) { // lê o número de filhos
  int media = 0, soma = 0, filhos = 0;
  for (int x = 0; x < n; x++) {
    printf("\nDigite o número de filhos que você possui: \n");
    scanf("%d", &filhos);
    soma += filhos;
  }
  media = soma / n;
  return media;
}
int main(void) {
  int N;
  printf("Digite o número de cidadãos participantes desta pesquisa: \n");
  scanf("%d", &N);
  printf("\nA média é: R$%2.f,00 \n", mediaSalario(N));
  printf("O maior salário foi de R$ %2.00f,00 \n", maiorSalario);
  printf("Percentual dos salários até 100: %d%%\n", porcentAte);
  printf("Percentual dos salários acima de 100: %d%%\n", porcentAcima);
  printf("A média de filhos da pesquisa é: %d", mediaFilhos(N));
}
