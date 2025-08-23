public class Funcionario{
    
    String nome, cpf, dataAdmissão;
    int horasTrabalhadas;
    double valorPorHora;

    double calculaSalario(int horasTrabalhadas, double valorPorHora){
        double salario;
        salario= horasTrabalhadas*valorPorHora;
        return salario;
    }
}