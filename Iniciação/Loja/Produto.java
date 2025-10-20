

public class Produto
{
    private String codigo;
    private String descricao;
    private double preco;
    private int qtdEstoque;
    
    // construtores
    public Produto(String codigo, String descricao, double preco, int qtdEstoque){
        this.codigo=codigo;     
        this.descricao=descricao;     
        this.preco=preco;
        this.qtdEstoque=qtdEstoque;
    }
    
    public Produto(String codigo, String descricao, int qtdEstoque){
        this.codigo=codigo;     
        this.descricao=descricao;     
    }

    //métodos
    public double calcularDesconto(int desconto){
        return preco-(preco*(desconto/100));
    }

    public int atualizarEstoque(int vendidos){
        return qtdEstoque-vendidos;
    }

    public void imprimirProduto(double newPreco, int newQtdEstoque){
        System.out.println("Código: "+ this.codigo+"      Produto: "+ this.descricao+
        "\nR$: "+ newPreco+"          Quantidade em estoque: "+newQtdEstoque);
    }
       
    //getters e setters
    public int getQtdEstoque(){
        return this.qtdEstoque;
    }

    public double getPreco(){
        return this.preco;
    }

    public String getCodigo(){
        return this.codigo;
    }

    public String getDescricao(){
        return this.descricao;
    }

    public void setQtdEstoque(int qtdEstoque){
        this.qtdEstoque= qtdEstoque;
    }
}