import java.io.*;
import java.util.*;
import java.text.SimpleDateFormat;

 class Games {
    // atributos da classe
    private int app_id;
    private int age;
    private int avg_pt;
    private int dlcs;
    private Date release_date;
    private String name;
    private String owners;
    private String website;
    private String developers;
    private String[] languages;
    private String[] genres;
    private float price;
    private float upvotes;
    private boolean windows;
    private boolean mac;
    private boolean linux;

    // Construtores
    Games() {
        app_id = 0;
        name = "";
        release_date = null;
        owners = "";
        age = 0;
        price = 0;
        dlcs = 0;
        languages = null;
        website = "";
        windows = true;
        mac = true;
        linux = true;
        upvotes = 0;
        avg_pt = 0;
        developers = "";
        genres = null;
    }


    SimpleDateFormat formataador = new SimpleDateFormat("MMM/yyyy", Locale.US);

    public void setName(String name) { 
        this.name = name; 
    }
    public String getName() { 
        return this.name; 
    }
    
    public void setOwners(String owners) { 
        this.owners = owners;
    }
    public String getOwners() { 
        return this.owners;
    }
    
    public void setWebsite(String website) { 
        this.website = website;
    }
    public String getWebsite() { 
        return this.website;
    }
    
    public void setDevelopers(String developers) { 
        this.developers = developers;
    }
    public String getDevelopers() { 
        return this.developers;
    }
    
    public String getDate() {
        return formataador.format(this.release_date); 
    }
    public void setDate(Date release_date) {
        this.release_date = release_date;
    }
    
    public void setAppId(int app_id) { 
        this.app_id = app_id; 
    }
    public int getAppId() { 
        return this.app_id; 
    }
    
    public void setAge(int age) { 
        this.age = age;
    }
    public int getAge() { 
        return this.age;
    }
    
    public void setDlcs(int dlcs) { 
        this.dlcs = dlcs;
    }
    public int getDlcs() { 
        return this.dlcs;
    }
    
    public int getAvg_pt() {
        return this.avg_pt;
    }
    public void setAvg_pt(int avg_pt) {
        this.avg_pt = avg_pt;
    }
    
    public void setPrice(float price) { 
        this.price = price;
    }
    public float getPrice() { 
        return this.price; 
    }

    public float getUpVotes() {
        return this.upvotes;
    }
    public void setUpVotes(float upvotes) {
        this.upvotes = upvotes;
    }
    
    public void setWindows(boolean windows) { 
        this.windows = windows; 
    }
    public boolean getWindows() { 
        return this.windows; 
    }
    
    public void setMac(boolean mac) { 
        this.mac = mac; 
    }
    public boolean getMac() { 
        return this.mac; 
    }

    public void setLinux(boolean linux) { 
        this.linux = linux; 
    }
    public boolean getLinux() { 
        return this.linux; 
    }

    public String[] getLanguages() { 
        return this.languages;
    }
    public void setLanguages(String[] languages) { 
        this.languages = languages;
    }

    public String[] getGenres() { 
        return this.languages; 
    }
    public void setGenres(String[] genres) {
        this.genres = genres; 
    }

    void imprimirPrice() {
        System.out.format(Locale.US, "%.2f ", this.price);
    }

    void imprimirLinguas() {
        System.out.print("[");
        if (languages.length == 1)
            System.out.print(languages[0].replaceAll("[\\[\\]']", "") + "] ");
        else {
            for (int i = 1; i < languages.length - 1; i++)
                System.out.print(languages[i] + ", ");

            System.out.print(languages[languages.length - 1] + "] ");
        }
    }

    void imprimirWebSite() {
        if(this.website.isEmpty()){
            System.out.print("null ");
        }else{
            System.out.print(this.website + " ");
        }
    }

    void imprimirUpVotes() {
        System.out.print((int) Math.round(this.upvotes * 100) + "% ");
    }

    void imprimirAVG() {
        int horasContadas = this.avg_pt / 60, minutosPassados = this.avg_pt % 60;
        if (horasContadas == 0 && minutosPassados == 0)
            System.out.print("null ");
        else
        if(horasContadas > 0)
            System.out.print(horasContadas + "h ");
        else
            System.out.print(horasContadas + "");
        
        if(minutosPassados > 0)
            System.out.print("m ");
        else
            System.out.print("");
    }

    void imprimirGeneros() {
        System.out.print("[");
        if (genres.length == 1)
            System.out.print(genres[0].replace("\"", "") + "]\n");
        else {
            System.out.print(genres[0].replace("\"", "") + ", ");
            for (int i = 1; i < genres.length - 1; i++)
                System.out.print(genres[i] + ", ");
            System.out.print(genres[genres.length - 1].replace("\"", "") + "]\n");
        }
    }

    void imprimir() {
        System.out.printf("%d %s %s %s %d ", this.app_id, this.name, formataador.format(this.release_date), this.owners, this.age);
        imprimirPrice();
        System.out.print(this.dlcs + " ");
        imprimirLinguas();
        imprimirWebSite();
        System.out.printf("%b %b %b ", this.windows, this.mac, this.linux);
        imprimirUpVotes();
        imprimirAVG();
        System.out.print(this.developers.replace("\"", "") + " ");
        imprimirGeneros();
    }
}

class Celula {
	public Games elemento; // Elemento inserido na celula.
	public Celula prox; // Aponta a celula prox.


	/**
	 * Construtor da classe.
	 */
	public Celula() {
        // this(0);
    }

	/**
	 * Construtor da classe.
	 * @param elemento int inserido na celula.
	 */
	public Celula(Games elemento) {
      this.elemento = elemento;
      this.prox = null;
	}
}

class Lista {
	private Celula primeiro;
	private Celula ultimo;

	/**
	 * Construtor da classe que cria uma lista sem elementos (somente no cabeca).
	 */
	public Lista() {
		primeiro = new Celula();
		ultimo = primeiro;
	}


	/**
	 * Insere um elemento na primeira posicao da lista.
    * @param x int elemento a ser inserido.
	 */
	public void inserirInicio(Games x) {
		Celula tmp = new Celula(x);
      tmp.prox = primeiro.prox;
		primeiro.prox = tmp;
		if (primeiro == ultimo) {                 
			ultimo = tmp;
		}
      tmp = null;
	}


	/**
	 * Insere um elemento na ultima posicao da lista.
    * @param x int elemento a ser inserido.
	 */
	public void inserirFim(Games x) {
		ultimo.prox = new Celula(x);
		ultimo = ultimo.prox;
	}


	/**
	 * Remove um elemento da primeira posicao da lista.
    * @return resp int elemento a ser removido.
	 * @throws Exception Se a lista nao contiver elementos.
	 */
	public Games removerInicio() throws Exception {
		if (primeiro == ultimo) {
			throw new Exception("Erro ao remover (vazia)!");
		}

        Celula tmp = primeiro;
		primeiro = primeiro.prox;
		Games resp = primeiro.elemento;
        tmp.prox = null;
        tmp = null;
		return resp;
	}


	/**
	 * Remove um elemento da ultima posicao da lista.
    * @return resp int elemento a ser removido.
	 * @throws Exception Se a lista nao contiver elementos.
	 */
	public Games removerFim() throws Exception {
		if (primeiro == ultimo) {
			throw new Exception("Erro ao remover (vazia)!");
		} 

		// Caminhar ate a penultima celula:
      Celula i;
      for(i = primeiro; i.prox != ultimo; i = i.prox);

      Games resp = ultimo.elemento; 
      ultimo = i; 
      i = ultimo.prox = null;
      
		return resp;
	}


	/**
    * Insere um elemento em uma posicao especifica considerando que o 
    * primeiro elemento valido esta na posicao 0.
    * @param x int elemento a ser inserido.
	 * @param pos int posicao da insercao.
	 * @throws Exception Se <code>posicao</code> invalida.
	 */
   public void inserir(Games x, int pos) throws Exception {
    
      int tamanho = tamanho();

      if(pos < 0 || pos > tamanho){
			throw new Exception("Erro ao inserir posicao (" + pos + " / tamanho = " + tamanho + ") invalida!");
      } else if (pos == 0){
         inserirInicio(x);
      } else if (pos == tamanho){
         inserirFim(x);
      } else {
		   // Caminhar ate a posicao anterior a insercao
         Celula i = primeiro;
         for(int j = 0; j < pos; j++, i = i.prox);
		
         Celula tmp = new Celula(x);
         tmp.prox = i.prox;
         i.prox = tmp;
         tmp = i = null;
      }
   }


	/**
    * Remove um elemento de uma posicao especifica da lista
    * considerando que o primeiro elemento valido esta na posicao 0.
	 * @param posicao Meio da remocao.
    * @return resp int elemento a ser removido.
	 * @throws Exception Se <code>posicao</code> invalida.
	 */
	public Games remover(int pos) throws Exception {
        Games resp;
        int tamanho = tamanho();

		if (primeiro == ultimo){
		    throw new Exception("Erro ao remover (vazia)!");

        } else if(pos < 0 || pos >= tamanho){
			throw new Exception("Erro ao remover (posicao " + pos + " / " + tamanho + " invalida!");
      } else if (pos == 0){
         resp = removerInicio();
      } else if (pos == tamanho - 1){
         resp = removerFim();
      } else {
		   // Caminhar ate a posicao anterior a insercao
         Celula i = primeiro;
         for(int j = 0; j < pos; j++, i = i.prox);
		
         Celula tmp = i.prox;
         resp = tmp.elemento;
         i.prox = tmp.prox;
         tmp.prox = null;
         i = tmp = null;
      }

		return resp;
	}

	/**
	 * Mostra os elementos da lista separados por espacos.
	 */
	public void mostrar() {
        int cont = 0;
		// System.out.print("[ ");
		for (Celula i = primeiro.prox; i != null; i = i.prox) {
            System.out.print("[" + cont + "] ");
			i.elemento.imprimir();
            cont++;
		}
		// System.out.println("] ");
	}

	/**
	 * Procura um elemento e retorna se ele existe.
	 * @param x Elemento a pesquisar.
	 * @return <code>true</code> se o elemento existir,
	 * <code>false</code> em caso contrario.
	 */
	public boolean pesquisar(Games x) {
		boolean resp = false;
		for (Celula i = primeiro.prox; i != null; i = i.prox) {
         if(i.elemento == x){
            resp = true;
            i = ultimo;
         }
		}
		return resp;
	}

	/**
	 * Calcula e retorna o tamanho, em numero de elementos, da lista.
	 * @return resp int tamanho
	 */
   public int tamanho() {
      int tamanho = 0; 
      for(Celula i = primeiro; i != ultimo; i = i.prox, tamanho++);
      return tamanho;
   }
}

class q1 {
    
    public static boolean isFim(String s) {
        return (s.length() == 3 && s.charAt(0) == 'F' && s.charAt(1) == 'I' && s.charAt(2) == 'M');
    }

    public static void main(String[] args) throws Exception {
        String[] entrada = new String[1000]; 
        String[] entradaTosplit = new String[1000]; 
        Lista list = new Lista();
        String command = "", pos = "", aux = "";
        Scanner scanner = new Scanner(new File("/tmp/games.csv"));
        Scanner sc = new Scanner(System.in, "UTF-8");

        int n = 0, x = 0, count = 0, qtd = 0;// COUNT
        Games[] obj = new Games[4403];
        ;
        while (scanner.hasNext()) {
            obj[count] = new Games();

            String[] lineFilter = scanner.nextLine().trim().split(",(?=(?:[^\"]*\"[^\"]*\")*[^\"]*$)");
            obj[count].setAppId(Integer.parseInt(lineFilter[0]));
            obj[count].setName(lineFilter[1]);
            String dateFormate = lineFilter[2].replace("\"", "");
            String date = dateFormate.substring(0, 3) + "/" + dateFormate.substring(dateFormate.length() - 4, dateFormate.length());
            obj[count].setDate((new SimpleDateFormat("MMM/yyyy", Locale.US).parse(date)));
            obj[count].setOwners(lineFilter[3]);
            obj[count].setAge(Integer.parseInt(lineFilter[4]));
            obj[count].setPrice(Float.parseFloat(lineFilter[5]));
            obj[count].setDlcs(Integer.parseInt(lineFilter[6]));
            obj[count].setLanguages(lineFilter[7].split("(\"\\[')|(', ')|('\\]\")"));
            obj[count].setWebsite(lineFilter[8]);
            obj[count].setWindows(Boolean.valueOf(lineFilter[9]));
            obj[count].setMac(Boolean.valueOf(lineFilter[10]));
            obj[count].setLinux(Boolean.valueOf(lineFilter[11]));
            obj[count].setUpVotes(Float.parseFloat(lineFilter[12])/(Float.parseFloat(lineFilter[12]) + Float.parseFloat(lineFilter[13])));
            obj[count].setAvg_pt(Integer.parseInt(lineFilter[14]));
            obj[count].setDevelopers(lineFilter[15]);
            obj[count].setGenres((lineFilter.length > 16) ? lineFilter[16].split(",") : null);
            count++;
        }
        scanner.close();

        do {
            entrada[n] =  sc.nextLine();
        } while (!(isFim(entrada[n++]))); 
        n--; // remove o FIM

        for (int i = 0; i < n; i++) {
            for (int u = 0; u < obj.length; u++) {
                if (Integer.parseInt(entrada[i]) == obj[u].getAppId()) {
                    list.inserirFim(obj[u]);
                }
            }
        }

        qtd = Integer.parseInt( sc.nextLine());
        do {
            entradaTosplit[x] = sc.nextLine();
            x++;
        } while (qtd > x);

        for (int i = 0; i < x; i++) {
            command = entradaTosplit[i].substring(0, 2);
            if (command.equals("II")) {
                aux = entradaTosplit[i].substring(3);
                for (int l = 0; l < count; l++) {
                    if (Integer.parseInt(aux) == obj[l].getAppId())
                        list.inserirInicio(obj[l]);
                }
            } else if (command.equals("IF")) {
                aux = entradaTosplit[i].substring(3);
                for (int a = 0; a < count; a++) {
                    if (Integer.parseInt(aux) == obj[a].getAppId()) 
                        list.inserirFim(obj[a]);
                }
            } else if (command.equals("I*")) {
                aux = entradaTosplit[i].substring(6);
                pos = entradaTosplit[i].substring(3, 5);

                for (int j = 0; j < count; j++) {
                    if (Integer.parseInt(aux) == obj[j].getAppId()) {
                        list.inserir(obj[j], Integer.parseInt(pos));
                    }
                }

            } else if (command.equals("RF")) {
                System.out.println("(R) " + list.removerFim().getName());

            } else if (command.equals("RI")) {
                System.out.println("(R) " + list.removerInicio().getName());

            } else if (command.equals("R*")) {
                pos = entradaTosplit[i].substring(3, 5);
                System.out.println("(R) " + list.remover(Integer.parseInt(pos)).getName());
            }
        }

        list.mostrar();
        sc.close();
    }
}