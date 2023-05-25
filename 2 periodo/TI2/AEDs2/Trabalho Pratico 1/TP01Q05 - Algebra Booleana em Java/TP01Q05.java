/*
Crie um método iterativo que recebe uma string contendo uma
expressão booleana e o valor de suas entradas e retorna um booleano indicando se a expressão
é verdadeira ou falsa. Cada string de entrada é composta por um número inteiro n indicando
o número de entradas da expressão booleana corrente. Em seguida, a string contém n valores
binários (um para cada entrada) e a expressão booleana. Na saı́da padrão, para cada linha
de entrada, escreva uma linha de saı́da com SIM / NÃO indicando se a expressão corrente é
verdadeira ou falsa.
*/

class TP01Q05 {
  public static String resolve(String s) {
    int parenteses=0;
    for (int i = 0; i < s.length(); i++) {
      if (s.charAt(i) == '(') {
        parenteses = i; //posicao do ultimo parenteses
      } else if (s.charAt(i) == ')') {
        char letra = s.charAt(parenteses - 1); //pra ver a letra antes do parenteses
        //or
        if (letra == 'r') {
          String expressaofechada = s.substring(parenteses-2, i+1); //+1 inclui o parenteses
          s = s.replace(expressaofechada, or(expressaofechada)); //passar a funcao
        } 
        //and
        else if (letra == 'd') {
          String expressaofechada = s.substring(parenteses-3, i+1); //+1 inclui o parenteses
          s = s.replace(expressaofechada, and(expressaofechada)); //passar a funcao
        }
        //not
        else if (letra == 't') {
          String expressaofechada = s.substring(parenteses-3, i+1); //+1 inclui o parenteses
          s = s.replace(expressaofechada, not(expressaofechada)); //passar a funcao
        }
        i=0; //faz voltar la no inicio se encontrar uma expressao fechada e resolver
      }
    }
    return s;
  }
/*-------------------------------------------------------------------------------------------------*/

  public static String or(String s) {
    String flag = "0"; //se achar qualquer valor igual a 1 retorna 1 por isso comeca no 0
    for (int i = 0; i < s.length(); i++) {
      if (s.charAt(i) == '1') { //caracter eh ''
        flag = "1"; //string sao ""
      } 
    }
    return flag;
  }

  public static String and(String s) {
    String flag = "1"; //se achar qualquer valor igual a 0 retorna 0 por isso comeca no 1
    for (int i = 0; i < s.length(); i++) {
      if (s.charAt(i) == '0') { //caracter eh ''
        flag = "0"; //string sao ""
      } 
    }
    return flag;
  }

  public static String not(String s) {
    String flag = "0"; //se achar 1 retorna 0 e se achar 0 retorna 1
    for (int i = 0; i < s.length(); i++) {
      if (s.charAt(i) == '0') { //caracter eh ''
        flag = "1"; //string sao ""
      } else if (s.charAt(i) == '1') {
        flag = "0";
      }
    }
    return flag;
  }
  /*-------------------------------------------------------------------------------------------------*/

  public static void main(String[] args) {
    String expressao = new String();
    expressao = MyIO.readLine();

    while (expressao.charAt(0) != '0') {
      char a, b, c;

      if (expressao.charAt(0) == '2') {
        a = expressao.charAt(2); // o numero na possicao tal ira pra letra A
        b = expressao.charAt(4);
        expressao = expressao.replaceAll("A", "" + a); //substitui a letra A pelo numero q tava na posicao la em cima e tranformou caracter em string e deu replace
        expressao = expressao.replaceAll("B", "" + b);
        expressao = expressao.substring(6); 

      } else {
        a = expressao.charAt(2); 
        b = expressao.charAt(4);
        c = expressao.charAt(6);
        expressao = expressao.replaceAll("A", "" + a);
        expressao = expressao.replaceAll("B", "" + b);
        expressao = expressao.replaceAll("C", "" + c);
        expressao = expressao.substring(8); 
      }

      MyIO.println(resolve(expressao)); //printa
      expressao = MyIO.readLine(); //ve qual a prox
    }
  }
}
