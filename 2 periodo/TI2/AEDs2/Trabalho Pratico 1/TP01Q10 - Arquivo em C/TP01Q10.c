/*
Faça um programa que leia um número inteiro n indicando o número de
valores reais que devem ser lidos e salvos sequencialmente em um arquivo texto. Após a leitura
dos valores, devemos fechar o arquivo. Em seguida, reabri-lo e fazer a leitura de trás para frente
usando os métodos getFilePointer e seek da classe RandomAccessFile e mostre todos os valores
lidos na tela. Nessa questão, você não pode usar, arrays, strings ou qualquer estrutura de dados.
A entrada padrão é composta por um número inteiro n e mais n números reais. A saı́da padrão
corresponde a n números reais mostrados um por linha de saı́da.

Refaça a questão anterior na linguagem C.
*/

#include <stdio.h>
#include <stdlib.h>

int main () {
  FILE *numeros;
  int qntd; //qntd de numeros que ira ser digitado
  
  numeros = fopen("arquivo.txt", "w"); //cria um arquivo e escreve nele
  scanf("%d", &qntd); //digita a quantidade de numeros

  double n[qntd]; //numeros
  for (int i=0; i<qntd; i++) {
    scanf("%lf", &n[i]); //digita os numeros
    fprintf(numeros, "%lf\n", n[i]);
    //printf printa no console, fprintf printa no arquivo que eu pedir
  }
  fclose(numeros); //fecha arquivo

  numeros = fopen("arquivo.txt", "r"); //abre o arquivo em modo leitura
  for(int i=qntd-1; i>=0; i--){ //pra nao contar o numero da quantidade no comeco
    printf("%g\n", n[i]); //g = ignora 0 a direita depois da virgula
  }

  fclose(numeros);
  return 0;
}