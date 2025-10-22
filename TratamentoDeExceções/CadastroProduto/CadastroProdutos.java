import java.util.ArrayList;

public class CadastroProdutos{

    private ArrayList<Produto> produtos = new ArrayList();

    public CadastroProdutos(){
    }

    public void adicionar(Produto produto) throws ProdutoJaExisteException, PrecoInvalidoException{
        for(int i=0; i<produtos.size(); i++){
            if(produto.getCodigo().equals(produtos.get(i).getCodigo())){
                throw new ProdutoJaExisteException();
            }else if(produto.getPreco()<=0){
                throw new PrecoInvalidoException();
            }else
                produtos.add(produto);
        }
    }

    public void remover(String codigo) throws ProdutoNaoEncontradoException{
        boolean achou=false;
        for(int i=0; i<produtos.size(); i++){
            if(codigo.equals(produtos.get(i).getCodigo())){
                produtos.remove(produtos.get(i));
                achou=true;
            }
        }
        if(!achou)
            throw new ProdutoNaoEncontradoException();
    }

    public Produto buscar(String codigo) throws ProdutoNaoEncontradoException{
        boolean achou=false;
        for(int i=0; i<produtos.size(); i++){
            if(codigo.equals(produtos.get(i).getCodigo())){
                achou=true;
                return produtos.get(i);
            }
        }
        if(!achou)
            throw new ProdutoNaoEncontradoException();
        return null;
    }

    public ArrayList<Produto> getProdutos(){
        return produtos;
    }
}