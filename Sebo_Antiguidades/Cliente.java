public class Cliente{
    private String nome, email, telefone;
    private boolean comprador; //diferencia os clientes: true = comprador, false = vendedor

    //construtor
    public Cliente(String nome, String email, String telefone, boolean comprador){
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
        this.comprador = comprador;
    }

    //getters e setters, aqui tem setters para caso as informações do cliente precisem mudar...
    public String getNome(){ return nome; }
    public void setNome(String nome){ 
        this.nome = nome; 
    }

    public String getEmail(){ return email; }
    public void setEmail(String email){ 
        this.email = email; 
    }

    public String getTelefone(){ return telefone; }
    public void setTelefone(String telefone){ 
        this.telefone = telefone; 
    }

    public boolean getComprador(){ return comprador; }
    public void setComprador(boolean comprador){ 
        this.comprador= comprador; 
    }

    //método
    public void imprimirInfo(){
        System.out.println("Nome: "+ nome);
        System.out.println("Email: "+ email);
        System.out.println("Telefone: "+ telefone);
        System.out.println("Tipo de Cliente: "+(comprador ? "Comprador" : "Vendedor"));
    }
}