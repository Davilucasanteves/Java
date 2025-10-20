public class Produto {
    private int codigo;
    private String nome;
    private String descricao;
    private String tipo;
    private double valor;
    private int estoque;
    private static int numProdutos=0; //Essa variável é de classe, como uma global, ela é válida e idêntica para todas as instâncias dessa classe, diferentemente das outras.
   
    //construtores
    public Produto(String nome){
           this.nome=nome;
           codigo = numProdutos++;
    }
    public Produto(String nome, double valor){
           this.nome=nome;
           this.valor=valor;
           codigo = numProdutos++;
    }
    public Produto(String nome, double valor, int quantidade){
           this.nome=nome;
           this.valor=valor;
           this.estoque=quantidade;
           codigo = numProdutos++;
    }
    
    //métodos
    public double getPreco(){
	return valor * 2;
    }
    public boolean venderProduto(int qtd){
        boolean temProduto=false;
		if(estoque >= qtd){
            estoque = estoque - qtd;
            temProduto=true;
        }
        return temProduto;
    }
        public void comprarProduto(int qtd){
    		estoque = estoque + qtd;
    }
    public String imprimir (){
            return codigo + " - " + nome;
    }
    
    //getters e setters
    public int getCodigo(){
        return this.codigo;
    }
    
    public String getNome(){
        return this.nome;
    }
    
    public String getDescricao(){
        return this.descricao;
    }
    
    public String getTipo(){
        return this.tipo;
    }
    
    public double getValor(){
        return this.valor;
    }
    public void setValor(double valor){
        this.valor=valor;                  //valor pode mudar com o tempo.
    }

    public int getEstoque(){
        return this.estoque;
    }

    public void setEstoque(int estoque){
        this.estoque=estoque;                  //estoque pode mudar com o tempo.
    }
    
    public int getNumProdutos(){
        return this.numProdutos;
    }
}