#include <iostream>
using namespace std;

class pessoa {
private: 
  int codigo;
  char nome[30];
  int idade;
  char endereco[30];
  int numero;
  char complemento[30];

public:
  void getInformacoes(){
    cout << "\ndigite seu código: ";
    cin >> codigo;
    
    cout << "\ndigite seu nome: ";
    cin >> nome;
    
    cout << "\ndigite seu endereço: ";
    cin >> endereco;

    cout << "\ndigite seu número: ";
    cin >> numero;

    cout << "\ndigite seu complemento: ";
    cin >> complemento;

    //pra imprimir na tela
    cout << "código: " << codigo;
    cout << "\nnome: " << nome;
    cout << "\nendereço: " << endereco;
    cout << "\nnúmero: " << numero;
    cout << "\ncomplemento: " << complemento;
  }
};

int main(void){
  pessoa p[10];
  for (int i=0; i<10; i++){
    cout << "\npessoa " << (i+1) << ":";
    p[i].getInformacoes();
  }
}
