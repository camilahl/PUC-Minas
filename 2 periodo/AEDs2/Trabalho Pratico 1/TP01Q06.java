/*
Crie um método iterativo que recebe uma string e retorna true se a mesma é
composta somente por vogais. Crie outro método iterativo que recebe uma string e retorna
true se a mesma é composta somente por consoantes. Crie um terceiro método iterativo que
recebe uma string e retorna true se a mesma corresponde a um número inteiro. Crie um quarto
método iterativo que recebe uma string e retorna true se a mesma corresponde a um número
real. Na saı́da padrão, para cada linha de entrada, escreva outra de saı́da da seguinte forma X1
X2 X3 X4 onde cada Xi é um booleano indicando se a é entrada é: composta somente por vogais
(X1); composta somente somente por consoantes (X2); um número inteiro (X3); um número real
(X4). Se Xi for verdadeiro, seu valor será SIM, caso contrário, NÃO.
*/

import java.util.Scanner;

class TP01Q06 {
  public static boolean isFim(String s) {
    return (s.length() == 3 && s.charAt(0) == 'F' && 
    s.charAt(1) == 'I' && s.charAt(2) == 'M');
  }

  public static boolean isVogal (String s){
    boolean resp = true;
    s = s.toUpperCase(); //transforma tudo pra maiusculo
    for (int i=0; i<s.length(); i++) { //percorre a palavra
      if (s.charAt(i) != 'A' && s.charAt(i) != 'E' && s.charAt(i) != 'I' && s.charAt(i) != 'O' && 
      s.charAt(i) != 'U') { //se o caracter em qualquer posicao for diferente das vogais retorna false
        resp = false;
      } 
    }
    return resp;
  }

  public static boolean isConsoante (String s){
    boolean resp = true;
    s = s.toUpperCase(); //transforma tudo pra maiusculo
    for (int i=0; i<s.length(); i++) { //percorre a palavra
      if (isVogal(s.charAt(i) + "") == true) { //"" -> transforma o caracter em string
        resp = false;
      }  
      if (isInteiro(s.charAt(i) + "") == true) {
        resp = false;
      }  
      if (isReal(s.charAt(i) + "") == true) {
        resp = false;
      }
    }
    return resp;
  }

  public static boolean isInteiro (String s){
    boolean resp = false;
    for (int i=0; i<s.length(); i++) {
      if ((s.charAt(i) == '0' || s.charAt(i) == '1' || s.charAt(i) == '2' || s.charAt(i) == '3' || 
      s.charAt(i) == '4' || s.charAt(i) == '5' || s.charAt(i) == '6' || s.charAt(i) == '7' || 
      s.charAt(i) == '8' || s.charAt(i) == '9') && (s.charAt(i) != ',' || s.charAt(i) != '.')) {
        resp = true;
      } else {
        resp = false;
      }
    }
    return resp;
  }

  public static boolean isReal (String s){
    boolean resp = false;
    for (int i=0; i<s.length(); i++) {
      if ((s.charAt(i) == '0' || s.charAt(i) == '1' || s.charAt(i) == '2' || s.charAt(i) == '3' || 
      s.charAt(i) == '4' || s.charAt(i) == '5' || s.charAt(i) == '6' || s.charAt(i) == '7' || 
      s.charAt(i) == '8' || s.charAt(i) == '9') && (s.charAt(i) == ',' || s.charAt(i) == '.')) {
        resp = true;
      } else {
        resp = false;
      }
    }
    return resp;
  }
  
  public static void main (String[] args) {
    //int a=0, 
    int i=0;
    String[] entrada = new String[1000];
    Scanner e = new Scanner(System.in);

    do{
      entrada[i] = e.nextLine();
        if (isVogal(entrada[i]) == true) {
          System.out.print("SIM ");
        } else {
          System.out.print("NAO ");
        }

        if (isConsoante(entrada[i]) == true) {
          System.out.print("SIM ");
        } else {
          System.out.print("NAO ");
        }

        if (isInteiro(entrada[i]) == true) {
          System.out.print("SIM ");
        } else {
          System.out.print("NAO ");
        }

        if (isReal(entrada[i]) == true) {
          System.out.println("SIM ");
        } else {
          System.out.println("NAO ");
        }
    } while (!(isFim(entrada[i++])));
    i--;

    e.close();
  }
}