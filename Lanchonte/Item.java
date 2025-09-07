public class Item {
    private Produto produto;
    private int quantidade; //quantidade de um item em um pedido.
    
    public Item (Produto produto){
        this.produto = produto;
    }

    public void setQuantidade(int quantidade){ 
    //Só atualiza a quantidade do item se tiver a quantidade indicada no estoque do produto 
        if(produto.getEstoque()>= quantidade){
            this.quantidade= quantidade;
        }else{
            System.out.println("Não há produtos suficientes em estoque para sacar esta quantidade!");
            this.quantidade=0;
        }

    }
    public int getQuantidade(){
       return quantidade;
    }
    public Produto getProduto(){
        return produto;
    }
    public double calcularSubTotal(){//quantidade x preço do produto
         return quantidade * produto.getValor();
    }
}
