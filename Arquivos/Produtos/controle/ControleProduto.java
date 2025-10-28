package controle;

import java.util.ArrayList;
import modelo.IProduto;
import modelo.Produto;
import modelo.RepositorioArquivoProduto;

public class ControleProduto{

    private IProduto repositorioProduto;
    
    public ControleProduto(){
        repositorioProduto = new RepositorioArquivoProduto();
    }
    
    public void cadastraProduto (int codigo, String descricao, double valor){
        Produto p = new Produto(codigo, descricao, valor);
        repositorioProduto.createProduto(p);
     //criar o objeto produto e chama o método do repositório para salvar o produto
    }
    
    public ArrayList<Produto> listarProduto(){
        ArrayList<Produto> produtos = new ArrayList();
        produtos= repositorioProduto.getAllProdutos();
        return produtos;
        //retorna uma lista com todos os produtos
    }
    
    public Produto pesquisarProduto (int codigo){
        for(int i=0; i<repositorioProduto.getAllProdutos().size(); i++){
            if(codigo == repositorioProduto.getAllProdutos().get(i).getCodigo()){
                return repositorioProduto.getAllProdutos().get(i);
            }
        }
        return null;
        //retorna o produto com o código indicado
    }
    
    public void removerProduto(Produto produto){
        repositorioProduto.getAllProdutos().remove(produto);
    }

    public String mostrar(){
        String result="";
        for(int i=0; i<listarProduto().size(); i++){
            result+="\n" + listarProduto().get(i).getCodigo() + " - " + 
            listarProduto().get(i).getDescricao() + " - "
            + listarProduto().get(i).getValor() + "\n";
        }
        return "Info: "+result;
    }
}  