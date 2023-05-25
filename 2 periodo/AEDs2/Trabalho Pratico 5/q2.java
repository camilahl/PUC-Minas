class Game{
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
    
    public Game() {
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
    
    public Game(int AppId,String nome,String data,String owner,int idade,float preco,int dlc,String linguas, String web,Boolean window,Boolean mec,Boolean lin,float upvotos,int avg,String develop,String gen){
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
        int lixo=0; 
        while(Arq.hasNext()&&lixo==0){
            String linha = Arq.readLine();
            int max = (linha.length() < ID.length()) ? linha.length() : ID.length();
            String verificaID = linha.substring(0,max);
            if(verificaID.equals(ID)){
                linhaf=linha;
                lixo=1;
            }
        }
        
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
        
        int AppID = Integer.parseInt(ID);
        setAppId(AppID);
        
        
        String nome = linhaf.substring(V[0]+1, V[1]);
        setName(nome);
        
        
        String data = linhaf.substring(V[1]+2,V[1]+5)+"/"+linhaf.substring(V[2]-5, V[2]-1);
        setData(data);
        
        
        String owners = linhaf.substring(V[2]+1, V[3]);
        setOwners(owners);
        
        
        int age = Integer.parseInt(linhaf.substring(V[3]+1, V[4]));
        setAge(age);
        
        
        float preco = Float.valueOf(linhaf.substring(V[4]+1,V[5]));
        setPrice(preco);
        
        
        int dlc = Integer.parseInt(linhaf.substring(V[5]+1,V[6]));
        setDlcs(dlc);
        
        
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
                        
                        a++;
                        x=n;
                        n=V[7];
                    }
                }
            }
        }
        setLanguages(linhaG);
        
        
        
        String web = linhaf.substring(V[7]+1,V[8]);
        if(web.length()==0){
            setWebsite("null");
        }
        else{
            setWebsite(web);
        } 
        
        
        Boolean windows;
        if((linhaf.substring(V[8]+1, V[9]).equals("True"))){
            windows=true;
            
        }
        else{
            windows=false;
            
        }
        setWindows(windows);
        
        Boolean mac;
        if((linhaf.substring(V[9]+1, V[10]).equals("True"))){
            mac=true;
            
        }
        else{
            mac=false;
            
        }
        setMac(mac);
        
        Boolean linux;
        if((linhaf.substring(V[10]+1, V[11]).equals("True"))){
            linux=true;
            
        }
        else{
            linux=false;
        }
        setLinux(linux);
        
        int positivo = Integer.parseInt(linhaf.substring(V[11]+1,V[12]));
        int negativo = Integer.parseInt(linhaf.substring(V[12]+1,V[13]));
        float media = (float)positivo/((float)positivo + (float)negativo);
        setUpVotes(media);
        
        
        int hTotal = Integer.parseInt(linhaf.substring(V[13]+1, V[14]));
        int horas = hTotal/60;
        int min = hTotal%60;
        if(horas==0&&min==0){
            setAvgPt(0);
            
        }
        else{
            setAvgPt(hTotal);            
        }
        
        String empresa = linhaf.substring(V[14]+1, V[15]);
        if(empresa.charAt(0)!=34){
            setDevelopers(empresa);    
        }
        else{
            setDevelopers(empresa.substring(1,empresa.length()-1));
        }        
        
        String generoG = "[";
        a=0;
        if(linhaf.charAt(V[15]+1)==34){
            for(int i=V[15]+2;i<linhaf.length();i++){
                for(int x=i;x<linhaf.length();x++){
                    if(linhaf.charAt(x)==44){
                        
                        generoG+=linhaf.substring(i, x);
                        
                        generoG+=", ";
                        i=x;
                        x=linhaf.length();
                    }
                    else if(linhaf.charAt(x)==34){
                        
                        generoG+=linhaf.substring(i, x);
                        
                        generoG+="]";
                        i=linhaf.length();
                        x=linhaf.length();
                    }
                }
            }
        }
        else{
            generoG+=linhaf.substring(V[15]+1, linhaf.length());
            
            generoG+="]";
            
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

class ArvoreBinaria {
	private No raiz; 

	public ArvoreBinaria() {
		raiz = null;
	}

	public boolean pesquisar(String nome) {
        System.out.println(nome);
        System.out.print("raiz ");
		return pesquisar(nome, raiz);
	}

	private boolean pesquisar(String nome, No i) {
        boolean resp;
	    if (i == null) {
            System.out.println("NAO");
            resp = false;

        } else if (nome.equals(i.elemento.getName())) {
            System.out.println("SIM");
            resp = true;

        } else if (nome.compareTo(i.elemento.getName())<0) {
            System.out.print("esq ");
            resp = pesquisar(nome, i.esq);

        } else {
            System.out.print("dir ");
            resp = pesquisar(nome, i.dir);
        }
        return resp;
	}

	public void inserir(Game game) throws Exception {
		raiz = inserir(game, raiz);
	}

	private No inserir(Game game, No i) throws Exception {
		if (i == null) {
         i = new No(game);

      } else if (game.getName().compareTo(i.elemento.getName())<0) {
             i.esq = inserir(game, i.esq);

      } else if (game.getName().compareTo(i.elemento.getName())>0) {
            i.dir = inserir(game, i.dir);

      } else {
         throw new Exception("Erro ao inserir!");
      }

		return i;
	}

	public void remover(String nome) throws Exception {
		raiz = remover(nome, raiz);
	}

	private No remover(String nome, No i) throws Exception {

		if (i == null) {
         throw new Exception("Erro ao remover!");

      } else if (nome.compareTo(i.elemento.getName())<0) {
         i.esq = remover(nome, i.esq);

      } else if (nome.compareTo(i.elemento.getName())>0) {
         i.dir = remover(nome, i.dir);

      
      } else if (i.dir == null) {
         i = i.esq;

      
      } else if (i.esq == null) {
         i = i.dir;

      
      } else {
         i.esq = maiorEsq(i, i.esq);
		}

		return i;
	}

	private No maiorEsq(No i, No j) {

      
		if (j.dir == null) {
			i.elemento = j.elemento; 
			j = j.esq; 

      
		} else {
         
			j.dir = maiorEsq(i, j.dir);
		}
		return j;
	}

   public int getAltura(){
      return getAltura(raiz, 0);
   }


   public int getAltura(No i, int altura){
      if(i == null){
         altura--;
      } else {
         int alturaEsq = getAltura(i.esq, altura + 1);
         int alturaDir = getAltura(i.dir, altura + 1);
         altura = (alturaEsq > alturaDir) ? alturaEsq : alturaDir;
      }
      return altura;
   }


   public String getRaiz() throws Exception {
      return raiz.elemento.getName();
   } 
}

class No {
    public Game elemento; 
    public No esq, dir;  

    public No(Game elemento) {
        this(elemento, null, null);
    }

    public No(Game elemento, No esq, No dir) {
        this.elemento = elemento;
        this.esq = esq;
        this.dir = dir;
    }
}

public class q2 {
    public static void main(String[] args){
        String ID = MyIO.readLine();
        ArvoreBinaria arvore = new ArvoreBinaria();

        while(!ID.equals("FIM")){
            Game game = new Game();
            game.Criador(ID);

            try {
                arvore.inserir(game);    
            } catch (Exception e) {
                System.out.println("Erro!");
            }
            ID = MyIO.readLine();
        }

        int N = MyIO.readInt();
        for(int i = 0; i < N; i++){
            String nome = MyIO.readLine();

            if(nome.charAt(0) == 'I'){
                Game game = new Game();
                game.Criador(nome.substring(2, nome.length()));
                try {
                    arvore.inserir(game);
                } catch (Exception e) {
                    System.out.println("Erro!");
                }
            } else{
                try {
                    arvore.remover(nome);
                } catch (Exception e) {
                    
                }
                
            }
        }
        String nome = MyIO.readLine();
        while(!nome.equals("FIM")){
            arvore.pesquisar(nome);
            nome = MyIO.readLine();
        }
    }
}
