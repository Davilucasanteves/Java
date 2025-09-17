public class Pessoa{
    private String nome;
    private String cpf;
    private String endereco;
    
    public Pessoa(String nome, String cpf, String endereco){
        this.nome= nome;
        this.cpf= cpf;
        this.endereco= endereco;
    }
    
    public String imprimir(){
        return "Info: " + nome + " - " + cpf + " - " + endereco;
    }
    
    public String getNome(){return nome;}
    public String getCpf(){return cpf;}
    public String getEndereco(){return endereco;}
}