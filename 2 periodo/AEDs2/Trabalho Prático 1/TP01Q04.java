/*
Crie um método iterativo que recebe uma string, sorteia
duas letras minúsculas aleatórias (código ASCII ≥ ’a’ e ≤ ’z’), substitui todas as ocorrências da
primeira letra na string pela segunda e retorna a string com as alterações efetuadas. Na saı́da
padrão, para cada linha de entrada, execute o método desenvolvido nesta questão e mostre a
string retornada como uma linha de saı́da. Abaixo, observamos um exemplo de entrada supondo
que para a primeira linha as letras sorteados foram o ’a’ e o ’q’. Para a segunda linha, foram o
’e’ e o ’k’.
*/

import java.util.Scanner;
import java.util.Random;

class TP01Q04 {
  public static boolean isFim(String s) {
    return (s.length() == 3 && s.charAt(0) == 'F' && 
    s.charAt(1) == 'I' && s.charAt(2) == 'M');
  }

  public static void main(String[] args) {
    int i=0, a=0;
    String[] palavra = new String[1000];
    Scanner p = new Scanner(System.in);

    Random gerador = new Random();
    gerador.setSeed(4); //valor inicial que alimenta a sequencia
    char char1;
    char char2;

    String[] nova = new String[1000];
  
    do{
      nova[i]=""; //pra nao inicialiar vazio
      palavra[i] = p.nextLine(); //pede p a pessoa digitar
      char1 = ((char) ('a' + (Math.abs(gerador.nextInt()) % 26)));  
      char2 = ((char) ('a' + (Math.abs(gerador.nextInt()) % 26)));
      //math.abs e pra tirar negativo, ou seja, multiplica por -1
      /*gera numero de 0 a 26 e ai soma ele a alg valor padrao (no caso o A, que vale 97) 
      na tabela ASCII ai vai da um, numero entre A e Z, que vai ser trocado pela letra 
      equivalente ao numero*/

      for (a=0; a<palavra[i].length(); a++) {
        if (palavra[i].charAt(a) == char1) { //pegou a string toda e ta olhando um caracter
          nova[i] = nova[i]+char2; //vai ser a troca do caracter
          //char1 - pegou o caracter e troca pelo char2
        } else{
          nova[i] = nova[i]+palavra[i].charAt(a); // qnd nn tem troca dxa ele mesmo
        }
      }
      i++; // rodar vetor
    } while (!(isFim(palavra[i-1]))); //i-1 é pra enviar a palavra analisada no while
    i--;

    for (int x=0; x<i; x++) {
      System.out.println(nova[x]);
    }
    
    p.close();
  }
}
