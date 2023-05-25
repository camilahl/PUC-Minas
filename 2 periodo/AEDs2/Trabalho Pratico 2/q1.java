import java.util.Date;
import java.util.Locale;
import java.util.Scanner;
import java.io.File;
import java.text.SimpleDateFormat;

class Game{
    //atributos
    private int app_id, age, dlcs, avg_pt;
    private String name, owners, website, developers;
    private Date release_date;
    private float price, upvotes;
    private boolean windows, mac, linux;
    private String[] languages, genres;

    //construtor vazio: apenas inicia a classe sem nenhum valor atribuído
    public Game(){ 
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
    
    //aqui coloca os sets, inicia a classe com todos os atributos
    /*public Game(int app_id, int age, int dlcs, int avg_pt, String name, String owners, String website, String developers, Date release_date, float price, float upvotes, boolean windows, boolean mac, boolean linux, String[] languages, String[] genres){ 
        this.app_id = app_id;
        this.age = age;
        this.dlcs = dlcs; 
        this.avg_pt = avg_pt;
        this.name = name;
        this.owners = owners; 
        this.website = website;
        this.developers = developers; 
        this.release_date = release_date; 
        this.price = price; 
        this.upvotes = upvotes; 
        this.windows = windows; 
        this.mac = mac; 
        this.linux = linux; 
        this.languages = languages;
        this.genres = genres; 
    }*/

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

    //método clone, que retorna um objeto "game" com os mesmos atributos de um outro objeto game
    /*public Game clone(){
        Game resp = new Game();
        resp.app_id = this.app_id;
        resp.age = this.age; 
        resp.dlcs = this.dlcs; 
        resp.avg_pt = this.avg_pt; 
        resp.name = this.name; 
        resp.owners = this.owners; 
        resp.website = this.website; 
        resp.developers = this.developers; 
        resp.release_date = this.release_date; 
        resp.price = this.price; 
        resp.upvotes = this.upvotes; 
        resp.windows = this.windows; 
        resp.mac = this.mac; 
        resp.linux = this.linux; 
        resp.languages = this.languages; 
        resp.genres = this.genres; 
        return resp;
    }*/

    public void imprimirPrice() {
        System.out.format(Locale.US, "%.2f ", this.price);
    }

    public void imprimirLinguas() {
        MyIO.print("[");
        if (languages.length == 1)
            MyIO.print(languages[0].replaceAll("[\\[\\]']", "") + "] ");
        else {
            for (int i = 1; i < languages.length - 1; i++)
                MyIO.print(languages[i] + ", ");
            MyIO.print(languages[languages.length - 1] + "] ");
        }
    }

    public void imprimirWebSite() {
        if(this.website.isEmpty()){
            MyIO.print("null ");
        }else{
            MyIO.print(this.website + " ");
        }
    }

    public void imprimirUpVotes() {
        MyIO.print((int) Math.round(this.upvotes * 100) + "% ");
    }

    public void imprimirAVG() {
        int horasContadas = this.avg_pt / 60;
        int minutosPassados = this.avg_pt % 60;
        if (horasContadas == 0 && minutosPassados == 0)
            MyIO.print("null ");
        else
        if(horasContadas > 0){
            MyIO.print(horasContadas + "h ");
        }else{
            MyIO.print(horasContadas + "");
        }
        if(minutosPassados > 0){
            MyIO.print("m ");
        }else{
            MyIO.print("");
        }
    }

    public void imprimirGeneros() {
        MyIO.print("[");
        if (genres.length == 1)
            MyIO.print(genres[0].replace("\"", "") + "]\n");
        else {
            MyIO.print(genres[0].replace("\"", "") + ", ");
            for (int i = 1; i < genres.length - 1; i++)
                MyIO.print(genres[i] + ", ");
            MyIO.print(genres[genres.length - 1].replace("\"", "") + "]\n");
        }
    }

    public void imprimir() {
        System.out.printf("%d %s %s %s %d ", this.app_id, this.name, default_dateFormat.format(this.release_date), this.owners, this.age);
        imprimirPrice();
        MyIO.print(this.dlcs + " ");
        imprimirLinguas();
        imprimirWebSite();
        System.out.printf("%b %b %b ", this.windows, this.mac, this.linux);
        imprimirUpVotes();
        imprimirAVG();
        MyIO.print(this.developers.replace("\"", "") + " ");
        imprimirGeneros();
    }
}

public class q1 {
    public static boolean isFim(String s){
        return (s.length() == 3 && s.charAt(0) == 'F' && s.charAt(1) == 'I' && s.charAt(2) == 'M');
    }

    public static void main (String[] args) throws Exception {
        /*String linha = "";
        while(true) {
            linha = MyIO.readLine();
            if(isFim(linha)) {
                break;
            }
            ArrayList<Game> games = new ArrayList<Game>();
            games.add(new Game);           
        }*/

        String[] entrada = new String[1000]; 
        Scanner sc = new Scanner(new File("/tmp/games.csv"));
        int n = 0, count = 0;
        Games[] obj = new Games[4403];

        while (sc.hasNext()) {
            obj[count] = new Games();
            String[] lineFilter = sc.nextLine().split(",(?=(?:[^\"]*\"[^\"]*\")*[^\"]*$)");

            //Integer.parseInt quando vc quer obter um int a partir de um String
            /*Você passa um String por parâmetro pro método parseInt, e ele te retorna um int, que é 
            o valor inteiro representado pelo String que você passou*/
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
            //obj[count].setLanguages(lineFilter[7].split("(\"\\[')|(', ')|('\\]\")"));
            obj[count].setWebsite(lineFilter[8]);
            obj[count].setWindows(Boolean.valueOf(lineFilter[9]));
            obj[count].setMac(Boolean.valueOf(lineFilter[10]));
            obj[count].setLinux(Boolean.valueOf(lineFilter[11]));
            obj[count].setUpvotes(Float.parseFloat(lineFilter[12])
                    / (Float.parseFloat(lineFilter[12]) + Float.parseFloat(lineFilter[13])));
            //obj[count].setAvgPt(Integer.parseInt(lineFilter[14]));
            obj[count].setDevelopers(lineFilter[15]);
            //obj[count].setGenres((lineFilter.length > 16) ? lineFilter[16].split(",") : null);
            count++;
        }
        sc.close();

        do {
            entrada[n] = MyIO.readLine(); //le a linhda de entrada
        } while (!(isFim(entrada[n++]))); 
        n--; // tirar o FIM

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < count; j++) {
                if (Integer.parseInt(entrada[i]) == obj[j].getAppId())
                    obj[j].imprimir();
            }
        }
    }    
}