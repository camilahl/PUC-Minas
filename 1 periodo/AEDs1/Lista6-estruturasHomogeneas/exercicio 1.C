#include <stdio.h> 
int sum = 0; //sum= soma
int rep = 0, app = 0; //rep= reprovados, app= aprovados

void notas(int v[10], int n) {
  for(int i=0; i < n; i++) {
    printf("digite a nota do aluno %d: ",i+1); //i+1 é para nao começar no aluno 0
    scanf("%d",&v[i]);
    sum += v[i];
  }
}

void media(int v[10],int n){
  int me;
  me = sum/n;
  printf("\na media das notas dos alunos é: %d\n",me);
  for(int j = 0; j < n; j++){ //isso aqui é para saber se a pessoa foi aprovada ou reprovada
    if(v[j] < me) {
      rep++;
    } else {
      app++;
    }
  }
}

int main (void){
  int n=10; //n= numero alunos
  int v[10];
  //chama os dois procedimentos 
  notas(v,n);
  media(v,n);
  //coloca os app e os rep aqui, ao inves do procedimento, para ficar organziadao bonito no final do codigo
  printf("\n%d alunos foram aprovados\n",app);
  printf("%d alunos foram reprovados.\n",rep);
}
