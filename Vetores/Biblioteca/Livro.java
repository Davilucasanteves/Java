public class Livro {
    private int codigo;
    private String titulo;
    private String editora;
    private long issn;
    private Autor autor;
    
    public Livro(int codigo) {
        this.codigo = codigo;
    }
    
    public Livro(int codigo, String titulo) {
        this.codigo = codigo;
        this.titulo = titulo;
    }
    
    public Livro(int codigo, String titulo, String editora, long issn, Autor autor) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.editora = editora;
        this.issn = issn;
        this.autor = autor;
    }
    
    // Getters e Setters
    public int getCodigo() {
        return codigo;
    }
    
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    
    public String getTitulo() {
        return titulo;
    }
    
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    
    public String getEditora() {
        return editora;
    }
    
    public void setEditora(String editora) {
        this.editora = editora;
    }
    
    public long getIssn() {
        return issn;
    }
    
    public void setIssn(long issn) {
        this.issn = issn;
    }
    
    public Autor getAutor() {
        return autor;
    }
    
    public void setAutor(Autor autor) {
        this.autor = autor;
    }
    
    @Override
    public String toString() {
        return "Código: " + codigo + ", Título: " + titulo + 
               ", Editora: " + editora + ", Autor: " + autor;
    }
}