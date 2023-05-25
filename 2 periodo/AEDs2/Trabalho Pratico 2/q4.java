import java.util.Date;
import java.util.Locale;
import java.util.Scanner;
import java.io.File;
import java.text.SimpleDateFormat;

class Lista {
    private Games[] array;
    public int n;
    public int count = 0;

    public Lista(int tamanho) {
        array = new Games[tamanho];
        n = 0;
    }

    public void inserirInicio(Games x) throws Exception {
        // validar insercao
        if (n >= array.length) {
            throw new Exception("Erro ao inserir!");
        }

        // levar elementos para o fim do array
        for (int i = n; i > 0; i--) {
            array[i] = array[i - 1];
        }

        array[0] = x;
        n++;
    }

    public void inserirFim(Games x) throws Exception {
        // validar insercao
        if (n >= array.length) {
            throw new Exception("Erro ao inserir!");
        }

        array[n] = x;
        n++;
    }

    public void inserir(Games x, int pos) throws Exception {
        // validar insercao
        if (n >= array.length || pos < 0 || pos > n) {
            throw new Exception("Erro ao inserir!");
        }

        // levar elementos para o fim do array
        for (int i = n; i > pos; i--) {
            array[i] = array[i - 1];
        }

        array[pos] = x;
        n++;
    }

    public Games removerInicio() throws Exception {
        // validar remocao
        if (n == 0) {
            throw new Exception("Erro ao remover!");
        }

        Games resp = array[0];
        n--;

        for (int i = 0; i < n; i++) {
            array[i] = array[i + 1];
        }
        return resp;
    }

    public Games removerFim() throws Exception {
        // validar remocao
        if (n == 0) {
            throw new Exception("Erro ao remover!");
        }

        return array[--n];
    }

    public Games remover(int pos) throws Exception {
        // validar remocao
        if (n == 0 || pos < 0 || pos >= n) {
            throw new Exception("Erro ao remover!");
        }

        Games resp = array[pos];
        n--;

        for (int i = pos; i < n; i++) {
            array[i] = array[i + 1];
        }
        return resp;
    }

    public void mostrar() {
        for (int i = 0; i < n; i++) {
            array[i].printClass();
        }
    }

    public boolean pesqBin(String x) {
        boolean resp = false;
        int dir = (n- 1), esq = 0, meio;
        while (esq <= dir) {
            meio = (esq + dir) / 2;
            if (array[meio].getName().compareTo(x) == 0) {
                count++;
                resp = true;
                esq = dir + 1;
            } else if (array[meio].getName().compareTo(x) < 0) {
                count++;
                esq = meio + 1;
            } else {
                count++;
                dir = meio - 1;
            }
        }
        return resp;
    }
}

class Games{
    //atributos
    private int app_id, age, dlcs, avg_pt;
    private String name, owners, website, developers;
    private Date release_date;
    private float price, upvotes;
    private boolean windows, mac, linux;
    private String[] languages, genres;

    //construtor vazio: apenas inicia a classe sem nenhum valor atribuído
    public Games(){ 
        app_id = 0;
        age = 0;
        dlcs = 0;
        avg_pt = 0;
        name = "";
        owners = "";
        website = "";
        developers = "";
        release_date = null;
        price = 0;
        upvotes = 0;
        windows = false;
        mac = false;
        linux = false;
        languages = null;
        genres = null;
    }

    static SimpleDateFormat default_dateFormat = new SimpleDateFormat("MMM/yyyy", Locale.US);

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

    public void printClass() {
        MyIO.println(this.name);
    }
}

public class q4 {
    public static boolean isFim(String s){
        return (s.length() == 3 && s.charAt(0) == 'F' && s.charAt(1) == 'I' && s.charAt(2) == 'M');
    }

    public static void main (String[] args) throws Exception {
        MyIO.setCharset("utf-8");
        String nomeArquivo = ""; 
        nomeArquivo = MyIO.readLine(); //Lê o nome do arquivo 
        Lista listGames = new Lista(100);
        long tempoIni = System.currentTimeMillis();
        while (true){ 
            if(nomeArquivo.compareTo("FIM") == 0){ //Se o nome do arquivo for 'FIM' sai do loop
                break;
            }
            Games novoGames = new Games(); //Cria um novo objeto de Games
            Scanner sc = new Scanner(new File("/tmp/games.csv"));
            listGames.inserirFim(novoGames);
            nomeArquivo = MyIO.readLine(); //Lê a proxima linha e continua o loop
            sc.close();
        }

        String chaveBusca="";
        chaveBusca = MyIO.readLine();
        while (true){
            if(chaveBusca.compareTo("FIM")==0){ //Se o nome do arquivo for 'FIM' sai do loop
                break;
            }
            if(listGames.pesqBin(chaveBusca)==true){
                MyIO.println("SIM");
            }else{
                MyIO.println("NAO");
            }
            chaveBusca=MyIO.readLine();
        }
        Arq.openWrite("267678_sequencial.txt");
        Arq.println("267678\t"+(System.currentTimeMillis()-tempoIni)+" ms\t"+ listGames); 
        Arq.close();
    }
}    