public class q13 {
    public static String cifra(String s,String a){
        //System.out.println(s.length()+" "+a.length());
        if(s.length()==a.length()){
            return a;
        }
        else{
            a += (char)((int)s.charAt(a.length())+3);
            return cifra(s,a);
        }
    }
    public static void main(String[] args){
        String nome = MyIO.readLine();

        while(nome.equals("FIM")==false){
            
            String vazio="";
            MyIO.println(cifra(nome,vazio));
            nome = MyIO.readLine();
        }
    }
}