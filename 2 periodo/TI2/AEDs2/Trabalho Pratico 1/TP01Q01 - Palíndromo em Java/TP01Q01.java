/*
Palindromo em Java - Crie um método iterativo que recebe uma string como parâmetro e
retorna true se essa é um palı́ndromo. Na saı́da padrão, para cada linha de entrada, escreva
uma linha de saı́da com SIM/NÃO indicando se a linha é um palı́ndromo. Destaca-se que uma
linha de entrada pode ter caracteres não letras. A entrada termina com a leitura de FIM.
*/

import java.util.Scanner;

class TP01Q01 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in); //scanner = nome do scanf
    String[] palavra = new String[1000]; //vetor que tem 1000 posições
    boolean[] verificaPalindromo = new boolean[1000]; //verifica se é palindromo ou nao
    int a = 0, i = 0; // i = posicao // a = verificacao do do while

    do {
      palavra[i] = scanner.nextLine(); // pede p pessoa digitar a palavra
      if (palavra[i].charAt(0) == 'F' && palavra[i].charAt(1) == 'I' && palavra[i].charAt(2) == 'M' 
      && palavra[i].length() == 3) {
        a = 1; //nn repete mais pq o A=0 pra rodar, ai para
      } else {
        int p = palavra[i].length(); //p é pra ficar mais fácil de representar o tamanho da palavra
        for (int x = 0; x < (palavra[i].length() / 2); x++) { //roda o vetor todo
          p--;
          if (palavra[i].charAt(x) == palavra[i].charAt(p)) {
            if (x == (palavra[i].length() / 2) - 1) {
              verificaPalindromo[i] = true;
            }
          } else {
            verificaPalindromo[i] = false;
            x = palavra[i].length(); //pra fazer sair so loop e cair fora 
          }
        }
      }
      i++;

    } while (a == 0);
    for (int x = 0; x < i - 1; x++) { //i-1 -> pra tirar/nao contar o ultimo vetor, que seria o FIM
      if (verificaPalindromo[x] == true) {
        System.out.println("SIM");
      } else {
        System.out.println("NAO");
      }
    }
    scanner.close();
  }
}