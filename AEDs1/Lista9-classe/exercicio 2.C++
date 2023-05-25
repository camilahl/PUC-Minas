#include <iostream>
#include <string.h>

class pessoa {
private:
  char nome[30];
  char sobrenome[30];

public:
  //construtor
  pessoa (char *novonome, char *novosobrenome){
    strcpy(this->nome, novonome);
    strcpy(this->sobrenome, novosobrenome);
  }
  char getNomeCompleto() {
    std::cout << nome << "" << sobrenome;
  }
};

class funcionario: public pessoa {
private:
  int matricula;
  double salario;

public:
  //construtor
  //coloca * so em char
  funcionario (char *novonome, char *novosobrenome, int mat, double sa) : pessoa (novonome, novosobrenome) {
    matricula = mat;
    if (sa > 0) salario = sa; 
  }
  double getSalarioPrimeiraParcela(double salario) {
    double parcelaum = salario * 0.6;
    return parcelaum;
  }
  double getSalarioSegundaParcela(double salario) {
    double parceladois = salario * 0.4;
    return parceladois;
  }
};

class professor: public funcionario {
  public:
  professor (char *novonome, char *novosobrenome, int mat, double sa) : funcionario (novonome, novosobrenome, mat, sa) {}
  double getSalarioPrimeiraParcela(double salario){
    return salario;
  }
  double getSalarioSegundaParcela(double salario) {
    return 0;
  }
};

int main(void){
  funcionario p("lucas", "silva", 0000, 3000);
}
