public class ContaCorrente extends Conta{
    
    private double taxaTransacao;
    
    
    public ContaCorrente(String cliente, double saldo, double taxaTransacao){
        super(cliente, saldo);
        this.taxaTransacao= taxaTransacao;
    }
    
    public String getTipo(){
        return "Conta Corrente";
    }
    
    public double getTaxaTransacao(){
        return taxaTransacao;
    }
    
    public void setTaxaTransacao(double taxaTransacao){
        this.taxaTransacao= taxaTransacao;
    }
    
    public void depositar (double valor){
        if (valor > 0){
            setSaldo(getSaldo() + valor - (taxaTransacao*valor));
            getHistorico().add("\nDepositou R$ "+valor);
        }
    }
    public boolean sacar(double valor) {
        if (getSaldo() >= valor && valor > 0){
            setSaldo(getSaldo() - valor - (taxaTransacao*valor));
            getHistorico().add("\nSacou R$ "+valor);
            return true;
        }
        return false;
    }
    
}