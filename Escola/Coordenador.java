public class Coordenador extends Funcionario{
    private String curso;
    
    public Coordenador(String nome, String cpf, String endereco, String codigo, double salario, String curso){
        super(nome, cpf, endereco, codigo, salario);
        this.curso= curso;
    }
    
    public String imprimir(){
        return "Info: " + super.imprimir() + " - " + curso;
    }
    
    public String getCurso(){return curso;}
}