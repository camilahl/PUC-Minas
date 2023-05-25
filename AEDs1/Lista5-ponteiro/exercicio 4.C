#include <stdio.h> 

int main() 
{ 
    int x, *p, **q; 
    p = &x; 
    q = &p; 
    x = 10; 
    printf("\n%d\n", **q); 
    return(0);  
} 

//para resolver o erro basta trocar o &q (endereço de q) por **q (que faz referência ao p, que faz referência ao x, que é o valor), ou seja, o & imprime o endereço do ponteiro, não o seu valor
