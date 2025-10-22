public class IdadeInvalidaException extends Exception{
    public IdadeInvalidaException(){
        super("Idade inserida inválida!");
    }

    public IdadeInvalidaException(String msg){
        super(msg);
    }
}