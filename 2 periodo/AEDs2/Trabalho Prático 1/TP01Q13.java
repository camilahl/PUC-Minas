/*
RECURSIVO - Ciframento de C ́esar em Java - Refa ̧ca a quest ̃ao Ciframento de C ́esar
de forma recursiva.
*/

public class TP01Q13 {
    public static boolean isFim(String s) {
        return (s.length() == 3 && s.charAt(0) == 'F' && s.charAt(1) == 'I' && s.charAt(2) == 'M');
    }

    public static String ciframento(String s, String v, int i) {
        
        if (i < s.length()) {
            v += (char) (s.charAt(i) + 3); //adiciona 3 na letra
            return ciframento(s, v, i+1); //chama recursao
        } else {
            return v;
        }   
    }

    public static void main(String[] args) {
        String palavra = ""; //escreve a palavra
        palavra = MyIO.readLine();

        do {

            String vazia = ""; //adiciona o 3 la da letra e vai colocando nessa string nova
            MyIO.println(ciframento(palavra, vazia, 0));
            palavra = MyIO.readLine();

        } while (!(isFim(palavra)));
    }
}
