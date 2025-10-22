public class Funcionario extends Pessoa{
    private String codigo;
    private double salario;
    
    public Funcionario(String nome, String cpf, String endereco, String codigo, double salario){
        super(nome, cpf, endereco);
        this.codigo= codigo;
        this.salario= salario;
    }
    
    public String imprimir(){
        return "Info: " + super.imprimir() + " - " + codigo + " - " + salario;
    }
    
    public String getNome(){return codigo;}
    public double getSalario(){return salario;}
}