/*
O Imperador Júlio César foi um dos principais nomes do
Império Romano. Entre suas contribuições, temos um algoritmo de criptografia chamado “Cifra-
mento de César”. Segundo os historiadores, César utilizava esse algoritmo para criptografar as
mensagens que enviava aos seus generais durante as batalhas. A ideia básica é um simples deslo-
camento de caracteres. Assim, por exemplo, se a chave utilizada para criptografar as mensagens
for 3, todas as ocorrências do caractere ’a’ são substituı́das pelo caractere ’d’, as do ’b’ por ’e’,
e assim sucessivamente. Crie um método iterativo que recebe uma string como parâmetro e
retorna outra contendo a entrada de forma cifrada. Neste exercı́cio, suponha a chave de cifra-
mento três. Na saı́da padrão, para cada linha de entrada, escreva uma linha com a mensagem
criptografada.
*/

class TP01Q03 {  
    public static boolean isFim(String s) {
        return (s.length() == 3 && s.charAt(0) == 'F' && s.charAt(1) == 'I' && s.charAt(2) == 'M');
    }

    public static String Ciframento(String s,int k){ //recebe uma string e a constante K que será usada no ciframento
        int tam = s.length();
        char[] c1 = s.toCharArray(); //converte a string em um array de chars (manipular caracteres individuais da string da erro)
       
        for(int aux = 0; aux < tam ; aux++){ 
            c1[aux] += k; //aumenta o valor do caracter em k (+3)
        }  
        return String.valueOf(c1);  
    }

    public static void main(String[] args) {
        int k = 3;
        String recebe = ""; 

        recebe = MyIO.readLine();
        
        do{
            MyIO.println(Ciframento(recebe,k)); 
            recebe = MyIO.readLine(); //deixa escrever

        } while (!(isFim(recebe)));
    }
}