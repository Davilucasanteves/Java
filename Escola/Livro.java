import javax.swing.JOptionPane;

public class Livro extends Produto{
    private int paginas;
    private String autor;
    
    public Livro(String nome, String autor, int paginas, double preco){
        super(nome, preco);
        this.autor= autor;
        this.paginas= paginas;
    }
    
    public boolean ehGrande(){
        if(paginas>200){
            return true;
        }else
            return false;
    }
    
    public String toString(){
        return "Info: "+super.getNome()+
        " - "+ autor +
        " - "+ paginas +
        " - "+ super.getPreco();
    }
    
    public int getPaginas(){return paginas;}
    public String getAutor(){return autor;}
}