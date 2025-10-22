public class Produto {
    private int codigo;
    private static int cont=0; 
    private String nome;
    private double preco;
    
    public Produto(String nome, double preco){
        cont++;
        this.codigo=cont;
        this.nome=nome;
        this.preco=preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
    
    public boolean ehCaro(){
    //Retorna true se o preço for maior do que 50
        boolean caro = false;
        if (this.getPreco()>50)
            caro = true;
        return caro;
    }
    
    public int getCodigo() {
        return codigo;
    }
    
    @Override
    public String toString(){
        return "Código: "+ getCodigo()+
                "\nNome: " + getNome() + 
                "\nPreço: " + getPreco();
    }   
}