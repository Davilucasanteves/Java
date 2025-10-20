public class AppEmpresa{
    public static void main(String[] args){
        Funcionario funcionario1 = new Funcionario();
        Funcionario funcionario2 = new Funcionario();
        Funcionario funcionario3 = new Funcionario();

        funcionario1.horasTrabalhadas= 5;
        funcionario1.valorPorHora= 50.5;

        funcionario2.horasTrabalhadas= 8;
        funcionario2.valorPorHora= 200;

        funcionario3.horasTrabalhadas= 12;
        funcionario3.valorPorHora= 20;

        System.out.println("O salário do funcionário1 é: "+ funcionario1.calculaSalario(funcionario1.horasTrabalhadas, funcionario1.valorPorHora));
        System.out.println("O salário do funcionário2 é: "+ funcionario2.calculaSalario(funcionario2.horasTrabalhadas, funcionario2.valorPorHora));
        System.out.println("O salário do funcionário3 é: "+ funcionario3.calculaSalario(funcionario3.horasTrabalhadas, funcionario3.valorPorHora));

    }
}