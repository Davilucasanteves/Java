public class Estagiario extends Funcionario{
    private double bolsa;

    public Estagiario(String nome, int id, double bolsa){
        super(nome, id);
        this.bolsa=bolsa;
    }

    public double calcularPagamento(){
        return bolsa;
    }

    public String detalharPagamento(){
        return "Estagiário recebe uma bolsa.";
    }

    public double getBolsa(){
        return bolsa;
    }
}