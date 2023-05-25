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

//meu isFim

import java.io.*;
import java.net.*;

class qq8 {
    public static boolean isFim(String s) {
        return (s.length() == 3 && s.charAt(0) == 'F' && s.charAt(1) == 'I' && s.charAt(2) == 'M');
    }
    /*-------------------------------------------------------------------------------------------------*/

    public static String getHtml(String endereco) {
        URL url;
        InputStream is = null;
        BufferedReader br;
        String resp = "", line;

        try {
            url = new URL(endereco);
            is = url.openStream(); // throws an IOException
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

    public static int contarA(String s, int a) {
        for (int y = 0; y < s.length(); y++) {
            if (s.charAt(y) == 'a') {
                a++;
            }
        }
        return a;
    }

    public static int contarE(String s, int e) {
        for (int y = 0; y < s.length(); y++) {
            if (s.charAt(y) == 'e') {
                e++;
            }
        }
        return e;
    }

    public static int contarI(String s, int i) {
        for (int y = 0; y < s.length(); y++) {
            if (s.charAt(y) == 'i') {
                i++;
            }
        }
        return i;
    }

    public static int contarO(String s, int o) {
        for (int y = 0; y < s.length(); y++) {
            if (s.charAt(y) == 'o') {
                o++;
            }
        }
        return o;
    }

    public static int contarU(String s, int u) {
        for (int y = 0; y < s.length(); y++) {
            if (s.charAt(y) == 'u') {
                u++;
            }
        }
        return u;
    }
    /*-------------------------------------------------------------------------------------------------*/

    public static int contarAComAcento(String s, int a1) {
        for (int y = 0; y < s.length(); y++) {
            if (s.substring(y, y+1).equals(("á"))) {
                a1++;
            }
        }
        return a1;
    }

    public static int contarEComAcento(String s, int e1) {
        for (int y = 0; y < s.length(); y++) {
            if (s.substring(y, y+1).equals(("é"))) {
                e1++;
            }
        }
        return e1;
    }

    public static int contarIComAcento(String s, int i1) {
        for (int y = 0; y < s.length(); y++) {
            if (s.substring(y, y+1).equals(("í"))) {
                i1++;
            }
        }
        return i1;
    }

    public static int contarOComAcento(String s, int o1) {
        for (int y = 0; y < s.length(); y++) {
            if (s.substring(y, y+1).equals(("ó"))) {
                o1++;
            }
        }
        return o1;
    }

    public static int contarUComAcento(String s, int u1) {
        for (int y = 0; y < s.length(); y++) {
            if (s.substring(y, y+1).equals(("ú"))) {
                u1++;
            }
        }
        return u1;
    }
    /*-------------------------------------------------------------------------------------------------*/

    public static int contarAComCrase(String s, int a2) {
        for (int y = 0; y < s.length(); y++) {
            if (s.substring(y, y+1).equals(("à"))) {
                a2++;
            }
        }
        return a2;
    }

    public static int contarEComCrase(String s, int e2) {
        for (int y = 0; y < s.length(); y++) {
            if (s.substring(y, y+1).equals(("è"))) {
                e2++;
            }
        }
        return e2;
    }

    public static int contarIComCrase(String s, int i2) {
        for (int y = 0; y < s.length(); y++) {
            if (s.substring(y, y+1).equals(("ì"))) {
                i2++;
            }
        }
        return i2;
    }

    public static int contarOComCrase(String s, int o2) {
        for (int y = 0; y < s.length(); y++) {
            if (s.substring(y, y+1).equals(("ò"))) {
                o2++;
            }
        }
        return o2;
    }

    public static int contarUComCrase(String s, int u2) {
        for (int y = 0; y < s.length(); y++) {
            if (s.substring(y, y+1).equals(("ù"))) {
                u2++;
            }
        }
        return u2;
    }
    /*-------------------------------------------------------------------------------------------------*/

    public static int contarAComTil(String s, int a3) {
        for (int y = 0; y < s.length(); y++) {
            if (s.substring(y, y+1).equals(("ã"))) {
                a3++;
            }
        }
        return a3;
    }

    public static int contarOComTil(String s, int o3) {
        for (int y = 0; y < s.length(); y++) {
            if (s.substring(y, y+1).equals(("õ"))) {
                o3++;
            }
        }
        return o3;
    }
    /*-------------------------------------------------------------------------------------------------*/

    public static int contarACircun(String s, int a4) {
        for (int y = 0; y < s.length(); y++) {
            if (s.substring(y, y+1).equals(("â"))) {
                a4++;
            }
        }
        return a4;
    }

    public static int contarECircun(String s, int e4) {
        for (int y = 0; y < s.length(); y++) {
            if (s.substring(y, y+1).equals(("ê"))) {
                e4++;
            }
        }
        return e4;
    }

    public static int contarICircun(String s, int i4) {
        for (int y = 0; y < s.length(); y++) {
            if (s.substring(y, y+1).equals(("î"))) {
                i4++;
            }
        }
        return i4;
    }

    public static int contarOCircun(String s, int o4) {
        for (int y = 0; y < s.length(); y++) {
            if (s.substring(y, y+1).equals(("ô"))) {
                o4++;
            }
        }
        return o4;
    }

    public static int contarUCircun(String s, int u4) {
        for (int y = 0; y < s.length(); y++) {
            if (s.substring(y, y+1).equals(("û"))) {
                u4++;
            }
        }
        return u4;
    }
    /*-------------------------------------------------------------------------------------------------*/

    public static int countConsoante(String s, int conso) {
        boolean flag=false;

        for (int y = 0; y < s.length(); y++) {
            if (s.charAt(y) == '<') {
                flag = true;
            }
            if (flag == false) {
                if (isConsoante(s.charAt(y))){
                    conso++;
                }
            } else if (s.charAt(y) == '>') {
                flag = false;
            }
        }
        return conso;
    }
    /*-------------------------------------------------------------------------------------------------*/

    public static boolean isLetra(char c) {
        return (c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z');
    }
    /*-------------------------------------------------------------------------------------------------*/

    public static boolean isVogal(char c) {
        return (c == 'a') || (c == 'e') || (c == 'i') || (c == 'o') || (c == 'u');
    }
    /*-------------------------------------------------------------------------------------------------*/

    public static boolean isConsoante(char c) {
        return (isLetra(c) && (!(isVogal(c))));
    }
    /*-------------------------------------------------------------------------------------------------*/
    
    public static int isBr(String s, int br) {
        for (int y = 0; y < s.length(); y++) {
            if (s.charAt(y) == '<' && s.charAt(y + 1) == 'b' && s.charAt(y + 2) == 'r'
                    && s.charAt(y + 3) == '>') {
                br++;
            }
        }
        return br;
    }
    /*-------------------------------------------------------------------------------------------------*/
    
    public static int isTable(String s, int table) {
        for (int y = 0; y < s.length(); y++) {
            if (s.charAt(y) == '<' && s.charAt(y + 1) == 't' && s.charAt(y + 2) == 'a'
                    && s.charAt(y + 3) == 'b' && s.charAt(y + 4) == 'l' && s.charAt(y + 5) == 'e'
                    && s.charAt(y + 6) == '>') {
                table++;
            }
        }
        return table;
    }
    /*-------------------------------------------------------------------------------------------------*/

    public static void main(String[] args) {
        String endereco, nome, html;
        int a = 0, e = 0, i = 0, o = 0, u = 0, a1 = 0, e1 = 0, i1 = 0, o1 = 0, u1 = 0, a2 = 0, e2 = 0, i2 = 0, o2 = 0,
                u2 = 0, a3 = 0, o3 = 0, a4 = 0, e4 = 0, i4 = 0, o4 = 0, u4 = 0, conso = 0, br = 0, table = 0;  

        nome = MyIO.readLine();
        
        do {
            endereco = MyIO.readLine();
            html = getHtml(endereco);

            int tbcont=0;
            int brcont=0;
            tbcont = isTable(html, table);
            brcont = isBr(html, br);

            MyIO.print( "a(" + (contarA(html, a) - (tbcont)) + ") "); //tira o A do table
            MyIO.print( "e(" + (contarE(html, e) - (tbcont)) + ") "); //tira o E do table
            MyIO.print( "i(" + contarI(html, i) + ") ");
            MyIO.print( "o(" + contarO(html, o) + ") ");
            MyIO.print( "u(" + contarU(html, u) + ") ");

            MyIO.print( "á(" + contarAComAcento(html, a1) + ") ");
            MyIO.print( "é(" + contarEComAcento(html, e1) + ") ");
            MyIO.print( "í(" + contarIComAcento(html, i1) + ") ");
            MyIO.print( "ó(" + contarOComAcento(html, o1) + ") ");
            MyIO.print( "ú(" + contarUComAcento(html, u1) + ") ");

            MyIO.print( "à(" + contarAComCrase(html, a2) + ") ");
            MyIO.print( "è(" + contarEComCrase(html, e2) + ") ");
            MyIO.print( "ì(" + contarIComCrase(html, i2) + ") ");
            MyIO.print( "ò(" + contarOComCrase(html, o2) + ") ");
            MyIO.print( "ù(" + contarUComCrase(html, u2) + ") ");

            MyIO.print( "ã(" + contarAComTil(html, a3) + ") ");
            MyIO.print( "o(" + contarOComTil(html, o3) + ") ");

            MyIO.print( "â(" + contarACircun(html, a4) + ") ");
            MyIO.print( "ê(" + contarECircun(html, e4) + ") ");
            MyIO.print( "î(" + contarICircun(html, i4) + ") ");
            MyIO.print( "ô(" + contarOCircun(html, o4) + ") ");
            MyIO.print( "û(" + contarUCircun(html, u4) + ") ");

            MyIO.print("consoante(" + (countConsoante(html, conso) - (brcont*2) - (tbcont*3)) + ") "); //tira as consoantes do br e do table
            MyIO.print("<br>(" + brcont + ") ");
            MyIO.print("<table>(" + tbcont + ") ");
            MyIO.print(nome);

            MyIO.print("\n");
            nome = MyIO.readLine();

        } while (!(isFim(nome)));
    }
}