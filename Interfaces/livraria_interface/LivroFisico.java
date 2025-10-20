//classe LivroFisico
public class LivroFisico extends Livro implements IPromocional{
    
    public LivroFisico(){
        super();
    }
    
    public double getTaxaImpressao(){
        return (super.valor *0.05);
    }
    
    @Override
    public boolean aplicaDesconto(double porcentagem){
         if (porcentagem >0.15){
            return false;
        }
        else {
            super.valor -= (super.valor * porcentagem);
            return true;
        }
    }
}