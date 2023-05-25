/*
RECURSIVO - Palındromo em Java - Refaca a questao Palíndromo de forma recursiva.
*/

public class TP01Q11 {
    public static boolean isFim (String s){
        return (s.length() == 3 && s.charAt(0) == 'F' && s.charAt(1) == 'I' && s.charAt(2) == 'M');
    }

    public static boolean isPal(String s){ //inicia a função pela primeira vez a partir da posição 0 (i=0)
        return isPal (s, 0);
    }
    
    public static boolean isPal(String s, int i){
        boolean resp;
        if(i == s.length()){  //se a posição inicial for igual ao tamanho a string é um palindromo
            resp = true;
        }else if(s.charAt(i) != s.charAt(s.length()-i-1)){ //se a letra da posição 'i' for diferente da sua correspondente a partir do final do vetor a string nao é um palindromo
            resp = false;
        }else{
            resp = isPal(s, i+1); //chama a função de novo so que com a proxima posição (recursividade)
        }
        return resp;
    }

    public static void main(String[] args) {
        String pal = "";

        do{
            pal = MyIO.readLine(); //digita

            if (isPal(pal) == true) {
                MyIO.println("SIM ");
            } else {
                MyIO.println("NAO ");
            }
        } while (!(isFim(pal)));
    }
}
