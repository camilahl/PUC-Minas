import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

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

    //construtor vazio: apenas inicia a classe sem nenhum valor atribuído
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

    //métodos set e get para todos os atributos
    public void setAppId(int app_id){
        this.app_id = app_id; //ponteiro para ele mesmo, separando o que eh meu e o que veio
    }
    public int getAppId(){ //get retorna o tipo de negocio que vai retornar
        return this.app_id;
    }
    //----------------------------------------------------------------------------------------------------------

    public void setAge(int age){
        this.age = age; 
    }
    public int getAge(){ 
        return this.age;
    }
    //----------------------------------------------------------------------------------------------------------

    public void setDlcs(int dlcs){
        this.dlcs = dlcs; 
    }
    public int getDlcs(){ 
        return this.dlcs;
    }
    //----------------------------------------------------------------------------------------------------------

    public void setAvgPt(int avg_pt){
        this.avg_pt = avg_pt; 
    }
    public int getAvgPt(){ 
        return this.avg_pt;
    }
    //----------------------------------------------------------------------------------------------------------

    public void setName(String name){
        this.name = name; 
    }
    public String getName(){ 
        return this.name;
    }
    //----------------------------------------------------------------------------------------------------------
    
    public void setOwners(String owners){
        this.owners = owners; 
    }
    public String getOwners(){ 
        return this.owners;
    }
    //----------------------------------------------------------------------------------------------------------
    
    public void setWebsite(String website){
        this.website = website; 
    }
    public String getWebsite(){ 
        return this.website;
    }
    //----------------------------------------------------------------------------------------------------------
   
    public void setDevelopers(String developers){
        this.developers = developers; 
    }
    public String getDevelopers(){ 
        return this.developers;
    }
    //----------------------------------------------------------------------------------------------------------
   
    public void setReleaseDate(Date release_date){
        this.release_date = release_date; 
    }
    public Date getReleaseDate(){ 
        return this.release_date;
    }
    //----------------------------------------------------------------------------------------------------------
   
    public void setPrice(float price){
        this.price = price; 
    }
    public float getPrice(){ 
        return this.price;
    }
    //----------------------------------------------------------------------------------------------------------
    
    public void setUpvotes(float upvotes){
        this.upvotes = upvotes; 
    }
    public float getUpvotes(){ 
        return this.upvotes;
    }
    //----------------------------------------------------------------------------------------------------------
    
    public void setWindows(boolean windows){
        this.windows = windows; 
    }
    public boolean getWindows(){ 
        return this.windows;
    }
    //----------------------------------------------------------------------------------------------------------
    
    public void setMac(boolean mac){
        this.mac = mac; 
    }
    public boolean getMac(){ 
        return this.mac;
    }
    //----------------------------------------------------------------------------------------------------------
    
    public void setLinux(boolean linux){
        this.linux = linux; 
    }
    public boolean getLinux(){ 
        return this.linux;
    }
    //----------------------------------------------------------------------------------------------------------
    
    public void setLanguages(String[] languages){
        this.languages = languages; 
    }
    public String[] getlanguages(){ 
        return this.languages;
    }
    //----------------------------------------------------------------------------------------------------------
    
    public void setGenres(String[] genres){
        this.genres = genres; 
    }
    public String[] getGenres(){ 
        return this.genres;
    }
    //----------------------------------------------------------------------------------------------------------

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
        else if(horasContadas > 0){
            System.out.print(horasContadas + "h ");
        }else{
            System.out.print(horasContadas + "");

        }
        if(minutosPassados > 0){
            System.out.print("m ");
        }else{
            System.out.print("");

        }
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
        
        System.out.printf("%d %s %s %s %d ", this.app_id, this.name, formataador.format(this.release_date), this.owners,
                this.age);
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

    public Games clone(){
        Games temp = new Games();
        temp.app_id = this.app_id;
        temp.age = this.age;
        temp.avg_pt = this.avg_pt;
        temp.dlcs = this.dlcs;
        temp.release_date = this.release_date;
        temp.name = this.name;
        temp.owners = this.owners;
        temp.website = this.website;
        temp.developers = this.developers;
        temp.languages = this.languages;
        temp.genres = this.genres;
        temp.price = this.price;
        temp.upvotes = this.upvotes;
        temp.windows = this.windows;
        temp.mac = this.mac;
        temp.linux = this.linux;
        return temp;
    }
}


class Lista {
    private Games[] array;
    private int n;

    //Construtor da classe.
    //@param tamanho Tamanho da lista.
    public Lista(){
        this(1000);
    }

    public Lista (int tamanho){
        array = new Games[1000];
        n = 0;
    }

    // Insere um elemento na primeira posicao da lista e move os demais elementos para o fim da lista.
    // @param x int elemento a ser inserido.
    // @throws Exception Se a lista estiver cheia.

    public void inserirInicio(Games x) throws Exception {

        //validar insercao
        if(n >= array.length){
            throw new Exception("Erro ao inserir!");
        } 

        //levar elementos para o fim do array
        for(int i = n; i > 0; i--){
            array[i] = array[i-1];
        }

        array[0] = x;
        n++;
    }

    // Insere um elemento na ultima posicao da lista.
    // @param x int elemento a ser inserido.
    // @throws Exception Se a lista estiver cheia.

    public void inserirFim(Games x) throws Exception {

        //validar insercao
        if(n >= array.length){
            throw new Exception("Erro ao inserir!");
        }

        array[n] = x;
        n++;
    }

    // Insere um elemento em uma posicao especifica e move os demais elementos para o fim da lista.
    // @param x int elemento a ser inserido.
    // @param pos Posicao de insercao.
    // @throws Exception Se a lista estiver cheia ou a posicao invalida.

    public void inserir(Games x, int pos) throws Exception {

        //validar insercao
        if(n >= array.length || pos < 0 || pos > n){
            throw new Exception("Erro ao inserir!");
        }

        //levar elementos para o fim do array
        for(int i = n; i > pos; i--){
            array[i] = array[i-1];
        }

        array[pos] = x;
        n++;
    }

    //Remove um elemento da primeira posicao da lista e movimenta os demais elementos para o inicio da mesma.
    // @return resp int elemento a ser removido.
    // @throws Exception Se a lista estiver vazia.

    public String removerInicio() throws Exception {

        //validar remocao
        if (n == 0) {
            throw new Exception("Erro ao remover!");
        }

        String resp = array[0].getName();
        n--;

        for(int i = 0; i < n; i++){
            array[i] = array[i+1];
        }

        return resp;
    }


    //Remove um elemento da ultima posicao da lista.
    // @return resp int elemento a ser removido.
    // @throws Exception Se a lista estiver vazia.

    public String removerFim() throws Exception {

        //validar remocao
        if (n == 0) {
            throw new Exception("Erro ao remover!");
        }

        return array[--n].getName();
    }


    //Remove um elemento de uma posicao especifica da lista e movimenta os demais elementos para o inicio da mesma.
    // @param pos Posicao de remocao.
    // @return resp int elemento a ser removido.
    // @throws Exception Se a lista estiver vazia ou a posicao for invalida.

    public String remover(int pos) throws Exception {

        //validar remocao
        if (n == 0 || pos < 0 || pos >= n) {
            throw new Exception("Erro ao remover!");
        }

        String resp = array[pos].getName();
        n--;

        for(int i = pos; i < n; i++){
            array[i] = array[i+1];
        }

        return resp;
    }


    // Mostra os elementos da lista separados por espacos.
    public void mostrar (){
        for(int i = 0; i < n; i++){
            array[i].imprimir();
            //System.out.print(array[i] + " ");
        }
    }

    // Algoritmo de ordenacao Mergesort.
    public void sort() {
        mergesort(0, n-1);
    }

    // Algoritmo de ordenacao Mergesort.
    // @param int esq inicio do array a ser ordenado
    // @param int dir fim do array a ser ordenado
    private void mergesort(int esq, int dir) {
        if (esq < dir){
            int meio = (esq + dir) / 2;
            mergesort(esq, meio);
            mergesort(meio + 1, dir);
            intercalar(esq, meio, dir);
        }
    }

    // Algoritmo que intercala os elementos entre as posicoes esq e dir
    // @param int esq inicio do array a ser ordenado
    // @param int meio posicao do meio do array a ser ordenado
    // @param int dir fim do array a ser ordenado
    public void intercalar(int esq, int meio, int dir){
        int n1, n2, i, j, k;

        //Definir tamanho dos dois subarrays
        n1 = meio - esq + 1;
        n2 = dir - meio;

        Games[] a1 = new Games[n1+1];
        Games[] a2 = new Games[n2+1];

        //Inicializar primeiro subarray
        for(i = 0; i < n1; i++){
            a1[i] = array[esq+i].clone();
        }

        //Inicializar segundo subarray
        for(j = 0; j < n2; j++){
            a2[j] = array[meio+j+1].clone();
        }

        //Sentinela no final dos dois arrays
        int max = 0x7FFFFFFF;
        float f = max;
        a1[i] = new Games();
        a2[j] = new Games();
        a1[i].setUpvotes(f);
        a2[j].setUpvotes(f);

        //Intercalacao propriamente dita
        for(i = j = 0, k = esq; k <= dir; k++){
            array[k] = (a1[i].getUpvotes() <= a2[j].getUpvotes()) ? a1[i++] : a2[j++];
        }
    }

    public void swap(int i, int j) {
        Games temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}

public class q9 {
    public static void main (String[] args) throws Exception {
        String [] entrada = new String [1000];

        Scanner sc = new Scanner(new File("/tmp/games.csv")); //    /tmp/games.csv
        Scanner scanner = new Scanner(System.in, "UTF-8");

        int n = 0, count = 0;

        Games [] obj = new Games[4403]; //VETOR DE OBJETOS
        Lista lista = new Lista();

        while (sc.hasNext()) {
            obj[count] = new Games();

            String[] lineFilter = sc.nextLine().split(",(?=(?:[^\"]*\"[^\"]*\")*[^\"]*$)");
            obj[count].setAppId(Integer.parseInt(lineFilter[0]));
            obj[count].setName(lineFilter[1]);
            String dateFormate = lineFilter[2].replace("\"", "");
            String date = dateFormate.substring(0, 3) + "/"
                    + dateFormate.substring(dateFormate.length() - 4, dateFormate.length());
            obj[count].setReleaseDate((new SimpleDateFormat("MMM/yyyy", Locale.US).parse(date)));
            obj[count].setOwners(lineFilter[3]);
            obj[count].setAge(Integer.parseInt(lineFilter[4]));
            obj[count].setPrice(Float.parseFloat(lineFilter[5]));
            obj[count].setDlcs(Integer.parseInt(lineFilter[6]));
            obj[count].setLanguages(lineFilter[7].split("(\"\\[')|(', ')|('\\]\")"));
            obj[count].setWebsite(lineFilter[8]);
            obj[count].setWindows(Boolean.valueOf(lineFilter[9]));
            obj[count].setMac(Boolean.valueOf(lineFilter[10]));
            obj[count].setLinux(Boolean.valueOf(lineFilter[11]));

            obj[count].setUpvotes(Float.parseFloat(lineFilter[12])
                    / (Float.parseFloat(lineFilter[12]) + Float.parseFloat(lineFilter[13])));
            obj[count].setAvgPt(Integer.parseInt(lineFilter[14]));
            obj[count].setDevelopers(lineFilter[15].replace("\"", ""));
            obj[count].setGenres((lineFilter.length > 16) ? lineFilter[16].split(",") : null);
            count++;
        }

        do {
            entrada[n] = scanner.nextLine();
        } while (!(isFim(entrada[n++])));
        n--;

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < count; j++) {
                if(Integer.parseInt(entrada[i]) == obj[j].getAppId()){
                    lista.inserirFim(obj[j]);
                }
            }
        }

        lista.sort();
        lista.mostrar();

        sc.close();
        scanner.close();
        
    }

    static boolean isFim(String s) {
        return (s.length() == 3 && s.charAt(0) == 'F' && s.charAt(1) == 'I' && s.charAt(2) == 'M');
    }
}
