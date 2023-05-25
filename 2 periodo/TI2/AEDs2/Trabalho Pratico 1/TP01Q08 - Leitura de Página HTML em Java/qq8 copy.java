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
        return (s.length() == 3 && s.charAt(0) == 'F' && 
        s.charAt(1) == 'I' && s.charAt(2) == 'M');
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
        s.toLowerCase();
        for (int y = 0; y < s.length(); y++) {
            if (s.charAt(y) == 'a') {
                a++;
            }
        }
        return a;
    }

    public static int contarE(String s, int e) {
        s.toLowerCase();
        for (int y = 0; y < s.length(); y++) {
            if (s.charAt(y) == 'e') {
                e++;
            }
        }
        return e;
    }

    public static int contarI(String s, int i) {
        s.toLowerCase();
        for (int y = 0; y < s.length(); y++) {
            if (s.charAt(y) == 'i') {
                i++;
            }
        }
        return i;
    }

    public static int contarO(String s, int o) {
        s.toLowerCase();
        for (int y = 0; y < s.length(); y++) {
            if (s.charAt(y) == 'o') {
                o++;
            }
        }
        return o;
    }

    public static int contarU(String s, int u) {
        s.toLowerCase();
        for (int y = 0; y < s.length(); y++) {
            if (s.charAt(y) == 'u') {
                u++;
            }
        }
        return u;
    }
    /*-------------------------------------------------------------------------------------------------*/

    public static int contarAComAcento(String s, int a1) {
        s.toLowerCase();
        for (int y = 0; y < s.length(); y++) {
            if (s.charAt(y) == (char) 160) {
                a1++;
            }
        }
        return a1;
    }

    public static int contarEComAcento(String s, int e1) {
        s.toLowerCase();
        for (int y = 0; y < s.length(); y++) {
            if (s.charAt(y) == (char) 130) {
                e1++;
            }
        }
        return e1;
    }

    public static int contarIComAcento(String s, int i1) {
        s.toLowerCase();
        for (int y = 0; y < s.length(); y++) {
            if (s.charAt(y) == (char) 161) {
                i1++;
            }
        }
        return i1;
    }

    public static int contarOComAcento(String s, int o1) {
        s.toLowerCase();
        for (int y = 0; y < s.length(); y++) {
            if (s.charAt(y) == (char) 162) {
                o1++;
            }
        }
        return o1;
    }

    public static int contarUComAcento(String s, int u1) {
        s.toLowerCase();
        for (int y = 0; y < s.length(); y++) {
            if (s.charAt(y) == (char) 163) {
                u1++;
            }
        }
        return u1;
    }
    /*-------------------------------------------------------------------------------------------------*/

    public static int contarAComCrase(String s, int a2) {
        s.toLowerCase();
        for (int y = 0; y < s.length(); y++) {
            if (s.charAt(y) == (char) 133) {
                a2++;
            }
        }
        return a2;
    }

    public static int contarEComCrase(String s, int e2) {
        s.toLowerCase();
        for (int y = 0; y < s.length(); y++) {
            if (s.charAt(y) == (char) 138) {
                e2++;
            }
        }
        return e2;
    }

    public static int contarIComCrase(String s, int i2) {
        s.toLowerCase();
        for (int y = 0; y < s.length(); y++) {
            if (s.charAt(y) == (char) 141) {
                i2++;
            }
        }
        return i2;
    }

    public static int contarOComCrase(String s, int o2) {
        s.toLowerCase();
        for (int y = 0; y < s.length(); y++) {
            if (s.charAt(y) == (char) 149) {
                o2++;
            }
        }
        return o2;
    }

    public static int contarUComCrase(String s, int u2) {
        s.toLowerCase();
        for (int y = 0; y < s.length(); y++) {
            if (s.charAt(y) == (char) 151) {
                u2++;
            }
        }
        return u2;
    }
    /*-------------------------------------------------------------------------------------------------*/

    public static int contarAComTil(String s, int a3) {
        s.toLowerCase();
        for (int y = 0; y < s.length(); y++) {
            if (s.charAt(y) == (char) 198) {
                a3++;
            }
        }
        return a3;
    }

    public static int contarOComTil(String s, int o3) {
        s.toLowerCase();
        for (int y = 0; y < s.length(); y++) {
            if (s.charAt(y) == (char) 228) {
                o3++;
            }
        }
        return o3;
    }
    /*-------------------------------------------------------------------------------------------------*/

    public static int contarACircun(String s, int a4) {
        s.toLowerCase();
        for (int y = 0; y < s.length(); y++) {
            if (s.charAt(y) == (char) 131) {
                a4++;
            }
        }
        return a4;
    }

    public static int contarECircun(String s, int e4) {
        s.toLowerCase();
        for (int y = 0; y < s.length(); y++) {
            if (s.charAt(y) == (char) 136) {
                e4++;
            }
        }
        return e4;
    }

    public static int contarICircun(String s, int i4) {
        s.toLowerCase();
        for (int y = 0; y < s.length(); y++) {
            if (s.charAt(y) == (char) 140) {
                i4++;
            }
        }
        return i4;
    }

    public static int contarOCircun(String s, int o4) {
        s.toLowerCase();
        for (int y = 0; y < s.length(); y++) {
            if (s.charAt(y) == (char) 147) {
                o4++;
            }
        }
        return o4;
    }

    public static int contarUCircun(String s, int u4) {
        s.toLowerCase();
        for (int y = 0; y < s.length(); y++) {
            if (s.charAt(y) == (char) 150) {
                u4++;
            }
        }
        return u4;
    }
    /*-------------------------------------------------------------------------------------------------*/

    public static int isConsoante(String s, int conso) {
        if (s.toUpperCase().matches("[QWRTYPSDFGHJKLZyCVBNM]+")) {
            conso++;
        }
        return conso;
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

    public static void main(String[] args) {
        String endereco, nome, html;
        int a = 0, e = 0, i = 0, o = 0, u = 0, a1 = 0, e1 = 0, i1 = 0, o1 = 0, u1 = 0, a2 = 0, e2 = 0, i2 = 0, o2 = 0,
                u2 = 0, a3 = 0, o3 = 0, a4 = 0, e4 = 0, i4 = 0, o4 = 0, u4 = 0, conso = 0, br = 0, table = 0;  

        nome = MyIO.readLine();
        
        do {
            endereco = MyIO.readLine();
            html = getHtml(endereco);

            MyIO.print("a(" + contarA(html, a) + ") ");
            MyIO.print("e(" + contarE(html, e) + ") ");
            MyIO.print("i(" + contarI(html, i) + ") ");
            MyIO.print("o(" + contarO(html, o) + ") ");
            MyIO.print("u(" + contarU(html, u) + ") ");

            MyIO.print((char) 160 + "(" + contarAComAcento(html, a1) + ") ");
            MyIO.print((char) 130 + "(" + contarEComAcento(html, e1) + ") ");
            MyIO.print((char) 161 + "(" + contarIComAcento(html, i1) + ") ");
            MyIO.print((char) 162 + "(" + contarOComAcento(html, o1) + ") ");
            MyIO.print((char) 163 + "(" + contarUComAcento(html, u1) + ") ");

            MyIO.print((char) 133 + "(" + contarAComCrase(html, a2) + ") ");
            MyIO.print((char) 138 + "(" + contarEComCrase(html, e2) + ") ");
            MyIO.print((char) 141 + "(" + contarIComCrase(html, i2) + ") ");
            MyIO.print((char) 149 + "(" + contarOComCrase(html, o2) + ") ");
            MyIO.print((char) 151 + "(" + contarUComCrase(html, u2) + ") ");

            MyIO.print((char) 198 + "(" + contarAComTil(html, a3) + ") ");
            MyIO.print((char) 228 + "(" + contarOComTil(html, o3) + ") ");

            MyIO.print((char) 131 + "(" + contarACircun(html, a4) + ") ");
            MyIO.print((char) 136 + "(" + contarECircun(html, e4) + ") ");
            MyIO.print((char) 140 + "(" + contarICircun(html, i4) + ") ");
            MyIO.print((char) 147 + "(" + contarOCircun(html, o4) + ") ");
            MyIO.print((char) 150 + "(" + contarUCircun(html, u4) + ") ");

            MyIO.print("consoante(" + isConsoante(html, conso) + ") ");
            MyIO.print("<br>(" + isBr(html, br) + ") ");
            MyIO.print("<table>(" + isTable(html, table) + ") ");
            MyIO.print(nome);

            MyIO.print("\n");
            nome = MyIO.readLine();

        } while (!(isFim(nome)));
    }
}