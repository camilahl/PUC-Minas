import java.util.Scanner;

class Celula {
   public int elemento;
   public Celula inf, sup, esq, dir;

   public Celula() {
      this(0, null, null, null, null);
   }

   public Celula(int elemento) {
      this(elemento, null, null, null, null);
   }

   public Celula(int elemento, Celula inf, Celula sup, Celula esq, Celula dir) {
      this.elemento = elemento;
      this.inf = inf;
      this.sup = sup;
      this.esq = esq;
      this.dir = dir;
   }
}

class Matriz {
   private Celula inicio;
   private int linha, coluna;

   public Matriz() {
      this(3, 3);
   }

   public Matriz(int linha, int coluna) {
      this.linha = linha;
      this.coluna = coluna;

      this.inicio = new Celula();

      Celula tmp = this.inicio;
      for (int i = 1; i < this.linha; i++) {
         tmp.inf = new Celula();
         tmp.inf.sup = tmp;
         tmp = tmp.inf;
      }
      tmp = null;

      for (int i = 0; i < this.linha; i++) {
         tmp = this.inicio;
         for (int j = 0; j < i; j++) {
            tmp = tmp.inf;
         }

         for (int k = 1; k < this.coluna; k++) {
            tmp.dir = new Celula();
            tmp.dir.esq = tmp;
            tmp = tmp.dir;
         }
      }
      tmp = null;

      if (this.linha > 1) {
         tmp = this.inicio.inf;
         for (int i = 1; i < this.linha; i++) {
            Celula superior = tmp.sup;
            Celula inferior = tmp;

            while (superior != null && inferior != null) {
               superior.inf = inferior;
               inferior.sup = superior;

               superior = superior.dir;
               inferior = inferior.dir;
            }

            tmp = tmp.inf;
         }
      }
   }

   public Matriz soma(Matriz x) {
      Matriz resp = new Matriz(x.linha, x.coluna);
      Celula a = resp.inicio;
      for (int i = 0; i < this.linha; i++) {
         Celula b = a;
         for (int j = 0; j < this.coluna; j++) {
            b.elemento = somar(this, x, j, i);

            b = b.dir;
         }
         a = a.inf;
      }

      return resp;
   }

   private int somar(Matriz a, Matriz b, int x, int y) {
      int soma;
      Celula c = a.inicio;
      Celula d = b.inicio;

      for (int i = 0; i < x; i++) {
         c = c.dir;
         d = d.dir;
      }

      for (int i = 0; i < y; i++) {
         c = c.inf;
         d = d.inf;
      }

      soma = c.elemento + d.elemento;

      return soma;
   }

   public Matriz multiplicacao(Matriz x) {
      Matriz resp = new Matriz(x.linha, x.coluna);
      Celula a = resp.inicio;
      int i = 0;
      while (a != null && i < this.linha) {
         Celula b = a;
         int j = 0;
         while (b != null && j < this.coluna) {
            b.elemento = multiplicar(this, x, i, j);
            b = b.dir;
            j++;
         }
         a = a.inf;
         i++;
      }

      return resp;
   }

   private int multiplicar(Matriz a, Matriz b, int x, int y) {
      int multiplicacao = 0;
      Celula c = a.inicio;
      Celula d = b.inicio;

      for (int i = 0; i < x; i++) {
         c = c.inf;
      }

      for (int i = 0; i < y; i++) {
         d = d.dir;
      }

      int e, f;
      while (c != null && d != null) {
         e = c.elemento;
         f = d.elemento;
         multiplicacao += e * f;
         c = c.dir;
         d = d.inf;
      }

      return multiplicacao;
   }

   public void mostrarDiagonalPrincipal() {
      if (this.linha == this.coluna) {
         Celula i = inicio;
         while (i != null) {
            System.out.print(i.elemento + " ");

            i = i.dir;
            if (i != null) {
               i = i.inf;
            }
         }
         System.out.println("");
      }
   }

   public void mostrarDiagonalSecundaria() {
      if (this.linha == this.coluna) {
         Celula i;

         for (i = inicio; i.dir != null; i = i.dir)
            ;

         while (i != null) {
            System.out.print(i.elemento + " ");
            i = i.inf;
            if (i != null) {
               i = i.esq;
            }
         }
         System.out.println("");
      }
   }

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int numOperacoes = sc.nextInt();
      for (int i = 0; i < numOperacoes; i++) {
         int linhas = sc.nextInt();
         int colunas = sc.nextInt();
         Matriz matriz1 = new Matriz(linhas, colunas);
         for (Celula aux = matriz1.inicio; aux != null; aux = aux.inf) {
            for (Celula aux2 = aux; aux2 != null; aux2 = aux2.dir) {
               aux2.elemento = sc.nextInt();
            }
         }

         linhas = sc.nextInt();
         colunas = sc.nextInt();
         Matriz matriz2 = new Matriz(linhas, colunas);
         for (Celula aux = matriz2.inicio; aux != null; aux = aux.inf) {
            for (Celula aux2 = aux; aux2 != null; aux2 = aux2.dir) {
               aux2.elemento = sc.nextInt();
            }
         }

         Matriz soma = matriz1.soma(matriz2);

         Matriz multiplicacao = matriz1.multiplicacao(matriz2);

         matriz1.mostrarDiagonalPrincipal();
         matriz1.mostrarDiagonalSecundaria();
         for (Celula aux = soma.inicio; aux != null; aux = aux.inf) {
            for (Celula aux2 = aux; aux2 != null; aux2 = aux2.dir) {
               System.out.print(aux2.elemento + " ");
            }
            System.out.println("");
         }
         for (Celula aux = multiplicacao.inicio; aux != null; aux = aux.inf) {
            for (Celula aux2 = aux; aux2 != null; aux2 = aux2.dir) {
               System.out.print(aux2.elemento + " ");
            }
            System.out.println("");
         }
      }
      sc.close();
   }
}