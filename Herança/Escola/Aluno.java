public class Aluno extends Pessoa{
    private String matricula;
    
    public Aluno(String nome, String cpf, String endereco, String matricula){
        super(nome, cpf, endereco);
        this.matricula= matricula;
    }
    
    public String imprimir(){
        return "Info: " + super.imprimir() + " - " + matricula;
    }
    
    public String getMatricula(){return matricula;}
}