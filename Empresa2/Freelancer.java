public class Freelancer extends Funcionario{
    private double valorPagoHora, horasTrabalhadas;

    public Freelancer(String nome, int id, double valorPagohora, double horasTrabalhadas){
        super(nome, id);
        this.horasTrabalhadas=horasTrabalhadas;
        this.valorPagoHora= valorPagoHora;
    }

    double calcularPagamento(){
        return horasTrabalhadas*valorPagoHora;
    }

    public String detalharPagamento(){
        return "Freelancer recebe as horas trabalhadas vezes o valor recebido por hora.";
    }

    public double getHorasTrabalhadas(){
        return horasTrabalhadas;
    }
    public double getValorPagoHora(){
        return valorPagoHora;
    }
}