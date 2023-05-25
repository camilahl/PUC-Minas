//babi sem os comentarios
import java.util.Scanner;

class BSTclasse {
    class no {
        int item;
        no esq, dir;

        public no(int valor) {
            item = valor;
            esq = dir = null;
        }
    }

    no raiz;

    BSTclasse() {
        raiz = null;
    }

    void removerItem(int item) {
        raiz = removerRecursivo(raiz, item);
    }

    no removerRecursivo(no raiz, int item) {
        if (raiz == null) {
            return raiz;
        }

        if (item < raiz.item) { 
            raiz.esq = removerRecursivo(raiz.esq, item);
        } else if (item > raiz.item) { 
            raiz.dir = removerRecursivo(raiz.dir, item);
        } else {
            if (raiz.esq == null) { 
                return raiz.dir;
            } else if (raiz.dir == null) {
                return raiz.esq;
            }

            raiz.item = minValor(raiz.dir);

            raiz.dir = removerRecursivo(raiz.dir, raiz.item);
        }
        return raiz;
    }

    int minValor(no raiz) {
        int minval = raiz.item;

        while (raiz.esq != null) {
            minval = raiz.esq.item;
            raiz = raiz.esq;
        }
        return minval;
    }

    void inserir(int item) {
        raiz = inserirRecursivo(raiz, item);
    }

    no inserirRecursivo(no raiz, int item) {
        if (raiz == null) {
            raiz = new no(item);
            return raiz;
        }

        if (item < raiz.item) {
            raiz.esq = inserirRecursivo(raiz.esq, item);
        } else if (item > raiz.item) {
            raiz.dir = inserirRecursivo(raiz.dir, item);
        }
        return raiz;
    }

    void printPre() {
        printPreRecursivo(raiz);
    }

    void printPreRecursivo(no raiz) {
        if (raiz != null) {
            System.out.print(raiz.item + " ");
            printPreRecursivo(raiz.esq);
            printPreRecursivo(raiz.dir);
        }
    }

    void printIn() {
        printInRecursivo(raiz);
    }

    void printInRecursivo(no raiz) {
        if (raiz != null) {
            printInRecursivo(raiz.esq);
            System.out.print(raiz.item + " ");
            printInRecursivo(raiz.dir);
        }
    }

    void printPos() {
        printPosRecursivo(raiz);
    }

    void printPosRecursivo(no raiz) {
        if (raiz != null) {
            printPosRecursivo(raiz.esq);
            printPosRecursivo(raiz.dir);
            System.out.print(raiz.item + " ");
        }
    }

    boolean pesquisar(int item) {
        raiz = pesquisarRecursivo(raiz, item);
        if (raiz != null) {
            return true;
        } else {
            return false;
        }
    }

    no pesquisarRecursivo(no raiz, int item) {
        if (raiz == null || raiz.item == item) {
            return raiz;
        }
        if (raiz.item > item) {
            return pesquisarRecursivo(raiz.esq, item);
        } else {
            return pesquisarRecursivo(raiz.dir, item);
        }
    }
}

class q8 {
    public static void main(String[] args) {
        int c = 0, n = 0, item = 0;

        BSTclasse bst = new BSTclasse();
        Scanner sc = new Scanner (System.in);

        //c = MyIO.readInt();
        //n = MyIO.readInt();
        c = sc.nextInt();
        n = sc.nextInt();

        for (int i = 0; i < c; i++) {
            for (int j = 0; j < n; j++) {
                //item = MyIO.readInt();
                item = sc.nextInt();
                bst.inserir(item);
            }

            System.out.println("Case " + c + ":");
            System.out.print("Pré.: ");
            bst.printPre();
            System.out.println();

            System.out.print("In..: ");
            bst.printIn();
            System.out.println();

            System.out.print("Pós.: ");
            bst.printPos();
        }

        sc.close();
    }
}