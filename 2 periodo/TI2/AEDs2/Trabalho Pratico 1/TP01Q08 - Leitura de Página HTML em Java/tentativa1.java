/*
Leia duas strings sendo que a primeira é o nome de
uma página web e a segunda, seu endereço. Por exemplo, “Pontifı́cia Universidade Católica de
Minas Gerais” e “www.pucminas.br”. Em seguida, mostre na tela o número de vogais (sem e
com acento), consoantes e dos padrões “< br >” e “< table >” que aparecem no código dessa
página. A entrada padrão é composta por várias linhas. Cada uma contém várias strings sendo
que a primeira é um endereço web e as demais o nome dessa página web. A última linha da
entrada padrão contém a palavra “FIM”. A saı́da padrão contém várias linhas sendo que cada
uma apresenta o número de ocorrência (valor xi entre parênteses) de cada caractere ou string
solicitado. Cada linha de saı́da será da seguinte forma: a(x1 ) e(x2 ) i(x3 ) o(x4 ) u(x5 ) á(x6 ) é(x7 )
ı́(x8 ) ó(x9 ) ú(x10 ) à(x11 ) è(x12 ) ı̀(x13 ) ò(x14 ) ù(x15 ) ã(x16 ) õ(x17 ) â(x19 ) ê(x19 ) ı̂(x20 ) ô(x21 )
û(x22 ) consoante(x23 ) < br >(x24 ) < table >(x25 ) nomepágina(x26 ).
*/

import java.io.*;
import java.net.*;

class tentativa1 {
    public static boolean isFim(String s) {
      return (s.length() == 3 && s.charAt(0) == 'F' && 
      s.charAt(1) == 'I' && s.charAt(2) == 'M');
    }
    /*-------------------------------------------------------------------------------------------------*/
    public static int contarA (String s){
      int a=0;
      for (int i=0; i<s.length(); i++) {
        if (s.charAt(i) == 'a') {
          a++;
        }
      }
      return a;
    }

    public static int contarE (String s){
        int e=0;
        for (int i=0; i<s.length(); i++) {
          if (s.charAt(i) == 'e') {
            e++;
          }
        }
        return e;
    }

    public static int contarI (String s){
        int i=0;
        for (i=0; i<s.length(); i++) {
          if (s.charAt(i) == 'i') {
            i++;
          }
        }
        return i;
    }

    public static int contarO (String s){
        int o=0;
        for (int i=0; i<s.length(); i++) {
          if (s.charAt(i) == 'o') {
            o++;
          }
        }
        return o;
    }

    public static int contarU (String s){
        int u=0;
        for (int i=0; i<s.length(); i++) {
          if (s.charAt(i) == 'u') {
            u++;
          }
        }
        return u;
    }
    /*-------------------------------------------------------------------------------------------------*/
    public static int contarAComAcento (String s){
        int a=0;
        for (int i=0; i<s.length(); i++) {
          if ((int)s.charAt(i) == 195 && (int)s.charAt(i+1) == 161 ) {
            a++;
          }
        }
        return a;
    }

    public static int contarEComAcento (String s){
        int e=0;
        s = s.toUpperCase();
        for (int i=0; i<s.length(); i++) {
          if (s.charAt(i) == 'É') {
            e++;
          }
        }
        return e;
    }

    public static int contarIComAcento (String s){
        int i=0;
        s = s.toUpperCase();
        for (i=0; i<s.length(); i++) {
          if (s.charAt(i) == 'Í') {
            i++;
          }
        }
        return i;
    }

    public static int contarOComAcento (String s){
        int o=0;
        s = s.toUpperCase();
        for (int i=0; i<s.length(); i++) {
          if (s.charAt(i) == 'Ó') {
            o++;
          }
        }
        return o;
    }

    public static int contarUComAcento (String s){
        int u=0;
        s = s.toUpperCase();
        for (int i=0; i<s.length(); i++) {
          if (s.charAt(i) == 'Ú') {
            u++;
          }
        }
        return u;
    }
    /*-------------------------------------------------------------------------------------------------*/
    public static int contarACrase (String s){
        int a=0;
        s = s.toUpperCase();
        for (int i=0; i<s.length(); i++) {
          if (s.charAt(i) == 'À') {
            a++;
          }
        }
        return a;
    }

    public static int contarECrase (String s){
        int e=0;
        s = s.toUpperCase();
        for (int i=0; i<s.length(); i++) {
          if (s.charAt(i) == 'È') {
            e++;
          }
        }
        return e;
    }

    public static int contarICrase (String s){
        int i=0;
        s = s.toUpperCase();
        for (i=0; i<s.length(); i++) {
          if (s.charAt(i) == 'Ì') {
            i++;
          }
        }
        return i;
    }

    public static int contarOCrase (String s){
        int o=0;
        s = s.toUpperCase();
        for (int i=0; i<s.length(); i++) {
          if (s.charAt(i) == 'Ò') {
            o++;
          }
        }
        return o;
    }

    public static int contarUCrase (String s){
        int u=0;
        s = s.toUpperCase();
        for (int i=0; i<s.length(); i++) {
          if (s.charAt(i) == 'Ù') {
            u++;
          }
        }
        return u;
    }
    /*-------------------------------------------------------------------------------------------------*/
    public static int contarATil (String s){
        int a=0;
        s = s.toUpperCase();
        for (int i=0; i<s.length(); i++) {
          if (s.charAt(i) == 'Ã') {
            a++;
          }
        }
        return a;
    }

    public static int contarOTil (String s){
        int a=0;
        s = s.toUpperCase();
        for (int i=0; i<s.length(); i++) {
          if (s.charAt(i) == 'Õ') {
            a++;
          }
        }
        return a;
    }
     /*-------------------------------------------------------------------------------------------------*/
     public static int contarACirc (String s){
        int a=0;
        s = s.toUpperCase();
        for (int i=0; i<s.length(); i++) {
          if (s.charAt(i) == 'Â') {
            a++;
          }
        }
        return a;
    }

    public static int contarECirc (String s){
        int e=0;
        s = s.toUpperCase();
        for (int i=0; i<s.length(); i++) {
          if (s.charAt(i) == 'Ê') {
            e++;
          }
        }
        return e;
    }

    public static int contarICirc (String s){
        int i=0;
        s = s.toUpperCase();
        for (i=0; i<s.length(); i++) {
          if (s.charAt(i) == 'Î') {
            i++;
          }
        }
        return i;
    }

    public static int contarOCirc (String s){
        int o=0;
        s = s.toUpperCase();
        for (int i=0; i<s.length(); i++) {
          if (s.charAt(i) == 'Ô') {
            o++;
          }
        }
        return o;
    }

    public static int contarUCirc (String s){
        int u=0;
        s = s.toUpperCase();
        for (int i=0; i<s.length(); i++) {
          if (s.charAt(i) == 'Û') {
            u++;
          }
        }
        return u;
    }
    /*-------------------------------------------------------------------------------------------------*/
    public static int isConsoante (String s){
      int c=0;
      s = s.toUpperCase();
      for (int i=0; i<s.length(); i++) {
        if (s.charAt(i) == 'B' || s.charAt(i) == 'C' || s.charAt(i) == 'D' || s.charAt(i) == 'F' ||
        s.charAt(i) == 'G' || s.charAt(i) == 'G' || s.charAt(i) == 'J' || s.charAt(i) == 'K' ||
        s.charAt(i) == 'L' || s.charAt(i) == 'M' || s.charAt(i) == 'N' || s.charAt(i) == 'P' ||
        s.charAt(i) == 'Q' || s.charAt(i) == 'R' || s.charAt(i) == 'S' || s.charAt(i) == 'T' ||
        s.charAt(i) == 'V' || s.charAt(i) == 'W' || s.charAt(i) == 'X' || s.charAt(i) == 'Y' ||
        s.charAt(i) == 'Z' ) {
          c++;
        }
      }
      return c;
    }
    /*-------------------------------------------------------------------------------------------------*/
    public static int isBr(String s){
      int b=0;
      for (int i=0; i<s.length(); i++) {
          if (s.charAt(i) == '<' && s.charAt(i+1) == 'b' && s.charAt(i+2) == 'r' &&
          s.charAt(i+3) == '>') {
              b++;
          }
      }
      return b;
    }
  
    public static int isTable(String s){
      int t=0;
      for (int i=0; i<s.length(); i++) {
          if (s.charAt(i) == '<' && s.charAt(i+1) == 't' && s.charAt(i+2) == 'a' &&
          s.charAt(i+3) == 'b' && s.charAt(i+4) == 'l' && s.charAt(i+5) == 'e' && s.charAt(i+6) == '>') {
              t++;
          }
      }
      return t;
    }
    /*-------------------------------------------------------------------------------------------------*/
    public static String getHtml(String endereco){//pegar um endereço da web e retornar uma string com o conteudo
        URL url;
        InputStream is = null;
        BufferedReader br;
        String resp = "", line;
  
        try {
           url = new URL(endereco);
           is = url.openStream();  // throws an IOException
           br = new BufferedReader(new InputStreamReader(is));
  
           while ((line = br.readLine()) != null) {
              resp += line + "\n";
           }
        } catch (MalformedURLException mue) {
           mue.printStackTrace();
        } catch (IOException ioe) {
           ioe.printStackTrace();
        } 
  
        try {
           is.close();
        } catch (IOException ioe) {
           // nothing to see here
  
        }
        return resp;
    }
    /*-------------------------------------------------------------------------------------------------*/
    public static void main (String[] args){

      String nome = new String(); //as demais strings
      String end = new String(); //so a primeria string
      String html = new String();

      nome = MyIO.readLine();
      do{       
        
        end = MyIO.readLine();
        html = getHtml(end);

        MyIO.println("a(" + contarA(html) + ")" +
        " e(" + contarE(html) + ") i(" + contarI(html) + ") o(" + contarO(html) + ") u(" + contarU(html) + 
        ") á(" + contarAComAcento(html) + ") é(" + contarEComAcento(html) + ") í(" + contarIComAcento(html) + ") ó(" + contarOComAcento(html) + ") ú(" + contarUComAcento(html) + 
        ") à(" + contarACrase(html) + ") è(" + contarECrase(html) + ") ì(" + contarICrase(html) + ") ò(" + contarOCrase(html) + ") ù(" + contarUCrase(html) + 
        ") ã(" + contarATil(html) + ") õ(" + contarOTil(html) + 
        ") â(" + contarACirc(html) + ") ê(" + contarECirc(html) + ") î(" + contarICirc(html) + ") ô(" + contarOCirc(html) + ") û(" + contarUCirc(html) + 
        ") consoante(" + isConsoante(html) + 
        ") <br>(" + isBr(html) + ") <table>(" + isTable(html) + ") " + nome);

        nome = MyIO.readLine();
      } while (!(isFim(nome)));
    }
  } 