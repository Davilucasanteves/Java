import java.util.ArrayList;
import javax.swing.JOptionPane;

public class TesteLivro{
    public static void main(String[] args) {
        ArrayList <Produto> produtos = new ArrayList();
        String resultado="";
        produtos.add(new Livro ("Java Como Programar", "Deitel", 1000, 300));
        produtos.add(new Produto("Lapis preto", 2));
        produtos.add(new Produto("Caneta azul", 3.5));
        produtos.add(new Livro ("A hora da estrela","Clarice Lispector", 120, 37.8));
        produtos.add(new LivroDidatico("Cálculo", "Shokovski", 100, 30.0, "matemática"));
        
        for (int i=0; i<produtos.size(); i++){
            resultado = resultado + produtos.get(i).toString()+"\n--------\n";
            if (produtos.get(i) instanceof Livro){
                JOptionPane.showMessageDialog(null,((Livro)produtos.get(i)).ehGrande());
            }//com essa nova implementação, o código corre.

            
            
            /* Repostas da g)
             * "produtos.get(i).ehGrande();" falha pois produtos.get(i) retorna
             * um tipo Produto, que não tem
             * o método ehGrande();
            */
            
            /* "((Livro)produtos.get(i)).ehGrande();" falha pois tenta converter um
             * objeto do tipo Produto para o tipo Livro, mas esse objeto
             * não é uma instância de Livro.
            */
            
        }
        JOptionPane.showMessageDialog(null, resultado);
    }
}