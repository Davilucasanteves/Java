//Classe CarrinhoCompras
import java.util.ArrayList;
public class CarrinhoCompra {
    ArrayList <Livro> livros = new ArrayList();
    ArrayList <Revista> revistas = new ArrayList();
    
    public void adicionar(Livro l){
        livros.add(l);
    }
    
    
    public boolean aplicarDesconto (IPromocional p, double desconto){
        return p.aplicaDesconto(desconto);
    }
    
   
    public double getTotal (){
        double total =0;
        for (Livro l: livros){
            total += l.getValor();
        }
        for (Revista r: revistas){
            total += r.getValor();
        }
        return total;
    }  
    
    public void adicionar(Revista r){
        revistas.add(r);
    }
    
    
}