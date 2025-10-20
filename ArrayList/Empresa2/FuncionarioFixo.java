public class FuncionarioFixo extends Funcionario{
    private double salarioBase, bonus;

    public FuncionarioFixo(String nome, int id, double salarioBase, double bonus){
        super(nome, id);
        this.salarioBase=salarioBase;
        this.bonus=bonus;
    }

    double calcularPagamento(){
        return salarioBase + bonus;
    }

    public String detalharPagamento(){
        return "Funcionário recebe um salário mais um bônus.";
    }

    public double getSalarioBase(){
        return salarioBase;
    }
    public double getBonus(){
        return bonus;
    }
}