public class Emprestimo {
    private long codigo;
    private String dataEmprestimo;
    private String dataDevolucao;
    private Livro livro;
    private Usuario usuario;
    
    public Emprestimo(long codigo, String dataEmprestimo, Livro livro, Usuario usuario) {
        this.codigo = codigo;
        this.dataEmprestimo = dataEmprestimo;
        this.livro = livro;
        this.usuario = usuario;
    }
    
    // Getters e Setters
    public long getCodigo() {
        return codigo;
    }
    
    public void setCodigo(long codigo) {
        this.codigo = codigo;
    }
    
    public String getDataEmprestimo() {
        return dataEmprestimo;
    }
    
    public void setDataEmprestimo(String dataEmprestimo) {
        this.dataEmprestimo = dataEmprestimo;
    }
    
    public String getDataDevolucao() {
        return dataDevolucao;
    }
    
    public void setDataDevolucao(String dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }
    
    public Livro getLivro() {
        return livro;
    }
    
    public void setLivro(Livro livro) {
        this.livro = livro;
    }
    
    public Usuario getUsuario() {
        return usuario;
    }
    
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    
    @Override
    public String toString() {
        return "Empréstimo [Código: " + codigo + ", Data: " + dataEmprestimo + 
               ", Livro: " + livro.getTitulo() + ", Usuário: " + usuario.getNome() + "]";
    }
}