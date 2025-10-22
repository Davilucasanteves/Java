public class ProdutoNaoEncontradoException extends Exception{
    public ProdutoNaoEncontradoException(){
        super("Produto não encontrado!");
    }

    public ProdutoNaoEncontradoException(String msg){
        super(msg);
    }
}