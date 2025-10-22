public class ProdutoJaExisteException extends Exception{
    public ProdutoJaExisteException(){
        super("Esse produto já existe!");
    }

    public ProdutoJaExisteException(String msg){
        super(msg);
    }
}