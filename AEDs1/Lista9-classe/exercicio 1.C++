#include <iostream>

class equipamento {
private:
  bool ligado = false; //atributo - pra comecar desligado

public:
  void liga() { //método
    ligado = true;
    printf("ligado\n");
  }
  void desliga() { //método
    ligado = false;
    printf("desligado\n");
  }
};

class equipamentoSonoro: public equipamento{
private:
  short volume=0; //atributo
  bool stereo = false; //atributo
public:
  void mono() {
    stereo = false;
    printf("stereo desligado\n");
  }

  void estereo() { 
    stereo = true;
    printf("stereo ligado\n");
  } 

  short getVolume() {
    return volume;
    printf("volume\n");
  }

  void setVolume(int x) { //coloca o trem que qr substituir no volume
    volume = x; //substitui
    printf("volume = %d\n", x);
  }

  void liga() {
    volume = 5;
    printf("ligado com volume 5\n");
  }
};

int main(){
  equipamento equi;
  equi.liga();
  equi.desliga();
  equipamentoSonoro equison;
  equison.mono();
  equison.estereo();
  equison.getVolume();
  equison.setVolume(7);
  equison.liga();
}
//colocou os printf so pra testar mas na prova nao precisa
