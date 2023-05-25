#include <iostream>
using namespace std;

class eletrodomestico{
private: 
  char nome[30];
  double preco;
  int telefone;

public:
  void getInfo(){
    cout << "\ndigite o nome da loja: ";
    cin >> nome;

    cout << "digite o telefone: ";
    cin >> telefone;

    cout << "digite o preço do eletrodoméstico: ";
    cin >> preco;
  }

  double getPreco(){
    return preco;
  }

  void getMedia(){
    cout << "\na loja " << nome << ", de telefone " << telefone << " está abaixo da média de preços";
  }
};

int main() {
  int soma=0;
  int media;
  int e=3;
  eletrodomestico eletro[e];
  for (int i=0; i<e; i++){
    cout << "\npessoa " << (i+1) << ":"; eletro[i].getInfo();
  }
  for (int i=0; i<e; i++){
    soma += eletro[i].getPreco();
  }
  media = soma/e;
  cout << "\n" << "a média do preço dos eletrodomésticos é: " << media;
  for (int i=0; i<e; i++){
    if (eletro[i].getPreco() < media) {
      eletro[i].getMedia();
    }
  }
}
