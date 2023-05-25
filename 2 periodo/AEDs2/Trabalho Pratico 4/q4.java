import java.io.*;
import java.util.*;
import java.text.SimpleDateFormat;
import java.util.Scanner;

class Games{
    // Declaração de variáveis
    private int app_id;
    private String name;
    private String release_data;
    private String owners;
    private int age;
    private float price;
    private int dlcs;
    private String languages;
    private String website;
    private Boolean windows;
    private Boolean mac;
    private Boolean linux;
    private float upvotes;
    private int avg_pt;
    private String developers;
    private String genres;
    // Construtor vazio 
    public Games() {
        setAppId(0);
        setName("");
        setData("");
        setOwners("");
        setAge(0);
        setPrice(0);
        setDlcs(0);
        setLanguages(null);
        setWebsite("");
        setWindows(true);
        setMac(true);
        setLinux(true);
        setUpVotes(0);
        setAvgPt(0);
        setDevelopers("");
        setGenres("");
    }
    // Construtor padrão
    public Games(int AppId,String nome,String data,String owner,int idade,float preco,int dlc,String linguas, String web,Boolean window,Boolean mec,Boolean lin,float upvotos,int avg,String develop,String gen){
        setAppId(AppId);
        setName(nome);
        setData(data);
        setOwners(owner);
        setAge(idade);
        setPrice(preco);
        setDlcs(dlc);
        setLanguages(linguas);
        setWebsite(web);
        setWindows(window);
        setMac(mec);
        setLinux(lin);
        setUpVotes(upvotos);
        setAvgPt(avg);
        setDevelopers(develop);
        setGenres(gen);
    }
    // Sets e Gets
    public void setAppId(int AppId){
        app_id=AppId;
    }
    public int getAppId(){
        return app_id;
    }
    public void setName(String nome){
        name = nome;
    }
    public String getName(){
        return name;
    }
    public void setData(String data){
        release_data=data;
    }
    public String getData(){
        return release_data;
    }
    public void setOwners(String owner){
        owners=owner;
    }
    public String getOwners(){
        return owners;
    }
    public void setAge(int idade){
        age=idade;
    }
    public int getAge(){
        return age;
    }
    public void setPrice(float preco){
        price=preco;
    }
    public float getPrice(){
        return price;
    }
    public void setDlcs(int dlc){
        dlcs=dlc;
    }
    public int getDlcs(){
        return dlcs;
    }
    public void setLanguages(String linguas){
        languages=linguas;
    }
    public String getLanguages(){
        return languages;
    }
    public void setWebsite(String web){
        website=web;
    }
    public String getWebsite(){
        return website;
    }
    public void setWindows(Boolean window){
        windows=window;
    }
    public Boolean getWindows(){
        return windows;
    }
    public void setMac(Boolean mec){
        mac=mec;
    }
    public Boolean getMac(){
        return mac;
    }
    public void setLinux(Boolean lin){
        linux=lin;
    }
    public Boolean getLinux(){
        return linux;
    }
    public void setUpVotes(float upvotos){
        upvotes=upvotos;
    }
    public float getUpVotes(){
        return upvotes;
    }
    public void setAvgPt(int avg){
        avg_pt=avg;
    }
    public int getAvgPt(){
        return avg_pt;
    }
    public void setDevelopers(String develop){
        developers=develop;
    }
    public String getDevelopers(){
        return developers;
    }
    public void setGenres(String gen){
        genres=gen;
    }
    public String getGenres(){
        return genres;
    }
    public void Criador(String ID){
        setAppId(Integer.parseInt(ID));
        String linhaf="";
        Arq.openRead("/tmp/games.csv","UTF-8");
        int lixo=0; // Quebra a repetição quando acha linha do ID do jogo
        while(Arq.hasNext()&&lixo==0){
            String linha = Arq.readLine();
            int max = (linha.length() < ID.length()) ? linha.length() : ID.length();
            String verificaID = linha.substring(0,max);
            if(verificaID.equals(ID)){
                linhaf=linha;
                lixo=1;
            }
        }
        // Achar posição das vírgulas
        int[] V = new int[16];
        int a=0;
        for(int i=0;i<linhaf.length();i++){
            if(linhaf.charAt(i)==91){
                for(int x=i;x<linhaf.length();x++){
                    if(linhaf.charAt(x)==93){
                        i=x;
                        x=linhaf.length();
                    }
                }
            }
            else if(linhaf.charAt(i)==34){
                for(int x=i+1;x<linhaf.length();x++){
                    if(linhaf.charAt(x)==34){
                        i=x;
                        x=linhaf.length();
                    }
                }
            }
            else if(linhaf.charAt(i)==44){
                V[a]=i;
                a++;
            }
        }
        // Enviar o AppId
        int AppID = Integer.parseInt(ID);
        setAppId(AppID);
        //MyIO.print(jogo.getAppId()+" ");
        // Enviar nome do jogo
        String nome = linhaf.substring(V[0]+1, V[1]);
        setName(nome);
        //MyIO.print(jogo.getName()+" ");
        // Enviar data (terminar de fazer, falta transforma em Date pra mandar pro set)
        String data = linhaf.substring(V[1]+2,V[1]+5)+"/"+linhaf.substring(V[2]-5, V[2]-1);
        setData(data);
        //MyIO.print(jogo.getData()+" ");
        // Enviar owners
        String owners = linhaf.substring(V[2]+1, V[3]);
        setOwners(owners);
        //MyIO.print(jogo.getOwners()+" ");
        // Enviar age
        int age = Integer.parseInt(linhaf.substring(V[3]+1, V[4]));
        setAge(age);
        //MyIO.print(jogo.getAge()+" ");
        // Enviar preço
        float preco = Float.valueOf(linhaf.substring(V[4]+1,V[5]));
        setPrice(preco);
        //MyIO.print(jogo.getPrice()+" ");
        // Enviar dlc
        int dlc = Integer.parseInt(linhaf.substring(V[5]+1,V[6]));
        setDlcs(dlc);
        //MyIO.print(jogo.getDlcs()+" ");
        // Enviar vetor linguagens
        String[] linguas = new String[1000];
        String linhaG="";
        a=0;
        for(int x=V[6]+2;x<V[7];x++){
            if(linhaf.charAt(x)==39){
                if(a==0){
                    linguas[a]="[";
                    linhaG+="[";
                }
                else{
                    linguas[a]=" ";
                    linhaG+=" ";
                }
                for(int n=x+1;n<V[7];n++){
                    if(linhaf.charAt(n)==39){
                        linguas[a]+=linhaf.substring(x+1, n);
                        linhaG+=linhaf.substring(x+1, n);
                        if(linhaf.charAt(n+1)==44){
                            linguas[a]+=",";
                            linhaG+=",";
                        }
                        else{
                            linguas[a]+="]";
                            linhaG+="]";
                        }
                        //MyIO.print(linguas[a]);
                        a++;
                        x=n;
                        n=V[7];
                    }
                }
            }
        }
        setLanguages(linhaG);
        //MyIO.print(jogo.getLanguages());
        //MyIO.print(" ");
        // Enviar website
        String web = linhaf.substring(V[7]+1,V[8]);
        if(web.length()==0){
            setWebsite("null");
        }
        else{
            setWebsite(web);
        } 
        //MyIO.print(jogo.getWebsite()+" ");
        // Enviar windows
        Boolean windows;
        if((linhaf.substring(V[8]+1, V[9]).equals("True"))){
            windows=true;
            //MyIO.print("true ");
        }
        else{
            windows=false;
            //MyIO.print("false ");
        }
        setWindows(windows);
        // Enviar Mac
        Boolean mac;
        if((linhaf.substring(V[9]+1, V[10]).equals("True"))){
            mac=true;
            //MyIO.print("true ");
        }
        else{
            mac=false;
            //MyIO.print("false ");
        }
        setMac(mac);
        // Enviar Linux
        Boolean linux;
        if((linhaf.substring(V[10]+1, V[11]).equals("True"))){
            linux=true;
            //MyIO.print("true ");
        }
        else{
            linux=false;
            //MyIO.print("false ");
        }
        setLinux(linux);
        // Porcentagem votos positivos
        int positivo = Integer.parseInt(linhaf.substring(V[11]+1,V[12]));
        int negativo = Integer.parseInt(linhaf.substring(V[12]+1,V[13]));
        float media = (float)positivo/((float)positivo + (float)negativo);
        setUpVotes(media);
        //MyIO.printf("%.0f",jogo.getUpVotes()*100);
        //MyIO.print("% ");
        // Horas contabilizadas
        int hTotal = Integer.parseInt(linhaf.substring(V[13]+1, V[14]));
        int horas = hTotal/60;
        int min = hTotal%60;
        if(horas==0&&min==0){
            setAvgPt(0);
            //MyIO.print("null ");
        }
        else{
            setAvgPt(hTotal);
            //System.out.printf("%dh ",horas);
            //System.out.printf("%dm ",min);
        }
        // Empresa do jogo
        String empresa = linhaf.substring(V[14]+1, V[15]);
        if(empresa.charAt(0)!=34){
            setDevelopers(empresa);    
        }
        else{
            setDevelopers(empresa.substring(1,empresa.length()-1));
        }
        //MyIO.print(empresa+" ");
        // Genêro do jogo
        //String genero = "[";
        String generoG = "[";
        a=0;
        if(linhaf.charAt(V[15]+1)==34){
            for(int i=V[15]+2;i<linhaf.length();i++){
                for(int x=i;x<linhaf.length();x++){
                    if(linhaf.charAt(x)==44){
                        //genero+=linhaf.substring(i, x);
                        generoG+=linhaf.substring(i, x);
                        //genero+=", ";
                        generoG+=", ";
                        i=x;
                        x=linhaf.length();
                    }
                    else if(linhaf.charAt(x)==34){
                        //genero+=linhaf.substring(i, x);
                        generoG+=linhaf.substring(i, x);
                        //genero+="]";
                        generoG+="]";
                        i=linhaf.length();
                        x=linhaf.length();
                    }
                }
            }
        }
        else{
            generoG+=linhaf.substring(V[15]+1, linhaf.length());
            //genero+=linhaf.substring(V[15]+1, linhaf.length());
            generoG+="]";
            //genero+="]";
        }
        setGenres(generoG);
    }
    public void Imprime(){
        MyIO.print(getAppId()+" ");
        MyIO.print(getName()+" ");
        MyIO.print(getData()+" ");
        MyIO.print(getOwners()+" ");
        MyIO.print(getAge()+" ");
        if(getPrice()==0){
            MyIO.print(getPrice()+"0 ");
        }
        else{
            MyIO.print(getPrice()+" ");
        }
        MyIO.print(getDlcs()+" ");
        MyIO.print(getLanguages()+" ");
        MyIO.print(getWebsite()+" ");
        if(getWindows()==true){
            MyIO.print("true ");
        }
        else{
            MyIO.print("false ");
        }
        if(getMac()==true){
            MyIO.print("true ");
        }
        else{
            MyIO.print("false ");
        }
        if(getLinux()==true){
            MyIO.print("true ");
        }
        else{
            MyIO.print("false ");
        }
        MyIO.printf("%.0f",getUpVotes()*100);
        MyIO.print("% ");
        if(getAvgPt()==0){
            MyIO.print("null ");
        }
        else if(getAvgPt()<60){
            MyIO.print(getAvgPt()%60+"m ");
        }
        else if(getAvgPt()%60==0){
            MyIO.print(getAvgPt()/60+"h ");
        }
        else{
            MyIO.print(getAvgPt()/60+"h "+getAvgPt()%60+"m ");
        }
        if(getDevelopers().charAt(0)==34){
            MyIO.print(getDevelopers().substring(1, getDevelopers().length()-1)+" ");
        }
        else{
            MyIO.print(getDevelopers()+" ");
        }
        MyIO.println(getGenres());

    }
}

class Celula{
    public Games game;
    public Celula prox;

    public Celula(){
        this.game = null;
        this.prox = null;
    }

    public Celula(Games game){
        this.game = game;
        this.prox = null;
    }
}

class CLista{
    private Celula primeiro;
    private Celula ultimo;
    private int quantidade;

    public CLista(){
        this.primeiro = new Celula();
        this.ultimo = this.primeiro;
        this.quantidade = 0;
    }

    public void inserirInicio(Games jogo){
        Celula tmp = new Celula(jogo);
        tmp.prox = primeiro.prox;
        primeiro.prox = tmp;
        if(quantidade == 0){
            ultimo = tmp;
        }
        quantidade++;
    }

    public void inserirFim(Games jogo){
        Celula tmp = new Celula(jogo);
        ultimo.prox = tmp;
        tmp.prox = null;
        ultimo = tmp;
        quantidade++;
    }

    public void inserirPos(Games jogo,int pos){
        if(pos == 1){
            inserirInicio(jogo);
        }
        else if(pos == quantidade){
            inserirFim(jogo);
        }
        else{
            Celula tmp = new Celula(jogo);
            Celula a = primeiro.prox;
            for(int i = 1; i < pos; i++, a = a.prox);
            tmp.prox = a.prox;
            a.prox = tmp;
            quantidade++;
        }
    }

    public String removerInicio(){
        String nome = primeiro.prox.game.getName();
        primeiro.prox = primeiro.prox.prox;
        quantidade--;
        return nome;
    }

    public String removerFim(){
        String nome = ultimo.game.getName();
        if(primeiro == ultimo){
            return nome;
        }
        Celula a = primeiro;
        for(int i = 1; i < quantidade; i++, a = a.prox){}
        ultimo = a;
        a.prox = null;
        quantidade--;
        return nome;
    }

    public String removerPos(int pos){
        Celula a = primeiro.prox;
        for(int i = 1; i < pos; i++, a = a.prox){}
        String nome = a.prox.game.getName();
        a.prox = a.prox.prox;
        quantidade--;
        return nome;
    }

    public void imprime(){
        Celula a = primeiro.prox;
        for(int i = 0; i < quantidade; i++, a = a.prox){
            a.game.Imprime();
        }
    }
}

public class q4 {
    public static int calculaMes(String mes){
        if(mes.equals("Jan")){
            return 1;
        }
        if(mes.equals("Feb")){
            return 2;
        }
        if(mes.equals("Mar")){
            return 3;
        }
        if(mes.equals("Apr")){
            return 4;
        }
        if(mes.equals("May")){
            return 5;
        }
        if(mes.equals("Jun")){
            return 6;
        }
        if(mes.equals("Jul")){
            return 7;
        }
        if(mes.equals("Aug")){
            return 8;
        }
        if(mes.equals("Sep")){
            return 9;
        }
        if(mes.equals("Oct")){
            return 10;
        }
        if(mes.equals("Nov")){
            return 11;
        }
        if(mes.equals("Dec")){
            return 12;
        }
        return 0;
    }
    public static void main(String[] args){
        // String para receber infos do usuário
        String ID= MyIO.readLine();
        // Contador do objeto
        int a=0;
        // Criar objetos
        Games[] jogo = new Games[1000];
        while(!(ID.equals("FIM"))){
            jogo[a]= new Games();
            jogo[a].Criador(ID);
            ID=MyIO.readLine();
            // Incrementa contador do jogo
            a++;
        }
        for(int i=0;i<a-1;i++){
            int menor = i;
            for(int j=i+1;j<a;j++){
                if(Integer.parseInt(jogo[menor].getData().substring(jogo[menor].getData().length()-4,jogo[menor].getData().length()))>Integer.parseInt(jogo[j].getData().substring(jogo[j].getData().length()-4,jogo[j].getData().length()))){
                    menor=j;
                }
                else if(Integer.parseInt(jogo[menor].getData().substring(jogo[menor].getData().length()-4,jogo[menor].getData().length()))==Integer.parseInt(jogo[j].getData().substring(jogo[j].getData().length()-4,jogo[j].getData().length()))&&jogo[menor].getData().compareTo(jogo[j].getData())>0){
                    menor=j;
                }
            }
            Games temp = jogo[i];
            jogo[i]=jogo[menor];
            jogo[menor]=temp;
        }
        for(int i=0;i<a-1;i++){
            int menor = i;
            for(int j=i+1;j<a;j++){
                if((Integer.parseInt(jogo[menor].getData().substring(jogo[menor].getData().length()-4, jogo[menor].getData().length()))==Integer.parseInt(jogo[j].getData().substring(jogo[j].getData().length()-4, jogo[j].getData().length())))){
                    int valMenor = calculaMes(jogo[menor].getData().substring(0, 3));
                    int valJ = calculaMes(jogo[j].getData().substring(0, 3));
                    if(valMenor>valJ){
                        menor=j;
                    }
                    else if(valMenor==valJ&&jogo[menor].getName().compareTo(jogo[j].getName())>0){
                        menor=j;
                    }
                }
            }
            Games temp = jogo[i];
            jogo[i]=jogo[menor];
            jogo[menor]=temp;
        }
        CLista lista = new CLista();
        for(int i=0;i<a;i++){
            lista.inserirFim(jogo[i]);
        }
        lista.imprime();
    }
}