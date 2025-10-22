public class PrecoInvalidoException extends Exception{
    public PrecoInvalidoException(){
        super("Preço inserida inválida!");
    }

    public PrecoInvalidoException(String msg){
        super(msg);
    }
}