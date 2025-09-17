public class Professor extends Funcionario{
    private String departamento;
    
    public Professor(String nome, String cpf, String endereco, String codigo, double salario, String departamento){
        super(nome, cpf, endereco, codigo, salario);
        this.departamento= departamento;
    }
    
    public String imprimir(){
        return "Info: " + super.imprimir() + " - " + departamento;
    }
    
    public String getDepartamento(){return departamento;}
}