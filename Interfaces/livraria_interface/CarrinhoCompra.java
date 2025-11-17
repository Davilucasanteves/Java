//Classe CarrinhoCompras
import java.util.ArrayList;
public class CarrinhoCompra {
    ArrayList <IProduto> produtos = new ArrayList();
    
    public void adicionar(Livro l){
        produtos.add(l);
    }
    
    
    //Resposta 1_i) Ao comentar este método, a chamada dele
    //na classe principal AppLivraria teve de ser removida.
    public boolean aplicarDesconto (IPromocional p, double desconto){
        return p.aplicaDesconto(desconto);
    }
    
   
    public double getTotal (){
        double total =0;
        for (IProduto l: produtos){
            total += l.getValor();
        }
        return total;
    }  
    
    public void adicionar(Revista r){
        produtos.add(r);
    }
}