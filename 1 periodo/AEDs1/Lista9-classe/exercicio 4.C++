#include <iostream>
using namespace std;

class pessoa{
private: 
  char nome[30];
  int dia;
  int mes;

public: 
  void getInformacoes(){
    cout << "\ndigite seu nome: ";
    cin >> nome;

    cout << "digite seu dia de aniversário: ";
    cin >> dia;

    cout << "digite seu mês de aniversário: ";
    cin >> mes;
  }

  int getMes(){
    return mes;
  }

  void info(){
    cout << "-" << nome << ", no dia " << dia << "\n";
  }
};

int main() {
  int n = 3;
  pessoa p[n];
  for (int i=0; i<n; i++){
    cout << "\npessoa " << (i+1) << ":";
    p[i].getInformacoes();
  }
  for (int m = 1; m <= 12; m++) {
    printf("\naniversariantes do mês %d:\n", m);
    for (int i = 0; i < n; i++) {
      if (m == p[i].getMes())
        p[i].info();
    }
  }
}
