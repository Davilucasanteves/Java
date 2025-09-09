public class Autor {
    private String nome;
    private String sobrenome;
    private int anoNascimento;
    
    public Autor(String nome, String sobrenome, int anoNascimento) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.anoNascimento = anoNascimento;
    }
    
    // Getters e Setters
    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String getSobrenome() {
        return sobrenome;
    }
    
    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }
    
    public int getAnoNascimento() {
        return anoNascimento;
    }
    
    public void setAnoNascimento(int anoNascimento) {
        this.anoNascimento = anoNascimento;
    }
    
    @Override
    public String toString() {
        return nome + " " + sobrenome + " (Nascimento: " + anoNascimento + ")";
    }
}