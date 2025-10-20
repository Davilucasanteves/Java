package modelo; 

//Classe Cliente
public class Cliente {
    private String nome;
    private long cpf;
   
    public Cliente (String nome, long cpf){
        this.nome=nome;
        this.cpf=cpf;
    }
    
    public String getNome() {
        return nome;
    }
    public void setNome(String nome){
        this.nome=nome;
    }

    public long getCpf() {
        return cpf;
    }
        
    public String imprimir(){
        return "Nome: " + nome + "\nCPF: " + cpf ;
    }       
}