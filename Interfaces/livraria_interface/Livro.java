//Classe Livro
public abstract class Livro implements IProduto {
    protected String nome;
    protected String descricao;
    protected String autor;
    protected String isbn;
    protected double valor;
    
    public Livro (){
    }
    public Livro (String nome, String descricao, String autor, String isbn, double valor){
        this.nome=nome;
        this.autor=autor;
        this.descricao=descricao;
        this.isbn=isbn;
        this.valor=valor;
    }

    public abstract boolean aplicaDesconto (double porcentagem);

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
}
