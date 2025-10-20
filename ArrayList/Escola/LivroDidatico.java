public class LivroDidatico extends Livro{
    private String disciplina;
    
    public LivroDidatico(String nome, String autor, int paginas, double preco, String disciplina){
        super(nome, autor, paginas, preco);
        this.disciplina= disciplina;
    }
    
    public String toString(){
        return "Info: "+super.getNome()+
        " - "+ super.getAutor() +
        " - "+ super.getPaginas() +
        " - "+ super.getPreco();
    }
}