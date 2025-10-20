//Classe Ebook
public class Ebook extends Livro implements IPromocional {
    private String marcaDagua;

    public Ebook(){
        
    }
    public Ebook(String marcaDagua){
        super();
        this.marcaDagua=marcaDagua;
    }
        
    @Override
    public boolean aplicaDesconto(double porcentagem){
        if (porcentagem >0.30){
            return false;
        }
        else {
            super.valor -= (super.valor * porcentagem);
            return true;
        }
    }
    public String getMarcaDagua(){
            return marcaDagua;
    }
}