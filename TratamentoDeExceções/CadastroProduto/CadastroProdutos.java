import java.util.ArrayList;

public class CadastroProdutos{

    private ArrayList<Produto> produtos = new ArrayList();

    public CadastroProdutos(){
    }

    public void adicionar(Produto produto) throws ProdutoJaExisteException, PrecoInvalidoException{
        for(int i=0; i<produtos.size(); i++){
            if(produto.getCodigo().equals(produtos.get(i).getCodigo()))
                throw new ProdutoJaExisteException();
        }

        if(produto.getPreco()<=0){
            throw new PrecoInvalidoException();
        }else
            produtos.add(produto);
    }

    public void remover(String codigo) throws ProdutoNaoEncontradoException{
        for(int i=0; i<produtos.size(); i++){
            if(codigo.equals(produtos.get(i).getCodigo())){
                produtos.remove(i);
                return;
            }
        }
        throw new ProdutoNaoEncontradoException();
    }

    public Produto buscar(String codigo) throws ProdutoNaoEncontradoException{
        for(int i=0; i<produtos.size(); i++){
            if(codigo.equals(produtos.get(i).getCodigo())){
                return produtos.get(i);
            }
        }
        
        throw new ProdutoNaoEncontradoException();
    }

    public ArrayList<Produto> getProdutos(){
        return produtos;
    }

    public String mostrarProdutos(){
        String result="";
        for(int i=0; i<produtos.size(); i++){
            result+= produtos.get(i).getNome() + " - " + produtos.get(i).getCodigo() + " - " + produtos.get(i).getPreco()+"\n";
        }
        return "Info: " + result;
    }
}