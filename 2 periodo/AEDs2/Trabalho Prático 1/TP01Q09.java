/*
Faça um programa que leia um número inteiro n indicando o número de
valores reais que devem ser lidos e salvos sequencialmente em um arquivo texto. Após a leitura
dos valores, devemos fechar o arquivo. Em seguida, reabri-lo e fazer a leitura de trás para frente
usando os métodos getFilePointer e seek da classe RandomAccessFile e mostre todos os valores
lidos na tela. Nessa questão, você não pode usar, arrays, strings ou qualquer estrutura de dados.
A entrada padrão é composta por um número inteiro n e mais n números reais. A saı́da padrão
corresponde a n números reais mostrados um por linha de saı́da.
*/

import java.io.RandomAccessFile;

class TP01Q09 {
    public static void main(String[] args) throws Exception {
        int qntd = 0;
        double n = 0;

        qntd = MyIO.readInt(); //digita quantidade de numeros

        RandomAccessFile raf = new RandomAccessFile("arquivo.txt", "rw"); //inicia o random access file como leitura e escrita

        for (int i=0; i<qntd; i++) {
            n = MyIO.readDouble(); //digita os numeros
            raf.writeDouble(n); //o método write foi utilizado para "escrever" os numeros
        }   
        raf.close(); //fecha o arquivo

        raf = new RandomAccessFile("arquivo.txt", "r"); //abre o random access file como modo leitura
        double numero = 0; //criou outra variável para leitura ao contrário 

        for (int i=qntd-1; i>=0; i--) { //pra nao contar o numero da quantidade no comeco
            raf.seek(i*8); //busca o numero na posição 'i' multiplicado por 8 (numero de bytes de um double)
            numero = raf.readDouble(); //le o double na posição indicada
            if(numero == (int)numero){ //tratamento para que, caso o numero seja um inteiro sem casas decimais, nao seja colocado um .0 ao final 
                MyIO.println((int)numero); 
            }else{
                MyIO.println(numero); 
            }
        }
        raf.close(); //fecha o arquivo
    }
}