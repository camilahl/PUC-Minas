#include <stdio.h>

int main(void) {
  int v=1, cand1=0, cand2=0, cand3=0, cand4=0, vb=0, vn=0, total=0; //v= voto, cand= candidato, vb= voto em branco, vn= voto nulo, total= total de votos
  while (v != 0) {
    printf ("\nDigite o seu voto: \n");
    scanf ("%d", &v);
    if (v == 1) {
      cand1++;
    } else if (v == 2) {
      cand2++;
    } else if (v == 3) {
      cand3++;
    } else if (v == 4) {
      cand4++;
    } else if (v == 5) {
      vn++;
    } else if (v == 6) {
      vb++;
    } else {
      printf ("Voto Inválido\n\n");  
    }
  }
  total = cand1 + cand2 + cand3 + cand4 + vb + vn;
  
  printf ("\nVotos Candidato 1: %d\n", cand1);
  printf ("Votos Candidato 2: %d\n", cand2);
  printf ("Votos Candidato 3: %d\n", cand3);
  printf ("Votos Candidato 4: %d\n", cand4);
  printf ("Votos Nulo: %d\n", vn);
  printf ("Votos em Branco: %d\n", vb);
  printf ("\nTotal de Votos: %d\n", total);
}
