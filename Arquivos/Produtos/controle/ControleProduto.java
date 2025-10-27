package controle;

import modelo.IProduto;
import modelo.Produto;
import modelo.RepositorioArquivoProduto;
import java.util.ArrayList;

public class ControleProduto{

    private IProduto repositorioProduto;
    
    public ControleProduto(){
        repositorioProduto = new RepositorioArquivoProduto();
    }
    
    public void cadastraProduto (int codigo, String descrcao, double valor){
     //criar o objeto produto e chama o método do repositório para salvar o produto
    }
    
    public ArrayList<Produto> listarProduto(){
        //retorna uma lista com todos os produtos
    }
    
    public Produto pesquisarProduto (int codigo){
        //retorna o produto com o código indicado
    }
}  